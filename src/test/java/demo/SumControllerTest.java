package demo;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


//@RunWith(SpringRunner.class)
//@WebMvcTest  ->create only the web layers 
//@SpringBootTest  //we are asking for the whole application context to be created.
//@AutoConfigureMockMvc
public class SumControllerTest {
	
    @Autowired
    //Allows you, via a set of convenient builder classes, to send HTTP requests into the DispatcherServlet
    //Can be injected because we have used the annotations @SpringBootTest  and @AutoConfigureMockMvc
    //private MockMvc mvc;
    
    private SumController controller = new SumController();

    @Test
    public void testCalculator() throws Exception {
    	Long res = controller.sum(1l,2l);
    	
    	Assert.assertTrue(3 == res);
    }

}
