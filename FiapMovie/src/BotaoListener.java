import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotaoListener implements ActionListener, MouseListener {
    private MeuTextField tituloFilme;
    private MeuTextArea sinopseFilme;
    private MeuRadioGroup group;
    private MeuCheckBox assistido;
    private StarRater avaliacaoEstrelas;

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Título do filme: " + tituloFilme.getText() + "\nSinopse do Filme: " + sinopseFilme.getText()
        + "\nOnde assistir: " + group + "\nAssistido: " + assistido + "\nAvaliação: " + avaliacaoEstrelas.getSelection());
    }


    public BotaoListener(MeuTextField tituloFilme, MeuTextArea sinopseFilme, MeuRadioGroup group, MeuCheckBox assistido, StarRater avaliacaoEstrelas){
        this.tituloFilme = tituloFilme;
        this.sinopseFilme = sinopseFilme;
        this.group = group;
        this.assistido = assistido;
        this.avaliacaoEstrelas = avaliacaoEstrelas;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse in");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse out");
    }
}