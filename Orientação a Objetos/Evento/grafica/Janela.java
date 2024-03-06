package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Janela {

	private JFrame frame;
	private JTextField valorContribuicao;
	private JTextField MontanteRuy;
	private JTextField MontanteBarbosa;
	private JTextField PessoasRuy;
	private JTextField PessoasBarbosa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> partidosComboBox = new JComboBox<String>();
		partidosComboBox.setBounds(205, 30, 172, 22);
		frame.getContentPane().add(partidosComboBox);
		partidosComboBox.addItem("");
		partidosComboBox.addItem("Ruy");
		partidosComboBox.addItem("Barbosa");
		System.out.println(partidosComboBox.getSelectedIndex());
		
		JLabel lblNewLabel = new JLabel("Escolha o partido:");
		lblNewLabel.setBounds(10, 34, 131, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Contribuir = new JButton("Contribuir");
		Contribuir.setBounds(367, 75, 106, 23);
		frame.getContentPane().add(Contribuir);
		
		JLabel ValorContribuicao = new JLabel("Digite o valor da contribuição:");
		ValorContribuicao.setBounds(10, 111, 217, 14);
		frame.getContentPane().add(ValorContribuicao);
		
		valorContribuicao = new JTextField();
		valorContribuicao.setBounds(205, 108, 138, 20);
		frame.getContentPane().add(valorContribuicao);
		valorContribuicao.setColumns(10);
		
		JButton FinalizarEvento = new JButton("FINALIZAR EVENTO");
		FinalizarEvento.setBounds(160, 172, 217, 23);
		frame.getContentPane().add(FinalizarEvento);
		
		JLabel lblNewLabel_2 = new JLabel("Valor Partido Ruy");
		lblNewLabel_2.setBounds(10, 263, 131, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor Partido Barbosa");
		lblNewLabel_3.setBounds(10, 321, 131, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		MontanteRuy = new JTextField();
		MontanteRuy.setBounds(141, 260, 86, 20);
		frame.getContentPane().add(MontanteRuy);
		MontanteRuy.setColumns(10);
		
		MontanteBarbosa = new JTextField();
		MontanteBarbosa.setBounds(141, 318, 86, 20);
		frame.getContentPane().add(MontanteBarbosa);
		MontanteBarbosa.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("N° Pessoas");
		lblNewLabel_4.setBounds(271, 263, 106, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		PessoasRuy = new JTextField();
		PessoasRuy.setBounds(375, 260, 86, 20);
		frame.getContentPane().add(PessoasRuy);
		PessoasRuy.setColumns(10);
		
		PessoasBarbosa = new JTextField();
		PessoasBarbosa.setBounds(375, 318, 86, 20);
		frame.getContentPane().add(PessoasBarbosa);
		PessoasBarbosa.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("N° Pessoas");
		lblNewLabel_5.setBounds(271, 321, 106, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
