import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import pachet.Blabla;

@RunWith(BlockJUnit4ClassRunner.class)
public class BlablaTest {
    @Test
    public void doSomething_input13_shouldReturn130() {
        int result = new Blabla("Crap").doSomething(13);
        Assert.assertEquals("Wrong",130, result);
    }
    @Test
    public  void entertainMe_divide(){
        int division = new Blabla("Ceva").entertainMe(9);
        Assert.assertEquals("Nope!", 3, division);
    }
    @Test
    public void getNothing(){
        int actual = 7-7;
        Assert.assertEquals("That is actually something", 0, actual);
    }
}


