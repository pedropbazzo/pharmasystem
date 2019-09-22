package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Endereco;
import model.DAO.EnderecoDAO;
import model.DAO.FornecedorDAO;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCnpj;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtEstado;
	private JTextField txtCep;
	private JTextField txtCidade;
	private JTextField txtComplemento;
	private JTextField txtLogradouro;

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
		setBounds(100, 100, 696, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores");
		lblCadastroDeFornecedores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeFornecedores.setBounds(216, 13, 217, 16);
		contentPane.add(lblCadastroDeFornecedores);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNome.setBounds(28, 40, 67, 16);
		contentPane.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCnpj.setBounds(430, 40, 56, 16);
		contentPane.add(lblCnpj);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelefone.setBounds(28, 89, 81, 16);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(28, 141, 56, 16);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(28, 57, 392, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(430, 56, 183, 22);
		contentPane.add(txtCnpj);
		txtCnpj.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(28, 108, 159, 22);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(28, 170, 535, 22);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					
				Endereco endereco = EnderecoDAO.cadastrarEndereco(txtLogradouro.getText(), txtNumero.getText(), txtComplemento.getText(), txtBairro.getText(), txtCidade.getText(), txtEstado.getText(), txtCep.getText());
				
				FornecedorDAO.inserir(txtNome.getText(), txtCnpj.getText(), txtTelefone.getText(), txtEmail.getText(),  endereco);
				
				
				
			}
		});
		btnCadastrar.setForeground(Color.BLUE);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCadastrar.setBounds(47, 490, 166, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setForeground(Color.BLACK);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConsultar.setBounds(263, 490, 157, 25);
		contentPane.add(btnConsultar);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setForeground(Color.BLACK);
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAlterar.setBounds(471, 490, 126, 25);
		contentPane.add(btnAlterar);
		
		JButton btnNewButton = new JButton("EXCLUIR");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(279, 554, 129, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogradouro.setBounds(28, 197, 97, 25);
		contentPane.add(lblLogradouro);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumero.setBounds(28, 278, 67, 14);
		contentPane.add(lblNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBairro.setBounds(28, 335, 65, 14);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstado.setBounds(446, 335, 65, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCep.setBounds(28, 394, 46, 14);
		contentPane.add(lblCep);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(28, 303, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(28, 363, 157, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(446, 363, 166, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(28, 419, 166, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCidade.setBounds(216, 335, 67, 14);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(216, 363, 192, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComplemento.setBounds(216, 276, 106, 19);
		contentPane.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(216, 303, 183, 20);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(28, 233, 535, 22);
		contentPane.add(txtLogradouro);
		txtLogradouro.setColumns(10);
	}
}