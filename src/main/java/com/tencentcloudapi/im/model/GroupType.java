/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GroupType
 */
@JsonAdapter(GroupType.Adapter.class)
public enum GroupType {
  
  WORK("Work"),
  
  PRIVATE("Private"),
  
  PUBLIC("Public"),
  
  MEETING("Meeting"),
  
  CHATROOM("ChatRoom"),
  
  AVCHATROOM("AVChatRoom"),
  
  COMMUNITY("Community");

  private String value;

  GroupType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupType fromValue(String value) {
    for (GroupType b : GroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupType.fromValue(value);
    }
  }
}

