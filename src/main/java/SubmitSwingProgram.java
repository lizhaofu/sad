import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by lizhaofu on 2017/6/5.
 */
public class SubmitSwingProgram extends JFrame {
    JLabel label;
    public SubmitSwingProgram(){
        super("Hello Swing");
        label = new JLabel("A Label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
    }
    static SubmitSwingProgram ssp;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey! This is Different!");
            }
        });
    }

}
