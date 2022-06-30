/*
 * TIM SERVER REST API SDK
 * TIM REST API
 */


package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tencentcloudapi.im.model.TIMCustomElem;
import com.tencentcloudapi.im.model.TIMFaceElem;
import com.tencentcloudapi.im.model.TIMFileElem;
import com.tencentcloudapi.im.model.TIMImageElem;
import com.tencentcloudapi.im.model.TIMLocationElem;
import com.tencentcloudapi.im.model.TIMSoundElem;
import com.tencentcloudapi.im.model.TIMTextElem;
import com.tencentcloudapi.im.model.TIMVideoFileElem;
import com.tencentcloudapi.im.model.TIMVideoFileElemMsgContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.tencentcloudapi.im.JSON;


public class TIMMsgElement extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TIMMsgElement.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TIMMsgElement.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TIMMsgElement' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TIMCustomElem> adapterTIMCustomElem = gson.getDelegateAdapter(this, TypeToken.get(TIMCustomElem.class));
            final TypeAdapter<TIMFaceElem> adapterTIMFaceElem = gson.getDelegateAdapter(this, TypeToken.get(TIMFaceElem.class));
            final TypeAdapter<TIMFileElem> adapterTIMFileElem = gson.getDelegateAdapter(this, TypeToken.get(TIMFileElem.class));
            final TypeAdapter<TIMImageElem> adapterTIMImageElem = gson.getDelegateAdapter(this, TypeToken.get(TIMImageElem.class));
            final TypeAdapter<TIMLocationElem> adapterTIMLocationElem = gson.getDelegateAdapter(this, TypeToken.get(TIMLocationElem.class));
            final TypeAdapter<TIMSoundElem> adapterTIMSoundElem = gson.getDelegateAdapter(this, TypeToken.get(TIMSoundElem.class));
            final TypeAdapter<TIMTextElem> adapterTIMTextElem = gson.getDelegateAdapter(this, TypeToken.get(TIMTextElem.class));
            final TypeAdapter<TIMVideoFileElem> adapterTIMVideoFileElem = gson.getDelegateAdapter(this, TypeToken.get(TIMVideoFileElem.class));

            return (TypeAdapter<T>) new TypeAdapter<TIMMsgElement>() {
                @Override
                public void write(JsonWriter out, TIMMsgElement value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TIMCustomElem`
                    if (value.getActualInstance() instanceof TIMCustomElem) {
                        JsonObject obj = adapterTIMCustomElem.toJsonTree((TIMCustomElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMFaceElem`
                    if (value.getActualInstance() instanceof TIMFaceElem) {
                        JsonObject obj = adapterTIMFaceElem.toJsonTree((TIMFaceElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMFileElem`
                    if (value.getActualInstance() instanceof TIMFileElem) {
                        JsonObject obj = adapterTIMFileElem.toJsonTree((TIMFileElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMImageElem`
                    if (value.getActualInstance() instanceof TIMImageElem) {
                        JsonObject obj = adapterTIMImageElem.toJsonTree((TIMImageElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMLocationElem`
                    if (value.getActualInstance() instanceof TIMLocationElem) {
                        JsonObject obj = adapterTIMLocationElem.toJsonTree((TIMLocationElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMSoundElem`
                    if (value.getActualInstance() instanceof TIMSoundElem) {
                        JsonObject obj = adapterTIMSoundElem.toJsonTree((TIMSoundElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMTextElem`
                    if (value.getActualInstance() instanceof TIMTextElem) {
                        JsonObject obj = adapterTIMTextElem.toJsonTree((TIMTextElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TIMVideoFileElem`
                    if (value.getActualInstance() instanceof TIMVideoFileElem) {
                        JsonObject obj = adapterTIMVideoFileElem.toJsonTree((TIMVideoFileElem)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem");
                }

                @Override
                public TIMMsgElement read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TIMCustomElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMCustomElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMCustomElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMCustomElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMCustomElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMCustomElem'", e);
                    }

                    // deserialize TIMFaceElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMFaceElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMFaceElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMFaceElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMFaceElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMFaceElem'", e);
                    }

                    // deserialize TIMFileElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMFileElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMFileElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMFileElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMFileElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMFileElem'", e);
                    }

                    // deserialize TIMImageElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMImageElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMImageElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMImageElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMImageElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMImageElem'", e);
                    }

                    // deserialize TIMLocationElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMLocationElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMLocationElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMLocationElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMLocationElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMLocationElem'", e);
                    }

                    // deserialize TIMSoundElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMSoundElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMSoundElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMSoundElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMSoundElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMSoundElem'", e);
                    }

                    // deserialize TIMTextElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMTextElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMTextElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMTextElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMTextElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMTextElem'", e);
                    }

                    // deserialize TIMVideoFileElem
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TIMVideoFileElem.validateJsonObject(jsonObject);
                        actualAdapter = adapterTIMVideoFileElem;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TIMVideoFileElem'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TIMVideoFileElem failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TIMVideoFileElem'", e);
                    }

                    if (match == 1) {
                        TIMMsgElement ret = new TIMMsgElement();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TIMMsgElement: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TIMMsgElement() {
        super("oneOf", Boolean.FALSE);
    }

    public TIMMsgElement(TIMCustomElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMFaceElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMFileElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMImageElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMLocationElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMSoundElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMTextElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TIMMsgElement(TIMVideoFileElem o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TIMCustomElem", new GenericType<TIMCustomElem>() {
        });
        schemas.put("TIMFaceElem", new GenericType<TIMFaceElem>() {
        });
        schemas.put("TIMFileElem", new GenericType<TIMFileElem>() {
        });
        schemas.put("TIMImageElem", new GenericType<TIMImageElem>() {
        });
        schemas.put("TIMLocationElem", new GenericType<TIMLocationElem>() {
        });
        schemas.put("TIMSoundElem", new GenericType<TIMSoundElem>() {
        });
        schemas.put("TIMTextElem", new GenericType<TIMTextElem>() {
        });
        schemas.put("TIMVideoFileElem", new GenericType<TIMVideoFileElem>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TIMMsgElement.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TIMCustomElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMFaceElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMFileElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMImageElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMLocationElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMSoundElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMTextElem) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TIMVideoFileElem) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem");
    }

    /**
     * Get the actual instance, which can be the following:
     * TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem
     *
     * @return The actual instance (TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMCustomElem`. If the actual instance is not `TIMCustomElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMCustomElem`
     * @throws ClassCastException if the instance is not `TIMCustomElem`
     */
    public TIMCustomElem getTIMCustomElem() throws ClassCastException {
        return (TIMCustomElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMFaceElem`. If the actual instance is not `TIMFaceElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMFaceElem`
     * @throws ClassCastException if the instance is not `TIMFaceElem`
     */
    public TIMFaceElem getTIMFaceElem() throws ClassCastException {
        return (TIMFaceElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMFileElem`. If the actual instance is not `TIMFileElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMFileElem`
     * @throws ClassCastException if the instance is not `TIMFileElem`
     */
    public TIMFileElem getTIMFileElem() throws ClassCastException {
        return (TIMFileElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMImageElem`. If the actual instance is not `TIMImageElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMImageElem`
     * @throws ClassCastException if the instance is not `TIMImageElem`
     */
    public TIMImageElem getTIMImageElem() throws ClassCastException {
        return (TIMImageElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMLocationElem`. If the actual instance is not `TIMLocationElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMLocationElem`
     * @throws ClassCastException if the instance is not `TIMLocationElem`
     */
    public TIMLocationElem getTIMLocationElem() throws ClassCastException {
        return (TIMLocationElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMSoundElem`. If the actual instance is not `TIMSoundElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMSoundElem`
     * @throws ClassCastException if the instance is not `TIMSoundElem`
     */
    public TIMSoundElem getTIMSoundElem() throws ClassCastException {
        return (TIMSoundElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMTextElem`. If the actual instance is not `TIMTextElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMTextElem`
     * @throws ClassCastException if the instance is not `TIMTextElem`
     */
    public TIMTextElem getTIMTextElem() throws ClassCastException {
        return (TIMTextElem)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TIMVideoFileElem`. If the actual instance is not `TIMVideoFileElem`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TIMVideoFileElem`
     * @throws ClassCastException if the instance is not `TIMVideoFileElem`
     */
    public TIMVideoFileElem getTIMVideoFileElem() throws ClassCastException {
        return (TIMVideoFileElem)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TIMMsgElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TIMCustomElem
    try {
      TIMCustomElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMCustomElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMFaceElem
    try {
      TIMFaceElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMFaceElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMFileElem
    try {
      TIMFileElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMFileElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMImageElem
    try {
      TIMImageElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMImageElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMLocationElem
    try {
      TIMLocationElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMLocationElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMSoundElem
    try {
      TIMSoundElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMSoundElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMTextElem
    try {
      TIMTextElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMTextElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TIMVideoFileElem
    try {
      TIMVideoFileElem.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TIMVideoFileElem failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for TIMMsgElement with oneOf schemas: TIMCustomElem, TIMFaceElem, TIMFileElem, TIMImageElem, TIMLocationElem, TIMSoundElem, TIMTextElem, TIMVideoFileElem. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of TIMMsgElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TIMMsgElement
  * @throws IOException if the JSON string is invalid with respect to TIMMsgElement
  */
  public static TIMMsgElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TIMMsgElement.class);
  }

 /**
  * Convert an instance of TIMMsgElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

