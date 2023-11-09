package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;

import JDBC.DAOInterface;
import entities.Pessoa;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private DAOInterface dao;

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
		frame.setBounds(100, 100, 537, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(182, 33, 239, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(100, 24, 82, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso:");
		lblNewLabel_1.setBounds(100, 91, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(182, 88, 93, 20);
		frame.getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:");
		lblNewLabel_2.setBounds(100, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(182, 142, 93, 20);
		frame.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton CadastrarPessoa = new JButton("Cadastrar");
		CadastrarPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				
				Pessoa nova = new Pessoa(nome, altura, peso);
				dao = new DAOPessoa();
				boolean resultado = dao.cadastrar(nova);
				if(resultado) {
					System.out.println("Pessoa cadastrada com Sucesso!");
				} else {
					System.out.println("Infelizmente não foi possível cadastrar a pessoa");
				}
			}
		});
		CadastrarPessoa.setBounds(100, 227, 321, 23);
		frame.getContentPane().add(CadastrarPessoa);
		
		JButton CalcularIMC = new JButton("Calcular IMC");
		CalcularIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				
				Pessoa p = new Pessoa(nome, altura, peso);
				double resultado = p.calculaIMC();
				if(resultado < 18) {
					System.out.println("IMC abaixo do peso!");
				} else if(resultado >= 18 && resultado <= 25) {
					System.out.println("IMC normal");
				} else {
					System.out.println("IMC acima do peso!");
				}
			}
		});
		CalcularIMC.setBounds(100, 293, 321, 23);
		frame.getContentPane().add(CalcularIMC);
	}
}