package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal telaPrincipal = new TelaPrincipal();
					telaPrincipal.setVisible(true);
					telaPrincipal.setResizable(false);//Impede que a janela seja redimensionada
					telaPrincipal.setLocationRelativeTo(null);//Faz com que a tela aparece centralizada
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 619);
		
		setExtendedState(MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//instancia a tela principal
				CadastroProduto cadProduto = new CadastroProduto();
				//chama a tela principal
				cadProduto.setVisible(true);
				cadProduto.setLocationRelativeTo(null);//faz a tela aparecer centralizada
			}
		});
		mnCadastro.add(mntmProduto);
		
		JMenuItem mntmCadCliente = new JMenuItem("Cliente");
		mntmCadCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//instancia a tela principal
				CadastroCliente cadCliente = new CadastroCliente();
				//chama a tela principal
				cadCliente.setVisible(true);
				cadCliente.setLocationRelativeTo(null);//faz a tela aparecer centralizada
				
			}
		});
		mnCadastro.add(mntmCadCliente);
		
		JMenuItem mntmCadFuncionario = new JMenuItem("Funcionário");
		mntmCadFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//instancia a tela principal
				CadastroFuncionario cadFucionario = new CadastroFuncionario();
				//chama a tela principal
				cadFucionario.setVisible(true);
				cadFucionario.setLocationRelativeTo(null);//faz a tela aparecer centralizada
				
			}
		});
		mnCadastro.add(mntmCadFuncionario);
		
		JMenuItem mntmCadFornecedores = new JMenuItem("Fornecedores");
		mnCadastro.add(mntmCadFornecedores);
		
		JMenu menuRelatorios = new JMenu("Relatórios");
		menuBar.add(menuRelatorios);
		
		JMenu menuFerramentas = new JMenu("Ferramentas");
		menuBar.add(menuFerramentas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 918, 64);
		contentPane.add(menuBar_1, BorderLayout.NORTH);
		
		JButton btnProdutos = new JButton("");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroProduto cadProduto = new CadastroProduto();
				cadProduto.setVisible(true);
				cadProduto.setResizable(false);//não deixa o usuário redimencionar a janela
				cadProduto.setLocationRelativeTo(null);//faz a tela aparecer centralizada
				
			}
		});
		menuBar_1.add(btnProdutos);
		btnProdutos.setToolTipText("Produtos");
		btnProdutos.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconProdutos.png")));
		
		
		//Botão de Clientes
		JButton btnClientes = new JButton("");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastroCliente cadCliente = new CadastroCliente();
				cadCliente.setVisible(true);
				cadCliente.setResizable(false);//não deixa o usuário redimencionar a janela
				cadCliente.setLocationRelativeTo(null);//faz a tela aparecer centralizada
				
				
			}
		});
		menuBar_1.add(btnClientes);
		btnClientes.setToolTipText("Clientes");
		btnClientes.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconClientes.png")));
		
		JButton btnFuncionarios = new JButton("");
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroFuncionario cadFuncionario = new CadastroFuncionario();
				cadFuncionario.setVisible(true);
				//redimencionamento não permitido
				cadFuncionario.setResizable(false);
				//Centralização da tela
				cadFuncionario.setLocationRelativeTo(null);
				
				
			}
		});
		btnFuncionarios.setToolTipText("Funcionários");
		menuBar_1.add(btnFuncionarios);
		btnFuncionarios.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconFuncionario.png")));
		
		JButton btnFornecedor = new JButton("");
		btnFornecedor.setToolTipText("Fornecedor");
		menuBar_1.add(btnFornecedor);
		btnFornecedor.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconFornecedor.png")));
		
		JButton btnSair = new JButton("");
		btnSair.setToolTipText("Sair");
		menuBar_1.add(btnSair);
		btnSair.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconSair.png")));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/fundo_telaprincipal.jpg")));
		label.setBounds(0, 61, 918, 498);
		contentPane.add(label, BorderLayout.CENTER);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
