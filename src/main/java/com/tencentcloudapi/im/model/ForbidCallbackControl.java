/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ForbidCallbackControl
 */
@JsonAdapter(ForbidCallbackControl.Adapter.class)
public enum ForbidCallbackControl {
  
  FORBIDBEFORESENDMSGCALLBACK("ForbidBeforeSendMsgCallback"),
  
  FORBIDAFTERSENDMSGCALLBACK("ForbidAfterSendMsgCallback");

  private String value;

  ForbidCallbackControl(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ForbidCallbackControl fromValue(String value) {
    for (ForbidCallbackControl b : ForbidCallbackControl.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ForbidCallbackControl> {
    @Override
    public void write(final JsonWriter jsonWriter, final ForbidCallbackControl enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ForbidCallbackControl read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ForbidCallbackControl.fromValue(value);
    }
  }
}

