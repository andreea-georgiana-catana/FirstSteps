import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import pachet.TestAppEnv;

public class TestAppEnvTest {
    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns Hard Coded Url", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        Assert.assertEquals("Just the Domain", "http://192.123.0.3", TestAppEnv.DOMAIN);
        Assert.assertEquals("Just the Port", "67", TestAppEnv.PORT);
    }
}
