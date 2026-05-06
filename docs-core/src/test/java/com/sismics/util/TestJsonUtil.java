package com.sismics.util;

import jakarta.json.JsonValue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link JsonUtil}.
 */
public class TestJsonUtil {

    @Test
    public void testNullableStringNull() {
        Assert.assertEquals(JsonValue.NULL, JsonUtil.nullable((String) null));
    }

    @Test
    public void testNullableStringNonNull() {
        JsonValue result = JsonUtil.nullable("hello");
        Assert.assertNotNull(result);
        Assert.assertNotEquals(JsonValue.NULL, result);
        Assert.assertEquals("\"hello\"", result.toString());
    }

    @Test
    public void testNullableIntegerNull() {
        Assert.assertEquals(JsonValue.NULL, JsonUtil.nullable((Integer) null));
    }

    @Test
    public void testNullableIntegerNonNull() {
        JsonValue result = JsonUtil.nullable(42);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(JsonValue.NULL, result);
        Assert.assertEquals("42", result.toString());
    }

    @Test
    public void testNullableLongNull() {
        Assert.assertEquals(JsonValue.NULL, JsonUtil.nullable((Long) null));
    }

    @Test
    public void testNullableLongNonNull() {
        JsonValue result = JsonUtil.nullable(123456789L);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(JsonValue.NULL, result);
        Assert.assertEquals("123456789", result.toString());
    }
}
