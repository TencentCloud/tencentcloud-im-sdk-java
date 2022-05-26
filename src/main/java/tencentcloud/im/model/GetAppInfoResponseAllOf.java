
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
import tencentcloud.im.model.GetAppInfoResponseAllOfResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetAppInfoResponseAllOf
 */
@JsonPropertyOrder({
  GetAppInfoResponseAllOf.JSON_PROPERTY_RESULT
})
@JsonTypeName("GetAppInfoResponse_allOf")

public class GetAppInfoResponseAllOf {
  public static final String JSON_PROPERTY_RESULT = "Result";
  private List<GetAppInfoResponseAllOfResult> result = null;

  public GetAppInfoResponseAllOf() { 
  }

  public GetAppInfoResponseAllOf result(List<GetAppInfoResponseAllOfResult> result) {
    
    this.result = result;
    return this;
  }

  public GetAppInfoResponseAllOf addResultItem(GetAppInfoResponseAllOfResult resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * 请求最近30天的运营数据
   * @return result
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "请求最近30天的运营数据")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetAppInfoResponseAllOfResult> getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(List<GetAppInfoResponseAllOfResult> result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppInfoResponseAllOf getAppInfoResponseAllOf = (GetAppInfoResponseAllOf) o;
    return Objects.equals(this.result, getAppInfoResponseAllOf.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppInfoResponseAllOf {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

