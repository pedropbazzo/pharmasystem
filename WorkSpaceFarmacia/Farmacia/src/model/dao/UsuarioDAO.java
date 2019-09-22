package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Usuario;
import util.Conexao;

public class UsuarioDAO {
	
	public static Usuario cadastrarUsuario(String login , String senha, int tipo, int descricao){
		
		Usuario usuario = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "INSERT INTO usuario (login, senha, tipo, descricao) VALUES (?, ?, ?, ?)";
		
		try {

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			stmt.setInt(3, tipo);
			stmt.setInt(4, descricao);

			stmt.executeUpdate();

			con.close();
			stmt.close();
			

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return usuario;
	}
	

	
	public static Usuario buscarPorLoginSenha(String login, String senha){
		
		Usuario usuario = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setTipo(rs.getInt("tipo"));
				usuario.setDescricao(rs.getString("descricao"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return usuario;
	}
	
	public static boolean excluirUsuario(String login, String senha){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "DELETE FROM usuario WHERE login = ? and senha = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
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
	
	public static boolean atualizarUsuario(String login , String senha, int tipo, int descricao){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "UPDATE usuario set login = ?, senha = ?, tipo = ?, descricao = ? WHERE  = ?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			stmt.setInt(3, tipo);
			stmt.setInt(4, descricao);
	
			
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
	
}