package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JTextField txtCodigoCliente;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtSexo;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtNascimento;
	private JTextField txtValorPago;
	private JTextField textField_9;
	private JTextField txtSituacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente cadCliente = new CadastroCliente();
					cadCliente.setVisible(true);
					cadCliente.setResizable(false);//Impede que a janela seja redimensionada
					cadCliente.setLocationRelativeTo(null);//Faz a janela aparecer no centro da tela

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 722, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 38, 686, 468);
		contentPane.add(panel);
		
		JLabel lblNomeCliente = new JLabel("Nome");
		lblNomeCliente.setBounds(247, 76, 46, 14);
		panel.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(247, 91, 86, 20);
		panel.add(txtNomeCliente);
		
		JLabel lblCodigoCliente = new JLabel("C\u00F3digo");
		lblCodigoCliente.setBounds(83, 76, 46, 14);
		panel.add(lblCodigoCliente);
		
		txtCodigoCliente = new JTextField();
		txtCodigoCliente.setText("");
		txtCodigoCliente.setColumns(10);
		txtCodigoCliente.setBounds(83, 91, 86, 20);
		panel.add(txtCodigoCliente);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(391, 76, 70, 14);
		panel.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(391, 91, 86, 20);
		panel.add(txtTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(523, 76, 82, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(523, 91, 86, 20);
		panel.add(txtEmail);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(83, 146, 70, 14);
		panel.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(83, 160, 86, 20);
		panel.add(txtSexo);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(250, 146, 114, 14);
		panel.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(247, 160, 86, 20);
		panel.add(txtCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(391, 146, 46, 14);
		panel.add(lblRg);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(391, 160, 86, 20);
		panel.add(txtRg);
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(83, 209, 86, 14);
		panel.add(lblNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(83, 222, 86, 20);
		panel.add(txtNascimento);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setBounds(247, 209, 75, 14);
		panel.add(lblValorPago);
		
		txtValorPago = new JTextField();
		txtValorPago.setColumns(10);
		txtValorPago.setBounds(247, 222, 86, 20);
		panel.add(txtValorPago);
		
		JLabel lblValorAPagar = new JLabel("Valor a Pagar");
		lblValorAPagar.setBounds(391, 209, 94, 14);
		panel.add(lblValorAPagar);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(391, 222, 86, 20);
		panel.add(textField_9);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/imagens/iconSave.png")));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setBounds(585, 11, 32, 32);
		panel.add(btnSalvar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(CadastroCliente.class.getResource("/imagens/iconExcluir.png")));
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setBounds(530, 11, 32, 32);
		panel.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/imagens/iconConsultar.png")));
		btnPesquisar.setToolTipText("Consultar");
		btnPesquisar.setBounds(476, 11, 32, 32);
		panel.add(btnPesquisar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(CadastroCliente.class.getResource("/imagens/iconAlterar.png")));
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.setBounds(418, 11, 32, 32);
		panel.add(btnAlterar);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		button_4.setBounds(545, 434, 89, 23);
		panel.add(button_4);
		
		JLabel lblSituacao = new JLabel("Situa\u00E7\u00E3o");
		lblSituacao.setBounds(523, 146, 86, 14);
		panel.add(lblSituacao);
		
		txtSituacao = new JTextField();
		txtSituacao.setColumns(10);
		txtSituacao.setBounds(523, 159, 86, 20);
		panel.add(txtSituacao);
		
		JLabel CadCliente = new JLabel("Cadastro de Cliente");
		CadCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CadCliente.setBounds(292, 11, 150, 14);
		contentPane.add(CadCliente);
		//pack();//Redimensionar a janela ao menor tamanho possível desde que caiba o seu conteúdo

		
		
		
		
		
	}
}
