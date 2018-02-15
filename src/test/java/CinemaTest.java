import org.junit.Assert;
import org.junit.Test;

public class CinemaTest {
    @Test
    public void calculationTest() {
        CurrentDay myDay = new CurrentDay();
        TotalPrice myPriceTest = new TotalPrice();
        if (myDay.getDate() == true) {
            Assert.assertEquals("Price was not Calculated Correctly when it is Wednesday", 34, myPriceTest.returnTotalPrice());
        } else {
            Assert.assertEquals("Price was not Calculated Correctly", 46, myPriceTest.returnTotalPrice());
        }
        System.out.println("Test Passed");

    }

    @Test
    public void calculationTestFail()
    {
        TotalPrice myPriceTest = new TotalPrice();
        Assert.assertEquals("Price was not Calculated Correctly", 24, myPriceTest.returnTotalPrice());
        System.out.println("Test Passed");
    }
}
