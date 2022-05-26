
package tencentcloud.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets GroupType
 */
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GroupType fromValue(String value) {
    for (GroupType b : GroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

