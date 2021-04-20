import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FiapMovie {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a aparencia");
        }

        JFrame frame = new JFrame("Fiap Movies");
        frame.setLayout(new BorderLayout());

        
       
		JPanel janela = new JPanel();
		janela.setLayout(new FlowLayout());
		JPanel painelBotao = new JPanel();
		janela.setLayout(new FlowLayout());
        
        
        JPanel imagem = new JPanel();
        imagem.setLayout(new FlowLayout());
        imagem.add(new JLabel(new ImageIcon("C:\\Users\\luiz_\\OneDrive\\Imagens\\Filme.jpg")));

        JPanel cadastro = new JPanel();
        MeuTextField tituloFilme = new MeuTextField();
        MeuTextArea sinopseFilme = new MeuTextArea();

        cadastro.setLayout(new GridLayout(6,0));
        cadastro.add(new MeuLabel("Titulo"));
        cadastro.add(tituloFilme);
        cadastro.add(new MeuLabel("Sinopse"));
        cadastro.add(sinopseFilme);
        cadastro.add(new MeuLabel("Genero"));
        String[] genero = {"Romance" , "Ação" , "Terror"};
        cadastro.setLayout(new GridLayout(2,0));
        cadastro.add(new JComboBox<String>(genero));
        

        JPanel plataforma = new JPanel();
        MeuCheckBox assistido = new MeuCheckBox("Assistido");
        StarRater avaliacaoEstrelas = new StarRater(5);

        plataforma.setLayout(new GridLayout(5,0));
        plataforma.add(new MeuLabel("Onde assistir"));
        List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Disney+");
        MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
        plataforma.add(group);
        plataforma.add(assistido);
        plataforma.add(new MeuLabel("Avaliação"));
        plataforma.add(avaliacaoEstrelas);

        JPanel botaoPanel = new JPanel();

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoCancelar = new JButton("Cancelar");
        BotaoListener listener = new BotaoListener(tituloFilme, sinopseFilme, group, assistido, avaliacaoEstrelas);

        botaoPanel.setLayout(new FlowLayout());
        botaoSalvar.addActionListener(listener);
        botaoPanel.add(botaoSalvar);
        botaoPanel.add(botaoCancelar);
        
		JTabbedPane abas = new JTabbedPane();
		abas.add("Inicio", janela);
		abas.add("Cadastro", new JPanel());
		abas.add("Perfil", new JPanel());
		
		frame.add(abas, BorderLayout.PAGE_START);
        frame.add(imagem, BorderLayout.LINE_START);
        frame.add(cadastro, BorderLayout.CENTER);
        frame.add(plataforma, BorderLayout.LINE_END);
        frame.add(botaoPanel, BorderLayout.SOUTH);

        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.pack();
    }
}