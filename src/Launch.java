import sun.net.www.content.image.png;

import javax.swing.*;
import java.awt.*;

public class Launch {

    private JFrame launchFrame;

    Launch () {
        launchFrame = new JFrame("E5 Map Maker");
    }

    public void launchProgram() {
        launchFrame.getContentPane().setBackground(Color.BLACK);
        launchFrame.setSize(400,400);
        launchFrame.setExtendedState(launchFrame.MAXIMIZED_BOTH);
        launchFrame.setDefaultCloseOperation(launchFrame.EXIT_ON_CLOSE);
        launchFrame.validate();
        

        launchFrame.setVisible(true);
    }

    public JFrame getLaunchFrame() {
        return launchFrame;
    }

}
