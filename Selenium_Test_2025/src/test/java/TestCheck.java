import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheck {

    @Test
    public void test1() {
        System.out.println("Test 1");
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
        Assert.fail();
    }
}
