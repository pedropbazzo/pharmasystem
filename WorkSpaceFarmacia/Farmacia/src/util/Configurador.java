package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurador {
	private String idioma;
	private String regiao;
	private String arquivoAjuda;
	private String url;
	private String driver;
	private String login;
	private String senha;
	
	public Configurador() throws IOException {
		FileInputStream arq = new FileInputStream("config.ini");
		
		Properties propriedades = new Properties();
		
		propriedades.load(arq);
		
		arq.close();
		
		idioma = propriedades.getProperty("idioma");
		regiao = propriedades.getProperty("regiao");
		arquivoAjuda = propriedades.getProperty("ajuda");
		url = propriedades.getProperty("url");
		driver = propriedades.getProperty("driver");
		login = propriedades.getProperty("login");
		senha = propriedades.getProperty("senha");
		
	}
	
	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return driver;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getIdioma() {
		return idioma;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public String getArquivoAjuda() {
		return arquivoAjuda;
	}
	
}