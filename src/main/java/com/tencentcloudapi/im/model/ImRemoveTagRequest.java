
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.ImRemoveTagRequestUserTagsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImRemoveTagRequest
 */
@JsonPropertyOrder({
  ImRemoveTagRequest.JSON_PROPERTY_USER_TAGS
})

public class ImRemoveTagRequest {
  public static final String JSON_PROPERTY_USER_TAGS = "UserTags";
  private List<ImRemoveTagRequestUserTagsInner> userTags = new ArrayList<>();

  public ImRemoveTagRequest() { 
  }

  public ImRemoveTagRequest userTags(List<ImRemoveTagRequestUserTagsInner> userTags) {
    
    this.userTags = userTags;
    return this;
  }

  public ImRemoveTagRequest addUserTagsItem(ImRemoveTagRequestUserTagsInner userTagsItem) {
    this.userTags.add(userTagsItem);
    return this;
  }

   /**
   * 目标用户帐号列表
   * @return userTags
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "目标用户帐号列表")
  @JsonProperty(JSON_PROPERTY_USER_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ImRemoveTagRequestUserTagsInner> getUserTags() {
    return userTags;
  }


  @JsonProperty(JSON_PROPERTY_USER_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserTags(List<ImRemoveTagRequestUserTagsInner> userTags) {
    this.userTags = userTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImRemoveTagRequest imRemoveTagRequest = (ImRemoveTagRequest) o;
    return Objects.equals(this.userTags, imRemoveTagRequest.userTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImRemoveTagRequest {\n");
    sb.append("    userTags: ").append(toIndentedString(userTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

