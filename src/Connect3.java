import javax.swing.*;
import java.awt.*;

public class Connect3 extends JFrame{
    public static GUI ui;
    public int[] column = new int[3];
    public int[] row = new int[3];

    private Connect3(){
        setTitle("Connect 3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null); // Centers in screen
        setLayout(new FlowLayout());
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // padding between edge of window
        setLayout(layout);

    }
    public static void main(String[] args) {new Connect3();}
}
