import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame{


    private JComboBox<String> tipo;
    private JTextField txtMarca, txtAno, txtInfo;
    private JTextArea area;

    public Principal() {

      setTitle("Cadastro de Veiculos");
      setSize(700,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());


      JPanel p = new JPanel(new GridLayout(5,2));

      tipo = new JComboBox<>(new string []{"Automovél", "Furgão", "Caminhão", "Avião"});
      txtMarca = new JTextField();
      txtAno = new JTextField();
      txtInfo = new JTextField();

      p.add(new JLabel("Tipo")); p.add(tipo);
      p.add(new JLabel("Marca")); p.add(txtMarca);
      p.add(new JLabel("Ano")); p.add(txtAno);
      p.add(new JLabel("Info (Portas/Caarga/Passageiro")); p.add(tipo);

      JButton btCadastrar = new JButton(btLimpar);
      btLimpar.addA


      Veiculo carro = new Terrestre

        ("Fusca",
         2024,
          4);

        carro.exibirDados();

        Furgao f = new Furgao("Mercedes", 2023, 3);

         f.exibirDados(); 

  }
}
