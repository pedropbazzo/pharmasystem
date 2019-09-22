package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Funcionario;
import util.Conexao;

public class FuncionarioDAO {
	
	public static Funcionario cadastrarFuncionario(String login , String senha, int tipo, String descricao, int matricula, String nome, String telefone, String email, String sexo, String cpf, String rg, String nascimento, double salario) {
		
		Funcionario funcionario = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "INSERT INTO funcionario (login, senha, tipo, descricao, matricula, nome, telefone, email, sexo, cpf, rg, nascimento, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			stmt.setInt(3, tipo);
			stmt.setString(4, descricao);
			stmt.setInt(5, matricula);
			stmt.setString(6, nome);
			stmt.setString(7, telefone);
			stmt.setString(8, email);
			stmt.setString(9, sexo);
			stmt.setString(10, cpf);
			stmt.setString(11, rg);
			stmt.setString(12, nascimento);
			stmt.setDouble(13, salario);

			stmt.executeUpdate();
			
			funcionario = new Funcionario(login, senha, tipo, descricao, matricula, nome, telefone, email, sexo, cpf, rg, nascimento, salario);

			con.close();
			stmt.close();
			

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return funcionario;
	}
	
	public static List<Funcionario> consultarTodosFuncionario() {
		
		List<Funcionario> lista = new LinkedList<>();
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM funcionario";
		
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){
				Funcionario f = new Funcionario();
				f.setMatricula(rs.getInt("matricula"));
				f.setNome(rs.getString("nome"));
				f.setTelefone(rs.getString("telefone"));
				f.setEmail(rs.getString("email"));
				f.setSexo(rs.getString("sexo"));
				f.setCpf(rs.getString("cpf"));
				f.setRg(rs.getString("rg"));
				f.setNascimento(rs.getString("nascimento"));
				f.setSalario(rs.getDouble("salario"));
				
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
	
	public static Funcionario buscarPorMatricula(int matricula){
		
		Funcionario funcionario = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM funcionario WHERE matricula = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, matricula);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				funcionario = new Funcionario();
				funcionario.setNome(rs.getString("nome"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setSexo(rs.getString("sexo"));
				funcionario.setCpf(rs.getString("cpf"));
				funcionario.setRg(rs.getString("rg"));
				funcionario.setNascimento(rs.getString("nascimento"));
				funcionario.setSalario(rs.getDouble("salario"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return funcionario;
	}
	
	public static boolean excluirFuncionario(int matricula){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "DELETE FROM funcionario WHERE matricula = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, matricula);
			
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
	
	public static boolean atualizarCliente(String nome, String telefone, String email, String sexo, String cpf, String rg, String nascimento, double salario){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "UPDATE cliente SET nome = ?, telefone = ?, email = ?, sexo = ?, cpf = ?, rg = ?, nascimento = ?, salario = ? WHERE matricula = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, telefone);
			stmt.setString(3, email);
			stmt.setString(4, sexo);
			stmt.setString(5, sexo);
			stmt.setString(6, cpf);
			stmt.setString(7, rg);
			stmt.setString(8, nascimento);
			stmt.setDouble(9, salario);
			
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