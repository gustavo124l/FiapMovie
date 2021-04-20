import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public abstract class BorderFactory {

    public static Border criar(){
        return new LineBorder(new Color(0,0,92));
    }
}