/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(com.tencentcloudapi.im.model.TIMMsgElement.class, new TypeSelector<com.tencentcloudapi.im.model.TIMMsgElement>() {
                    @Override
                    public Class<? extends com.tencentcloudapi.im.model.TIMMsgElement> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("TIMCustomElem", com.tencentcloudapi.im.model.TIMCustomElem.class);
                        classByDiscriminatorValue.put("TIMFaceElem", com.tencentcloudapi.im.model.TIMFaceElem.class);
                        classByDiscriminatorValue.put("TIMFileElem", com.tencentcloudapi.im.model.TIMFileElem.class);
                        classByDiscriminatorValue.put("TIMImageElem", com.tencentcloudapi.im.model.TIMImageElem.class);
                        classByDiscriminatorValue.put("TIMLocationElem", com.tencentcloudapi.im.model.TIMLocationElem.class);
                        classByDiscriminatorValue.put("TIMSoundElem", com.tencentcloudapi.im.model.TIMSoundElem.class);
                        classByDiscriminatorValue.put("TIMTextElem", com.tencentcloudapi.im.model.TIMTextElem.class);
                        classByDiscriminatorValue.put("TIMVideoFileElem", com.tencentcloudapi.im.model.TIMVideoFileElem.class);
                        classByDiscriminatorValue.put("TIMMsgElement", com.tencentcloudapi.im.model.TIMMsgElement.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "MsgType"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountCheckRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountCheckRequestCheckItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountCheckResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountCheckResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountCheckResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountDeleteRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountDeleteRequestDeleteItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountDeleteResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountDeleteResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountDeleteResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AccountImportRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AddGroupMemberRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AddGroupMemberRequestMemberListInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AddGroupMemberResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AddGroupMemberResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.AddGroupMemberResponseAllOfMemberList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BatchSendSingleChatMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BatchSendSingleChatMsgResponseAllOfErrorList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListAddRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListAddResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListAddResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListAddResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListCheckRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListCheckResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListCheckResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListCheckResponseAllOfBlackListCheckItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListDeleteRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListDeleteResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListDeleteResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListDeleteResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListGetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListGetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListGetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.BlackListGetResponseAllOfBlackListItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ChangeGroupOwnerRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ClearGroupAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.CommonResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.CreateGroupRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.CreateGroupRequestMemberListInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.CreateGroupResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.DefinedData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.DeleteGroupMemberRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.DeleteGroupMsgBySenderRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.DestroyGroupRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ForbidSendMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendAddRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendAddRequestAddFriendItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendAddResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendAddResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendAddResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendCheckRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendCheckResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendCheckResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendCheckResponseAllOfInfoItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteAllRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteAllResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendDeleteResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetListRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetListResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetListResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetListResponseAllOfInfoItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetListResponseAllOfSnsProfileItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendGetResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendImportRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendImportRequestAddFriendItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendImportRequestAddFriendItemInnerCustomItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendImportResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateRequestUpdateItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateRequestUpdateItemInnerSnsItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.FriendUpdateResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppInfoRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppInfoResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppInfoResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppInfoResponseAllOfResult.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppidGroupListRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppidGroupListResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppidGroupListResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetAppidGroupListResponseAllOfGroupIdList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetC2cUnreadMsgNumRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfC2CUnreadMsgNumList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetC2cUnreadMsgNumResponseAllOfErrorList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupAttrResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupAttrResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupAttrResponseAllOfGroupAttrAry.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupInfoRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupInfoRequestResponseFilter.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupInfoResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupInfoResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupInfoResponseAllOfGroupInfo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupMemberInfoRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupMemberInfoResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfAppMemberDefinedData.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupMemberInfoResponseAllOfMemberList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupShuttedUinRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupShuttedUinResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetGroupShuttedUinResponseAllOfShuttedUinList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetIPListResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetIPListResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetJoinedGroupListRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetJoinedGroupListRequestResponseFilter.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetJoinedGroupListResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetJoinedGroupListResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetJoinedGroupListResponseAllOfGroupIdList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetNoSpeakingRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetNoSpeakingResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetNoSpeakingResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOnlineMemberNumRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOnlineMemberNumResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOnlineMemberNumResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOperateMsgHistoryRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOperateMsgHistoryResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOperateMsgHistoryResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetOperateMsgHistoryResponseAllOfFile.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupDeleteResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupGetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRecentContactListGroupGetResponseAllOfSessionItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoamMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoamMsgResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoamMsgResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoamMsgResponseAllOfMsgList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoleInGroupRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoleInGroupResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoleInGroupResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GetRoleInGroupResponseAllOfUserIdList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupAddRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupAddResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupAddResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupAddResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupDeleteRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupDeleteResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupDeleteResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupGetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupGetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupGetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupGetResponseAllOfResultItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgGetSimpleRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgGetSimpleResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgGetSimpleResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgGetSimpleResponseAllOfRspMsgList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgRecallRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgRecallRequestMsgSeqListInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgRecallResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgRecallResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.GroupMsgRecallResponseAllOfRecallRetList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImAddTagRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrNameResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrNameResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetAttrResponseAllOfUserAttrs.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetTagRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetTagResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetTagResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImGetTagResponseAllOfUserTags.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImPushRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImPushRequestConditionInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImPushResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImPushResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImRemoveAllTagRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImRemoveAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImRemoveTagRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImRemoveTagRequestUserTagsInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImSetAttrNameRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImSetAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImageInfo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMemberRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMemberRequestMemberListInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMemberResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMemberResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMemberResponseAllOfMemberList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMsgRequestMsgListInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMsgResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMsgResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupMsgResponseAllOfImportMsgResult.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportGroupResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ImportMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.KickRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ModifyGroupAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ModifyGroupAttrRequestGroupAttrInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ModifyGroupBaseInfoRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ModifyGroupMemberInfoRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.ModifyGroupMemberInfoRequestAppMemberDefinedDataInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.MsgWithdrawRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.MultiAccountImportRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.MultiAccountImportResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.MultiAccountImportResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.OfflinePushInfo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.OfflinePushInfoAndroidInfo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.OfflinePushInfoApnsInfo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitGetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitGetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitGetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitGetResponseAllOfProfileItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitGetResponseAllOfUserProfileItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitSetRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitSetRequestProfileItemInner.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitSetResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.PortraitSetResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfDetail.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfErrorList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.QueryOnlineStatusResponseAllOfQueryResult.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendGroupMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendGroupMsgResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendGroupMsgResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendGroupSystemNotificationRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendSingleChatMsgRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendSingleChatMsgResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SendSingleChatMsgResponseAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SetGroupAttrRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SetMsgReadRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SetNoSpeakingRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.SetUnreadMsgNumRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMCustomElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMCustomElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMFaceElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMFaceElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMFileElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMFileElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMImageElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMImageElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMLocationElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMLocationElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMMsgElement.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMSoundElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMSoundElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMTextElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMTextElemMsgContent.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMVideoFileElem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.tencentcloudapi.im.model.TIMVideoFileElemMsgContent.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
