package entities;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Janela {

	private JFrame frame;
	private JTextField txtCadastrarProduto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		frame.setBounds(100, 100, 1187, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Medicamento Comum");
		chckbxNewCheckBox.setBounds(248, 209, 176, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Medicamento Controlado");
		chckbxNewCheckBox_1.setBounds(254, 303, 170, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		txtCadastrarProduto = new JTextField();
		txtCadastrarProduto.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		txtCadastrarProduto.setHorizontalAlignment(SwingConstants.CENTER);
		txtCadastrarProduto.setText("Cadastrar Produto");
		txtCadastrarProduto.setBounds(248, 58, 566, 63);
		frame.getContentPane().add(txtCadastrarProduto);
		txtCadastrarProduto.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Medicamento Não Controlado");
		chckbxNewCheckBox_2.setBounds(248, 403, 176, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		textField = new JTextField();
		textField.setBounds(728, 210, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(728, 304, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(728, 404, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(652, 213, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preço");
		lblNewLabel_1.setBounds(652, 307, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setBounds(621, 407, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
