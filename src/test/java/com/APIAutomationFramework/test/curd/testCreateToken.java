package com.APIAutomationFramework.test.curd;

import com.APIAutomationFramework.Endpoints.APIConstant;
import com.APIAutomationFramework.base.BaseClass;
import com.APIAutomationFramework.pojos.TokenResponse;
import com.google.gson.Gson;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class testCreateToken extends BaseClass
{
    @Owner("Krutika Kudte")
    @Test
    public void verifyCreateToken()
    {
        Request.basePath(APIConstant.Auth);
        ResponseObject = Request.when().body(PayloadObject.AuthPayload()).post();

        TokenResponse tokenresponseObject = PayloadObject.tokenResponse(ResponseObject.asString());

        System.out.println(tokenresponseObject.getToken());
    }
}
