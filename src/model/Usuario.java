package model;

public abstract class Usuario {
	
	private String login;
	private String senha;
	private int tipo;
	private String descricao;
	
	public Usuario(){
		super();
	}

	public Usuario(String login, String senha, int tipo, String descricao) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract void mostrar();

}
