package tests;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import restful.booker.Apis;
import restful.booker.BookingApis;

public class RestfulBookerTests {
    private SHAFT.API api;

    @Test
    public void test() {
        new BookingApis(api)
                //         .getBookingId("martina","ibrahim");
                .createBoking()
                .assertOnBookingCreated("martina")
                .DeleteBooking();
    }

    @BeforeClass
    public void setup() {
        api = new SHAFT.API(Apis.baseUrl);
        new Apis(api).login();
    }
}
