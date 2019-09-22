package view;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Fornecedor;
import view.TM.FornecedorTableModel;

public class JanelaExibeMensagem extends JFrame{
	
	public JanelaExibeMensagem(List<Fornecedor> fornecedor){
		super("Janela Exibe Mensagem");
		
		JTable tabela = new JTable();
		FornecedorTableModel ctm = new FornecedorTableModel(fornecedores);
		tabela.setModel(ctm);
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(tabela);
		scroll.setSize(100, 200);
		
		add(scroll);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		setAlwaysOnTop(true);
	}
	
}
