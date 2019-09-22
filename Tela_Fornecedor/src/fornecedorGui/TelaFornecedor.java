package fornecedorGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFornecedor frame = new TelaFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFornecedor() {
		setFont(new Font("Tahoma", Font.BOLD, 13));
		setTitle("Cadastro Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores");
		lblCadastroDeFornecedores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeFornecedores.setBounds(216, 13, 217, 16);
		contentPane.add(lblCadastroDeFornecedores);
		
		JLabel jtfNome = new JLabel("Nome:");
		jtfNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtfNome.setBounds(28, 45, 67, 16);
		contentPane.add(jtfNome);
		
		JLabel jtfCnpj = new JLabel("CNPJ:");
		jtfCnpj.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtfCnpj.setBounds(28, 90, 56, 16);
		contentPane.add(jtfCnpj);
		
		JLabel jtfTelefone = new JLabel("Telefone:");
		jtfTelefone.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtfTelefone.setBounds(28, 131, 81, 16);
		contentPane.add(jtfTelefone);
		
		JLabel jtfEmail = new JLabel("Email:");
		jtfEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtfEmail.setBounds(28, 173, 56, 16);
		contentPane.add(jtfEmail);
		
		textField = new JTextField();
		textField.setBounds(91, 43, 392, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 88, 183, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 129, 159, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 171, 535, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = jtfNome.getText();
				String cnpj = jtfCnpj.getText();
				String telefone = jtfTelefone.getText();
				String email = jtfEmail.getText();
				
				
				
			}
		});
		btnCadastrar.setForeground(Color.BLUE);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCadastrar.setBounds(46, 293, 166, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setForeground(Color.GREEN);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConsultar.setBounds(276, 295, 157, 25);
		contentPane.add(btnConsultar);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAlterar.setBounds(499, 295, 126, 25);
		contentPane.add(btnAlterar);
		
		JButton btnNewButton = new JButton("EXCLUIR");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(293, 359, 129, 25);
		contentPane.add(btnNewButton);
	}
}
