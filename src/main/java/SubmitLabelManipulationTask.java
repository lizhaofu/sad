import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by lizhaofu on 2017/6/5.
 */
public class SubmitLabelManipulationTask {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("A Label");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Hey! This is Different!");
            }
        });
    }
}
