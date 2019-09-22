package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Fornecedor;
import util.Conexao;

public class FornecedorDAO {
	
	public static Fornecedor inserir(String nome, String cnpj, String telefone, String email) {
		
		Fornecedor fornecedor = null;
		
		Conexao conexao = new Conexao();			
		Connection con = conexao.obterConexao();
		
		String sql = "INSERT INTO fornecedor (nome, CNPJ, telefone, email) VALUES (?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, nome);
			stmt.setString(2, email);
			stmt.setString(3, telefone);
			stmt.setString(4, email);
			
			if(stmt.executeUpdate() > 0) {
				fornecedor = new Fornecedor(nome, cnpj, telefone, email);
				
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					fornecedor.setCodigoFornecedor(rs.getInt("codFornecedor"));
				}
				
				rs.close();
			}
			
			con.close();
			stmt.close();
			
		} catch(SQLException sqle) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: " + sqle.getMessage());
		}
		
		return fornecedor;		
	}

	public static List<Fornecedor> consultarTodosFornecedor() {
		
		List<Fornecedor> lista = new LinkedList<>();
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM fornecedor";
		
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){
				Fornecedor f = new Fornecedor();
				f.setNome(rs.getString("nome"));
				f.setCnpj(rs.getString("cnpj"));
				f.setTelefone(rs.getString("telefone"));
				f.setEmail(rs.getString("email"));
				
				lista.add(f);
			}
			
			rs.close();
			con.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return lista;
	}
	
	public static Fornecedor buscarPorCodFornecedor(int codFornecedor){
		
		Fornecedor fornecedor = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM fornecedor WHERE codFornecedor = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, codFornecedor);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				fornecedor = new Fornecedor();
				fornecedor.setNome(rs.getString("nome"));
				fornecedor.setNome(rs.getString("nome"));
				fornecedor.setNome(rs.getString("nome"));
				fornecedor.setNome(rs.getString("nome"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return fornecedor;
	}
	
	public static boolean excluirFornecedor(int codFornecedor){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "DELETE FROM fornecedor WHERE codFornecedor = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, codFornecedor);
			
			ok = stmt.executeUpdate()>0;

			con.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return ok;
	}
	
	public static boolean atualizarFornecedor(String nome, String cnpj, String telefone, String email){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "UPDATE fornecedor SET nome = ?, cnpj = ?, telefone = ?, email = ? WHERE codFornecedor = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, cnpj);
			stmt.setString(3, telefone);
			stmt.setString(4, email);
			
			ok = stmt.executeUpdate() > 0;

			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return ok;
	}

}