
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tencentcloudapi.im.model.GetOperateMsgHistoryResponseAllOfFile;
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
 * GetOperateMsgHistoryResponseAllOf
 */
@JsonPropertyOrder({
  GetOperateMsgHistoryResponseAllOf.JSON_PROPERTY_FILE
})
@JsonTypeName("GetOperateMsgHistoryResponse_allOf")

public class GetOperateMsgHistoryResponseAllOf {
  public static final String JSON_PROPERTY_FILE = "File";
  private List<GetOperateMsgHistoryResponseAllOfFile> _file = null;

  public GetOperateMsgHistoryResponseAllOf() { 
  }

  public GetOperateMsgHistoryResponseAllOf _file(List<GetOperateMsgHistoryResponseAllOfFile> _file) {
    
    this._file = _file;
    return this;
  }

  public GetOperateMsgHistoryResponseAllOf addFileItem(GetOperateMsgHistoryResponseAllOfFile _fileItem) {
    if (this._file == null) {
      this._file = new ArrayList<>();
    }
    this._file.add(_fileItem);
    return this;
  }

   /**
   * 消息记录文件下载信息
   * @return _file
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "消息记录文件下载信息")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetOperateMsgHistoryResponseAllOfFile> getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(List<GetOperateMsgHistoryResponseAllOfFile> _file) {
    this._file = _file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperateMsgHistoryResponseAllOf getOperateMsgHistoryResponseAllOf = (GetOperateMsgHistoryResponseAllOf) o;
    return Objects.equals(this._file, getOperateMsgHistoryResponseAllOf._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryResponseAllOf {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

