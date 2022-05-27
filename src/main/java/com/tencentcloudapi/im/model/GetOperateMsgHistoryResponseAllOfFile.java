
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
 * GetOperateMsgHistoryResponseAllOfFile
 */
@JsonPropertyOrder({
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_U_R_L,
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_EXPIRE_TIME,
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_FILE_SIZE,
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_FILE_M_D5,
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_GZIP_SIZE,
  GetOperateMsgHistoryResponseAllOfFile.JSON_PROPERTY_GZIP_M_D5
})
@JsonTypeName("GetOperateMsgHistoryResponse_allOf_File")

public class GetOperateMsgHistoryResponseAllOfFile {
  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_EXPIRE_TIME = "ExpireTime";
  private String expireTime;

  public static final String JSON_PROPERTY_FILE_SIZE = "FileSize";
  private Integer fileSize;

  public static final String JSON_PROPERTY_FILE_M_D5 = "FileMD5";
  private String fileMD5;

  public static final String JSON_PROPERTY_GZIP_SIZE = "GzipSize";
  private Integer gzipSize;

  public static final String JSON_PROPERTY_GZIP_M_D5 = "GzipMD5";
  private String gzipMD5;

  public GetOperateMsgHistoryResponseAllOfFile() { 
  }

  public GetOperateMsgHistoryResponseAllOfFile URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * 消息记录文件下载地址
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "消息记录文件下载地址")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }


  public GetOperateMsgHistoryResponseAllOfFile expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取")
  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpireTime() {
    return expireTime;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public GetOperateMsgHistoryResponseAllOfFile fileSize(Integer fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * GZip 压缩前的文件大小（单位 Byte）
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip 压缩前的文件大小（单位 Byte）")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public GetOperateMsgHistoryResponseAllOfFile fileMD5(String fileMD5) {
    
    this.fileMD5 = fileMD5;
    return this;
  }

   /**
   * GZip 压缩前的文件 MD5
   * @return fileMD5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip 压缩前的文件 MD5")
  @JsonProperty(JSON_PROPERTY_FILE_M_D5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileMD5() {
    return fileMD5;
  }


  @JsonProperty(JSON_PROPERTY_FILE_M_D5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileMD5(String fileMD5) {
    this.fileMD5 = fileMD5;
  }


  public GetOperateMsgHistoryResponseAllOfFile gzipSize(Integer gzipSize) {
    
    this.gzipSize = gzipSize;
    return this;
  }

   /**
   * GZip 压缩后的文件大小（单位 Byte）
   * @return gzipSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip 压缩后的文件大小（单位 Byte）")
  @JsonProperty(JSON_PROPERTY_GZIP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGzipSize() {
    return gzipSize;
  }


  @JsonProperty(JSON_PROPERTY_GZIP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGzipSize(Integer gzipSize) {
    this.gzipSize = gzipSize;
  }


  public GetOperateMsgHistoryResponseAllOfFile gzipMD5(String gzipMD5) {
    
    this.gzipMD5 = gzipMD5;
    return this;
  }

   /**
   * GZip 压缩后的文件 MD5
   * @return gzipMD5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GZip 压缩后的文件 MD5")
  @JsonProperty(JSON_PROPERTY_GZIP_M_D5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGzipMD5() {
    return gzipMD5;
  }


  @JsonProperty(JSON_PROPERTY_GZIP_M_D5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGzipMD5(String gzipMD5) {
    this.gzipMD5 = gzipMD5;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperateMsgHistoryResponseAllOfFile getOperateMsgHistoryResponseAllOfFile = (GetOperateMsgHistoryResponseAllOfFile) o;
    return Objects.equals(this.URL, getOperateMsgHistoryResponseAllOfFile.URL) &&
        Objects.equals(this.expireTime, getOperateMsgHistoryResponseAllOfFile.expireTime) &&
        Objects.equals(this.fileSize, getOperateMsgHistoryResponseAllOfFile.fileSize) &&
        Objects.equals(this.fileMD5, getOperateMsgHistoryResponseAllOfFile.fileMD5) &&
        Objects.equals(this.gzipSize, getOperateMsgHistoryResponseAllOfFile.gzipSize) &&
        Objects.equals(this.gzipMD5, getOperateMsgHistoryResponseAllOfFile.gzipMD5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, expireTime, fileSize, fileMD5, gzipSize, gzipMD5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperateMsgHistoryResponseAllOfFile {\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileMD5: ").append(toIndentedString(fileMD5)).append("\n");
    sb.append("    gzipSize: ").append(toIndentedString(gzipSize)).append("\n");
    sb.append("    gzipMD5: ").append(toIndentedString(gzipMD5)).append("\n");
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

