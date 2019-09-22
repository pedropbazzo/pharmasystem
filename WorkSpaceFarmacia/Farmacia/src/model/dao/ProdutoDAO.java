package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import model.Produto;
import util.Conexao;

public class ProdutoDAO {
	
	public static Produto cadastrarCliente(int codigo, String nome, double valor_custo, double valor_venda, String descricao, Date dataFabricacao, String marca, String fornecedor, int quantidade, Date vencimento) {
		
		Produto produto = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "INSERT INTO produto (codProduto, nome, valor_custo, valor_venda, descricao, dataFabricacao, marca, fornecedor, quantidade, vencimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.setString(2, nome);
			stmt.setDouble(3, valor_custo);
			stmt.setDouble(4,  valor_venda);
			stmt.setString(5, descricao);
			stmt.setDate(6, (java.sql.Date) dataFabricacao);
			stmt.setString(7, marca);
			stmt.setString(8, fornecedor);
			stmt.setInt(9, quantidade);
			stmt.setDate(10, (java.sql.Date) vencimento);
			
			stmt.executeUpdate();
				
			produto = new Produto(codigo, nome, valor_custo, valor_venda, descricao, dataFabricacao, marca, fornecedor, quantidade, vencimento);

			con.close();
			stmt.close();
			

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return produto;
	}

	public static List<Produto> consultarTodosProdutos() {
		
		List<Produto> lista = new LinkedList<>();
		Conexao conexao = new Conexao();			
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM produto";
		
		try {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codProduto"));
				p.setNome(rs.getString("nome"));
				p.setValorCusto(rs.getDouble("valor_custo"));
				p.setValorVenda(rs.getDouble("valor_venda"));
				p.setDescricao(rs.getString("descricao"));
				p.setDataFabricacao(rs.getDate("dataFabricacao"));
				p.setMarca(rs.getString("marca"));
				p.setFornecedor(rs.getString("fornecedor"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setVencimento(rs.getDate("vencimento"));
				
				lista.add(p);
			}
			
			con.close();
			rs.close();
			stmt.close();
			
		} catch(SQLException sqle) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: " + sqle.getMessage());
		}
		
		return lista;		
	}
	
	public static Produto buscarPorCodigo(int codProduto) {
		
		Produto produto = null;
	
		Conexao conexao = new Conexao();			
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM produto WHERE codProduto = ? LIMIT 1";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, codProduto);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codProduto"));
				p.setNome(rs.getString("nome"));
				p.setValorCusto(rs.getDouble("valor_custo"));
				p.setValorVenda(rs.getDouble("valor_venda"));
				p.setDescricao(rs.getString("descricao"));
				p.setDataFabricacao(rs.getDate("dataFabricacao"));
				p.setMarca(rs.getString("marca"));
				p.setFornecedor(rs.getString("fornecedor"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setVencimento(rs.getDate("vencimento"));
			}
			
			con.close();
			rs.close();
			stmt.close();
			
		} catch(SQLException sqle) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: " + sqle.getMessage());
		}
		
		return produto;		
	}
	
	public static boolean excluirProduto(int codProduto) {
		
		boolean ok = false;
	
		Conexao conexao = new Conexao();			
		Connection con = conexao.obterConexao();
		
		String sql = "DELETE FROM produto WHERE codProduto = ? LIMIT 1";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, codProduto);
			
			ok = stmt.executeUpdate() > 0;
			
			con.close();
			stmt.close();
			
		} catch(SQLException sqle) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: " + sqle.getMessage());
		}
		
		return ok;		
	}
	
	public static boolean atualizarProduto(String nome, double valor_custo, double valor_venda, String descricao, Date dataFabricacao, String marca, String fornecedor, int quantidade, Date vencimento) {
		
		boolean ok = false;
		
		Conexao conexao = new Conexao();			
		Connection con = conexao.obterConexao();
		
		String sql = "UPDATE produto SET nome = ?, valor_custo = ?, valor_venda = ?, descricao = ?, dataFabricacao = ?, marca = ?, fornecedor = ?, quantidade = ?, vencimento = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, nome);
			stmt.setDouble(2, valor_custo);
			stmt.setDouble(3,  valor_venda);
			stmt.setString(4, descricao);
			stmt.setDate(5, (java.sql.Date) dataFabricacao);
			stmt.setString(6, marca);
			stmt.setString(7, fornecedor);
			stmt.setInt(8, quantidade);
			stmt.setDate(9, (java.sql.Date) vencimento);
			
			ok = stmt.executeUpdate() > 0;
			
			con.close();
			stmt.close();
			
		} catch(SQLException sqle) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: " + sqle.getMessage());
		}
		
		return ok;
	}
	
}