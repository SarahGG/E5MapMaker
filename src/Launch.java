import javax.swing.*;
import java.awt.*;

public class Launch {

    private JFrame launchFrame;

    Launch () {
        launchFrame = new JFrame("E5 Map Maker");
    }

    public void launchProgram() {
        launchFrame.setVisible(true);
    }

    public JFrame getLaunchFrame() {
        return launchFrame;
    }

}
