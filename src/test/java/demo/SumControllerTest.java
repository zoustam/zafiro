package demo;


import org.junit.Assert;
import org.junit.Test;


public class SumControllerTest {
	
    private SumController controller = new SumController();

    @Test
    public void testCalculator() throws Exception {
    	Long res = controller.sum(1l,2l);
    	
    	Assert.assertTrue(4 == res);
    }

}
