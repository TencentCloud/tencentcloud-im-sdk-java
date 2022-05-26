
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
import tencentcloud.im.model.ImportGroupMsgResponseAllOfImportMsgResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImportGroupMsgResponseAllOf
 */
@JsonPropertyOrder({
  ImportGroupMsgResponseAllOf.JSON_PROPERTY_IMPORT_MSG_RESULT
})
@JsonTypeName("ImportGroupMsgResponse_allOf")

public class ImportGroupMsgResponseAllOf {
  public static final String JSON_PROPERTY_IMPORT_MSG_RESULT = "ImportMsgResult";
  private List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult = null;

  public ImportGroupMsgResponseAllOf() { 
  }

  public ImportGroupMsgResponseAllOf importMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    
    this.importMsgResult = importMsgResult;
    return this;
  }

  public ImportGroupMsgResponseAllOf addImportMsgResultItem(ImportGroupMsgResponseAllOfImportMsgResult importMsgResultItem) {
    if (this.importMsgResult == null) {
      this.importMsgResult = new ArrayList<>();
    }
    this.importMsgResult.add(importMsgResultItem);
    return this;
  }

   /**
   * 具体的消息导入结果
   * @return importMsgResult
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "具体的消息导入结果")
  @JsonProperty(JSON_PROPERTY_IMPORT_MSG_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ImportGroupMsgResponseAllOfImportMsgResult> getImportMsgResult() {
    return importMsgResult;
  }


  @JsonProperty(JSON_PROPERTY_IMPORT_MSG_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportMsgResult(List<ImportGroupMsgResponseAllOfImportMsgResult> importMsgResult) {
    this.importMsgResult = importMsgResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportGroupMsgResponseAllOf importGroupMsgResponseAllOf = (ImportGroupMsgResponseAllOf) o;
    return Objects.equals(this.importMsgResult, importGroupMsgResponseAllOf.importMsgResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importMsgResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportGroupMsgResponseAllOf {\n");
    sb.append("    importMsgResult: ").append(toIndentedString(importMsgResult)).append("\n");
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

