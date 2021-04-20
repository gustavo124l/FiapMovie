import javax.swing.*;

public class MeuTextArea extends JTextArea {

    private static final long serialVersionUID = 1L;

    private int colunas = 10;
    private int linhas = 3;

    public MeuTextArea() {
        super();
        init();
    }

    private void init() {
        this.setColumns(colunas);
        this.setRows(linhas);
        this.setBorder(BorderFactory.criar());
    }
}