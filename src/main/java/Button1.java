import javax.swing.*;
import java.awt.*;

/**
 * Created by lizhaofu on 2017/6/5.
 */
public class Button1 extends JFrame {
    private JButton
            b1 = new JButton("Button 1"),
            b2 = new JButton("Button 2");
    public Button1(){
        setLayout(new FlowLayout());
        int i = 9;
        add(b1);
        int a = 0;
        add(b2);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button1(),200,100);
    }




}
