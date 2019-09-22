package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;

public class TelaLogin extends JFrame {
	//variável global do painel
	private JPanel contentPane;
	//variável global do JTextField
	private JTextField txtLogin;
	//variável global do JPasswordField
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin telaLogin = new TelaLogin();
					telaLogin.setVisible(true);
					telaLogin.setResizable(false);//Impede que a janela seja redimensionada
					telaLogin.setLocationRelativeTo(null);//Faz a janela aparecer no centro da tela
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(249, 104, 58, 27);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(249, 146, 58, 17);
		contentPane.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(317, 106, 136, 27);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 142, 136, 27);
		contentPane.add(passwordField);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtLogin.getText().equalsIgnoreCase("admin") && passwordField.getText().equals("1234")){
					//instancia a tela principal
					TelaPrincipal tela = new TelaPrincipal();
					//chama a tela principal
					tela.setVisible(true);
					tela.setLocationRelativeTo(null);//faz a tela aparecer centralizada
					//fecha a tela anterior
					dispose();
				}else{
					JOptionPane.showMessageDialog(rootPane, "senha ou usuário inválidos");
				}
				
				
				
				
				
				
			}
		});
		
		
		btnAcessar.setBounds(249, 196, 89, 23);
		//adicionando o botão no painel
		contentPane.add(btnAcessar);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		//método para determinar a ação do botão 
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCancelar.setBounds(364, 196, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/Medico.png")));
		label_1.setBounds(69, 53, 151, 166);
		//adicionando a label no painel
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/fundotelaLogin.png")));
		label.setBounds(0, 0, 516, 308);
		//adicionando a label no painel
		contentPane.add(label);
	}
}
