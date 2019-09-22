package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TelaBalconista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBalconista frame = new TelaBalconista();
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
	public TelaBalconista() {
		setTitle("Balconista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 774, 551);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Busca de cliente", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(206, 9, 50, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(266, 6, 206, 20);
		panel.add(textField);
		textField.setColumns(25);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Obtém o nome do cliente do textField e pesquisa no banco.
				//Joga os valores obtidos na tabela
			}
		});
		btnBuscar.setBounds(482, 5, 80, 23);
		panel.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 57, 750, 400);
		panel.add(scrollPane);
		
		table = new JTable(){
			public boolean isCellEditable(int row, int column){  
		        return false;  
		      }
		};
		scrollPane.setViewportView(table);
		table.setBorder(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				},
			new String[] {
				"C\u00F3digoCliente", "Nome", "Endere\u00E7o", "Telefone", "E-mail"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		
		JButton btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Vendas.cliente recebe o cliente selecionado
			}
		});
		btnSelecionarCliente.setBounds(300, 477, 140, 23);
		panel.add(btnSelecionarCliente);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastroCliente();
				CadastroCliente.main(null);
			}
		});
		btnCadastrarCliente.setBounds(620, 5, 140, 23);
		panel.add(btnCadastrarCliente);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Busca de produto", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Nome: ");
		label.setBounds(206, 9, 50, 14);
		panel_1.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 6, 206, 20);
		textField_1.setColumns(25);
		panel_1.add(textField_1);
		
		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Obtém o nome do produto do textField e pesquisa no banco.
				//Joga os valores obtidos na tabela
			}
		});
		button.setBounds(482, 5, 80, 23);
		panel_1.add(button);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(10, 57, 749, 400);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable(){
			public boolean isCellEditable(int row, int column){  
		        return false;  
		      }
		};
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"C\u00F3digo", "Nome", "Marca", "Valor", "Descri\u00E7\u00E3o"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(120);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(200);
		table_1.setBorder(null);
		
		JButton button_1 = new JButton("Adicionar ao pedido");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Instancia um novo item de pedido do produto selecionado e adiciona à lista em Vendas
			}
		});
		button_1.setBounds(222, 478, 195, 23);
		panel_1.add(button_1);
		
		JButton btnFinalizarPedido = new JButton("Finalizar pedido");
		btnFinalizarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Finaliza o objeto Vendas e prepara para uso pelo caixa
			}
		});
		btnFinalizarPedido.setBounds(558, 478, 145, 23);
		panel_1.add(btnFinalizarPedido);
		
		
	}
}
