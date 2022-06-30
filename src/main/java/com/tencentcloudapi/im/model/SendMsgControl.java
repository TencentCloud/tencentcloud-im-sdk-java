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
 * Gets or Sets SendMsgControl
 */
@JsonAdapter(SendMsgControl.Adapter.class)
public enum SendMsgControl {
  
  NOLASTMSG("NoLastMsg"),
  
  NOUNREAD("NoUnread");

  private String value;

  SendMsgControl(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SendMsgControl fromValue(String value) {
    for (SendMsgControl b : SendMsgControl.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SendMsgControl> {
    @Override
    public void write(final JsonWriter jsonWriter, final SendMsgControl enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SendMsgControl read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SendMsgControl.fromValue(value);
    }
  }
}

