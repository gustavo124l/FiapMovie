import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MeuTextField extends JTextField {

    private static final long serialVersionUID = 1L;

    public MeuTextField() {
        super();
        init();
    }

    private void init(){
        this.setPreferredSize(new Dimension(200,10));
        this.setBackground(Color.WHITE);
        this.setForeground(new Color(0,0,92));
        this.setBorder(new LineBorder(new Color(0,0,92)));
    }
}