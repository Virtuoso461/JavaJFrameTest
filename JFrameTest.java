package Study;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class JFrameTest extends JFrame{

    JButton btn;
    JFrameTest() {
        super("这是JFrame的标题");

        setSize(600,500);

        btn = new JButton("这是一个按钮");
        Container container = getContentPane();
        container.add(btn);


        URL resource = JFrameTest.class.getResource("校标.png");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JFrameTest();
    }
}
