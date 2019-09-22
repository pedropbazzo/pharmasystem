package model;

public class Administrador extends Usuario {
	
	private int matricula;
	
	public Administrador(){
		super();
	}

	public Administrador(String login, String senha, int tipo, String descricao) {
		super(login, senha, tipo, descricao);
	}

	public Administrador(String login, String senha, int tipo, String descricao, int matricula) {
		super(login, senha, tipo, descricao);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}