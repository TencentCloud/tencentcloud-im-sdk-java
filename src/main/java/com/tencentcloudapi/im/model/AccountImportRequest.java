
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountImportRequest
 */
@JsonPropertyOrder({
  AccountImportRequest.JSON_PROPERTY_USER_I_D,
  AccountImportRequest.JSON_PROPERTY_NICK,
  AccountImportRequest.JSON_PROPERTY_FACE_URL
})

public class AccountImportRequest {
  public static final String JSON_PROPERTY_USER_I_D = "UserID";
  private String userID;

  public static final String JSON_PROPERTY_NICK = "Nick";
  private String nick;

  public static final String JSON_PROPERTY_FACE_URL = "FaceUrl";
  private String faceUrl;

  public AccountImportRequest() { 
  }

  public AccountImportRequest userID(String userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * 用户名，长度不超过32字节
   * @return userID
  **/
  @javax.annotation.Nonnull
  @NotNull
 @Size(max=32)  @ApiModelProperty(required = true, value = "用户名，长度不超过32字节")
  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserID() {
    return userID;
  }


  @JsonProperty(JSON_PROPERTY_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserID(String userID) {
    this.userID = userID;
  }


  public AccountImportRequest nick(String nick) {
    
    this.nick = nick;
    return this;
  }

   /**
   * 用户昵称
   * @return nick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户昵称")
  @JsonProperty(JSON_PROPERTY_NICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNick() {
    return nick;
  }


  @JsonProperty(JSON_PROPERTY_NICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNick(String nick) {
    this.nick = nick;
  }


  public AccountImportRequest faceUrl(String faceUrl) {
    
    this.faceUrl = faceUrl;
    return this;
  }

   /**
   * 用户头像 URL
   * @return faceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户头像 URL")
  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFaceUrl() {
    return faceUrl;
  }


  @JsonProperty(JSON_PROPERTY_FACE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceUrl(String faceUrl) {
    this.faceUrl = faceUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountImportRequest accountImportRequest = (AccountImportRequest) o;
    return Objects.equals(this.userID, accountImportRequest.userID) &&
        Objects.equals(this.nick, accountImportRequest.nick) &&
        Objects.equals(this.faceUrl, accountImportRequest.faceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, nick, faceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountImportRequest {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    nick: ").append(toIndentedString(nick)).append("\n");
    sb.append("    faceUrl: ").append(toIndentedString(faceUrl)).append("\n");
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

