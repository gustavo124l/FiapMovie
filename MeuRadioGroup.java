import javax.swing.*;
import java.util.List;

public class MeuRadioGroup extends JPanel {

    private static final long serialVersionUID = 1L;

    private List<String> opcoes;
    private ButtonGroup grupo = new ButtonGroup();

    public MeuRadioGroup(List<String>opcoes){
        this.opcoes = opcoes;
        init();
    }

    private void init() {
        opcoes.forEach(opcao ->{
            JRadioButton botao = new JRadioButton(opcao);
            this.add(botao);
            grupo.add(botao);
        });
    }
}