
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImGetTagResponseAllOfUserTags
 */
@JsonPropertyOrder({
  ImGetTagResponseAllOfUserTags.JSON_PROPERTY_TO_ACCOUNT,
  ImGetTagResponseAllOfUserTags.JSON_PROPERTY_TAGS
})
@JsonTypeName("ImGetTagResponse_allOf_UserTags")

public class ImGetTagResponseAllOfUserTags {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_TAGS = "Tags";
  private List<String> tags = null;

  public ImGetTagResponseAllOfUserTags() { 
  }

  public ImGetTagResponseAllOfUserTags toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 用户帐号
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户帐号")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImGetTagResponseAllOfUserTags tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ImGetTagResponseAllOfUserTags addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags内容
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags内容")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetTagResponseAllOfUserTags imGetTagResponseAllOfUserTags = (ImGetTagResponseAllOfUserTags) o;
    return Objects.equals(this.toAccount, imGetTagResponseAllOfUserTags.toAccount) &&
        Objects.equals(this.tags, imGetTagResponseAllOfUserTags.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetTagResponseAllOfUserTags {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

