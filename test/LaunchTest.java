import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class LaunchTest {
    @Test
    public void getLaunchFrameTest() {
        Launch launch = new Launch();
        JFrame launchFrame = launch.getLaunchFrame();

        Assert.assertEquals(true, launchFrame != null);
    }

    @Test
    public void launchProgramTest() {
        Launch launch = new Launch();
        launch.launchProgram();

        Assert.assertEquals(true, launch.getLaunchFrame().isShowing());
    }
}
