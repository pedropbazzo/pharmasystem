package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeProduto;
	private JTextField txtCodigoProduto;
	private JTextField txtValorCusto;
	private JTextField txtValorVenda;
	private JTextField txtDescricao;
	private JTextField txtdtFabricacao;
	private JTextField txtMarca;
	private JTextField txtFornecedor;
	private JTextField txtQuantidade;
	private JTextField txtVencimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto cadProduto = new CadastroProduto();
					cadProduto.setVisible(true);
					cadProduto.setResizable(false);//impede que a janela seja redimencionada
					cadProduto.setLocationRelativeTo(null);//faz a janela aparecer centralizada
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProduto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 722, 578);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCadProduto = new JPanel();
		panelCadProduto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCadProduto.setBounds(10, 58, 686, 468);
		contentPane.add(panelCadProduto);
		panelCadProduto.setLayout(null);
		
		JLabel lblNomeProduto = new JLabel("Nome");
		lblNomeProduto.setBounds(247, 76, 46, 14);
		panelCadProduto.add(lblNomeProduto);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(247, 91, 86, 20);
		panelCadProduto.add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		JLabel lblCodigoProduto = new JLabel("C\u00F3digo");
		lblCodigoProduto.setBounds(83, 76, 46, 14);
		panelCadProduto.add(lblCodigoProduto);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.setText("");
		txtCodigoProduto.setBounds(83, 91, 86, 20);
		panelCadProduto.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		
		JLabel lblValorCusto = new JLabel("Valor Custo");
		lblValorCusto.setBounds(391, 76, 70, 14);
		panelCadProduto.add(lblValorCusto);
		
		txtValorCusto = new JTextField();
		txtValorCusto.setBounds(391, 91, 86, 20);
		panelCadProduto.add(txtValorCusto);
		txtValorCusto.setColumns(10);
		
		JLabel lblValorVenda = new JLabel("Valor Venda");
		lblValorVenda.setBounds(523, 76, 82, 14);
		panelCadProduto.add(lblValorVenda);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setColumns(10);
		txtValorVenda.setBounds(523, 91, 86, 20);
		panelCadProduto.add(txtValorVenda);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(83, 146, 70, 14);
		panelCadProduto.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(83, 160, 250, 20);
		panelCadProduto.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDataFabricao = new JLabel("Data Fabrica\u00E7\u00E3o");
		lblDataFabricao.setBounds(394, 146, 114, 14);
		panelCadProduto.add(lblDataFabricao);
		
		txtdtFabricacao = new JTextField();
		txtdtFabricacao.setBounds(391, 160, 86, 20);
		panelCadProduto.add(txtdtFabricacao);
		txtdtFabricacao.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(523, 146, 46, 14);
		panelCadProduto.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(523, 160, 86, 20);
		panelCadProduto.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setBounds(83, 209, 86, 14);
		panelCadProduto.add(lblFornecedor);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setBounds(83, 222, 86, 20);
		panelCadProduto.add(txtFornecedor);
		txtFornecedor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantidade");
		lblNewLabel.setBounds(247, 209, 75, 14);
		panelCadProduto.add(lblNewLabel);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(247, 222, 86, 20);
		panelCadProduto.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblVencimento = new JLabel("Vencimento");
		lblVencimento.setBounds(391, 209, 94, 14);
		panelCadProduto.add(lblVencimento);
		
		txtVencimento = new JTextField();
		txtVencimento.setBounds(391, 222, 86, 20);
		panelCadProduto.add(txtVencimento);
		txtVencimento.setColumns(10);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconSave.png")));
		btnSalvar.setBounds(585, 11, 32, 32);
		panelCadProduto.add(btnSalvar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconExcluir.png")));
		btnExcluir.setToolTipText("Excluir");
		btnExcluir.setBounds(530, 11, 32, 32);
		panelCadProduto.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconConsultar.png")));
		btnPesquisar.setToolTipText("Consultar");
		btnPesquisar.setBounds(476, 11, 32, 32);
		panelCadProduto.add(btnPesquisar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(CadastroProduto.class.getResource("/imagens/iconAlterar.png")));
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.setBounds(418, 11, 32, 32);
		panelCadProduto.add(btnAlterar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			dispose();
			
			}
		});
		btnCancelar.setBounds(520, 221, 89, 23);
		panelCadProduto.add(btnCancelar);
		
		JLabel lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadastroDeProdutos.setBounds(292, 33, 150, 14);
		contentPane.add(lblCadastroDeProdutos);
	}
}
