import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class LaunchTest {
    @Test
    public void initLaunchFrameTest() {
        Launch launch = new Launch();
        JFrame launchFrame = launch.getLaunchFrame();

        Assert.assertEquals(true, launchFrame != null);
    }
}
