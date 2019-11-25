import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


public class IntegersTest {
    @Test
    public void  IntegerExploration() {
        Integer six = 6;
        Assert.assertEquals("intValue returns int 6", 6, six.intValue());

        Integer seven = 7;
        Assert.assertEquals("intValue returns int 7", 7, seven.intValue());
    }

    
}
