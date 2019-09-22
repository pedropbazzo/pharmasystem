package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private String url;
	private String driver;
	private String login;
	private String senha;
	
	public Conexao() {
		super();
		
		try {
			
			Configurador conf = new Configurador();
			this.url = conf.getUrl();
			this.driver = conf.getDriver();
			this.login = conf.getLogin();
			this.senha = conf.getSenha();
			Class.forName(driver);
			
		} catch (IOException e) {
			System.out.println("Erro ao carregar as configurações.");
			System.out.println("Mensagem: "+e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver.\nClasse não encontrada.");
			System.out.println("Mensagem: "+e.getMessage());
		}
	}
	
	public Connection obterConexao(){
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(this.url,this.login,this.senha);
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique os parâmetros de conexão.");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return con;
	}
	
}