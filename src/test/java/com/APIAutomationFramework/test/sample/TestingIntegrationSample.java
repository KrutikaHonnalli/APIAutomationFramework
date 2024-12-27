package com.APIAutomationFramework.test.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestingIntegrationSample
{
    //Integration testing for the booking API
    //1. Create the Booking
    //2. Get Token
    //3. VerifyBookingId
    //4. Update Booking
    //5. Delete Booking

    @Test(groups = "qa",priority=0)
    @Owner("Krutika")
    @Description("TC1: Verify that the booking is created")
    public void testCreateBooking()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority=1)
    @Owner("Krutika")
    @Description("TC1: Verify that the Created Booking ID")
    public void testVerifyBookingID()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority=2)
    @Owner("Krutika")
    @Description("TC1: Verify that the Updated Booking ID")
    public void testUpdateByBookingId()
    {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority=3)
    @Owner("Krutika")
    @Description("TC1: Verify that the Delete Booking ID")
    public void testDeleteBookById()
    {
        Assert.assertTrue(true);
    }
}
