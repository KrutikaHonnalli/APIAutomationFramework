package com.APIAutomationFramework.base;

import com.APIAutomationFramework.AssertClass.AssertAction;
import com.APIAutomationFramework.Endpoints.APIConstant;
import com.APIAutomationFramework.modules.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass
{
    public RequestSpecification Request;
    public AssertAction AssertObject;
    public PayloadManager PayloadObject;
    public JsonPath jsonObject;
    public Response ResponseObject;
    public ValidatableResponse ValidateData;

    @BeforeClass
    public void setUp()
    {
        System.out.println("Executing setUP");
        PayloadObject = new PayloadManager();
        AssertObject = new AssertAction();

       /* Request = RestAssured.given();
                    Request.baseUri(APIConstant.BaseUrl);
                    Request.contentType(ContentType.JSON);
                    Request.log().all();*/

        Request = RestAssured.given()
                .spec(new RequestSpecBuilder()
                        .setBaseUri(APIConstant.BaseUrl)
                        .setContentType(ContentType.JSON)
                        .build().log().all());

    }


}
