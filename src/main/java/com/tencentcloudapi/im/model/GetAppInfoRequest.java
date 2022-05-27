
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
 * GetAppInfoRequest
 */
@JsonPropertyOrder({
  GetAppInfoRequest.JSON_PROPERTY_REQUEST_FIELD
})

public class GetAppInfoRequest {
  public static final String JSON_PROPERTY_REQUEST_FIELD = "RequestField";
  private List<String> requestField = null;

  public GetAppInfoRequest() { 
  }

  public GetAppInfoRequest requestField(List<String> requestField) {
    
    this.requestField = requestField;
    return this;
  }

  public GetAppInfoRequest addRequestFieldItem(String requestFieldItem) {
    if (this.requestField == null) {
      this.requestField = new ArrayList<>();
    }
    this.requestField.add(requestFieldItem);
    return this;
  }

   /**
   * 该字段用来指定需要拉取的运营数据，不填默认拉取所有字段。详细可参阅下文 可拉取的运营字段（https://cloud.tencent.com/document/product/269/4193#operation）
   * @return requestField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该字段用来指定需要拉取的运营数据，不填默认拉取所有字段。详细可参阅下文 可拉取的运营字段（https://cloud.tencent.com/document/product/269/4193#operation）")
  @JsonProperty(JSON_PROPERTY_REQUEST_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRequestField() {
    return requestField;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestField(List<String> requestField) {
    this.requestField = requestField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppInfoRequest getAppInfoRequest = (GetAppInfoRequest) o;
    return Objects.equals(this.requestField, getAppInfoRequest.requestField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppInfoRequest {\n");
    sb.append("    requestField: ").append(toIndentedString(requestField)).append("\n");
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

