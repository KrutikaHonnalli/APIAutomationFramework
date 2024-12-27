package com.APIAutomationFramework.AssertClass;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class AssertAction
{
    public void verifyResponseBody(String actual,String expected,String Description)
    {
        assertEquals(actual,expected);
    }

    public void verifyResponseBody(int actual,int expected,String Description)
    {
        assertEquals(actual,expected);
    }

    public void verifyStatusCode(Response response,Integer expected)
    {
       assertEquals(response.getStatusCode(),
               expected);
    }

    public void verifyStringKey(String KeyExcept,String KeyActual)
    {
        assertThat(KeyExcept).isNotEmpty().isNotNull();
        assertThat(KeyExcept).isNotBlank();
        assertThat(KeyExcept).isEqualTo(KeyActual);
    }
}
