package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtMatricula;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtSalario;
	private JTextField txtNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 723, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionario = new JLabel("Cadastro de Funcion\u00E1rio");
		lblFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFuncionario.setBounds(292, 11, 173, 14);
		contentPane.add(lblFuncionario);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 38, 686, 468);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Nome");
		label_1.setBounds(247, 76, 46, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(247, 91, 86, 20);
		panel.add(textField);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula");
		lblMatricula.setBounds(83, 76, 46, 14);
		panel.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setText("");
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(83, 91, 86, 20);
		panel.add(txtMatricula);
		
		JLabel label_3 = new JLabel("Telefone");
		label_3.setBounds(391, 76, 70, 14);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(391, 91, 86, 20);
		panel.add(textField_2);
		
		JLabel label_4 = new JLabel("E-mail");
		label_4.setBounds(523, 76, 82, 14);
		panel.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(523, 91, 86, 20);
		panel.add(textField_3);
		
		JLabel label_5 = new JLabel("Sexo");
		label_5.setBounds(83, 146, 70, 14);
		panel.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(83, 160, 86, 20);
		panel.add(textField_4);
		
		JLabel label_6 = new JLabel("CPF");
		label_6.setBounds(250, 146, 114, 14);
		panel.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(247, 160, 86, 20);
		panel.add(textField_5);
		
		JLabel label_7 = new JLabel("RG");
		label_7.setBounds(391, 146, 46, 14);
		panel.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(391, 160, 86, 20);
		panel.add(textField_6);
		
		JLabel lblSalario = new JLabel("Sal\u00E1rio");
		lblSalario.setBounds(83, 209, 86, 14);
		panel.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(83, 222, 86, 20);
		panel.add(txtSalario);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(CadastroFuncionario.class.getResource("/imagens/iconSave.png")));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setBounds(585, 11, 32, 32);
		panel.add(btnSalvar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(CadastroFuncionario.class.getResource("/imagens/iconExcluir.png")));
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setBounds(530, 11, 32, 32);
		panel.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setIcon(new ImageIcon(CadastroFuncionario.class.getResource("/imagens/iconConsultar.png")));
		btnPesquisar.setToolTipText("Consultar");
		btnPesquisar.setBounds(476, 11, 32, 32);
		panel.add(btnPesquisar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(CadastroFuncionario.class.getResource("/imagens/iconAlterar.png")));
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.setBounds(418, 11, 32, 32);
		panel.add(btnAlterar);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
					
			}
		});
		button_4.setBounds(520, 221, 89, 23);
		panel.add(button_4);
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(523, 146, 86, 14);
		panel.add(lblNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(523, 159, 86, 20);
		panel.add(txtNascimento);
	}

}
