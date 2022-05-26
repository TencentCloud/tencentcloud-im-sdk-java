
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
 * Gets or Sets ForbidCallbackControl
 */
public enum ForbidCallbackControl {
  
  FORBIDBEFORESENDMSGCALLBACK("ForbidBeforeSendMsgCallback"),
  
  FORBIDAFTERSENDMSGCALLBACK("ForbidAfterSendMsgCallback");

  private String value;

  ForbidCallbackControl(String value) {
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
  public static ForbidCallbackControl fromValue(String value) {
    for (ForbidCallbackControl b : ForbidCallbackControl.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

