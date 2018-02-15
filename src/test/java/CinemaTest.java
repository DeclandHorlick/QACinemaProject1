import org.junit.Assert;
import org.junit.Test;

public class CinemaTest {
    @Test
    public void calculationTest() {
        CurrentDay myDay = new CurrentDay();
        TotalPrice myPriceTest = new TotalPrice();
        if (myDay.getDate() == true) {
            Assert.assertEquals("Price was not Calculated Correctly when it is Wednesday", 10, myPriceTest.returnTotalPrice(1,1,3,4));
        } else {
            Assert.assertEquals("Price was not Calculated Correctly", 8, myPriceTest.returnTotalPrice(1,0,0,0));
        }
        System.out.println("Test Passed");

    }

    @Test
    public void calculationTestFail()
    {
        //example failing
        TotalPrice myPriceTest = new TotalPrice();
        Assert.assertEquals("Price was not Calculated Correctly", 20, myPriceTest.returnTotalPrice(1,1,1,1));
        System.out.println("Test Passed");
    }
}
