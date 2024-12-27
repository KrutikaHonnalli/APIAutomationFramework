package com.APIAutomationFramework.test.curd;

import com.APIAutomationFramework.Endpoints.APIConstant;
import com.APIAutomationFramework.base.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class testPingRequest extends BaseClass
{
    @Owner("Krutika Kdte")
    @Description("Testing Ping request")
    @Test
    public void PingResponse()
    {
        Request.basePath(APIConstant.Ping);
        ResponseObject = Request.when().get();
        ValidateData = ResponseObject.then().log().all().statusCode(201);

    }

}
