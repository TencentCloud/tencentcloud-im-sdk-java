
package tencentcloud.im.model;

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
 * ImAddTagRequest
 */
@JsonPropertyOrder({
  ImAddTagRequest.JSON_PROPERTY_TO_ACCOUNT,
  ImAddTagRequest.JSON_PROPERTY_TAGS
})

public class ImAddTagRequest {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_TAGS = "Tags";
  private List<String> tags = new ArrayList<>();

  public ImAddTagRequest() { 
  }

  public ImAddTagRequest toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 目标用户帐号列表
   * @return toAccount
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "目标用户帐号列表")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImAddTagRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ImAddTagRequest addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 标签集合
   * @return tags
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "标签集合")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    ImAddTagRequest imAddTagRequest = (ImAddTagRequest) o;
    return Objects.equals(this.toAccount, imAddTagRequest.toAccount) &&
        Objects.equals(this.tags, imAddTagRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImAddTagRequest {\n");
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

