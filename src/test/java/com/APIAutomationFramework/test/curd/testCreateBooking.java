package com.APIAutomationFramework.test.curd;

import com.APIAutomationFramework.AssertClass.AssertAction;
import com.APIAutomationFramework.Endpoints.APIConstant;
import com.APIAutomationFramework.base.BaseClass;
import com.APIAutomationFramework.modules.PayloadManager;
import com.APIAutomationFramework.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testCreateBooking extends BaseClass
{
    @Owner("Krutika")
    @Description("Test case for the CrateBooking")
    @Test(priority = 1)
    public void verifyCreateBookingPost()
    {
        Request.basePath(APIConstant.Create_Update_BookingUrl);
        ResponseObject = Request.body(PayloadObject.CraeteBookingPayload()).post();
        ValidateData =ResponseObject.then().log().all();
        ValidateData.statusCode(200);

        BookingResponse bookingesponseObject = PayloadObject.bookingResponse(ResponseObject.asString());
        AssertObject.verifyStringKey(bookingesponseObject.getBooking().getFirstname(),"Jim");
    }
}
