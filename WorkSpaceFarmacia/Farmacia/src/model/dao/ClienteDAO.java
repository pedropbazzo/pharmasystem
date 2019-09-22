package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Cliente;
import util.Conexao;

public class ClienteDAO {
	
	public static Cliente cadastrarCliente(String nome, String telefone, String email, String sexo, String cpf, String rg, String situacao, String nascimento) {
		
		Cliente cliente = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "INSERT INTO cliente (nome, telefone, email, sexo, cpf, rg, situacao, nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, nome);
			stmt.setString(2, telefone);
			stmt.setString(3, email);
			stmt.setString(4, sexo);
			stmt.setString(5, cpf);
			stmt.setString(6, rg);
			stmt.setString(7, situacao);
			stmt.setString(8, nascimento);

			if(stmt.executeUpdate()>0){
				cliente = new Cliente(nome, telefone, email, sexo, cpf, rg, situacao, nascimento);

				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					cliente.setCodigoCliente((rs.getInt(1)));
				}
				
				rs.close();
			}

			con.close();
			stmt.close();
			

		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return cliente;
	}
	
	public static List<Cliente> consultarTodosCliente() {
		
		List<Cliente> lista = new LinkedList<>();
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM cliente";
		
		try {
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){
				Cliente c = new Cliente();
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));
				c.setSexo(rs.getString("sexo"));
				c.setCpf(rs.getString("cpf"));
				c.setRg(rs.getString("rg"));
				c.setSituacao(rs.getString("situacao"));
				c.setNascimento(rs.getString("nascimento"));
				
				lista.add(c);
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
	
	public static Cliente buscarPorCodCliente(int codCliente){
		
		Cliente cliente = null;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();
		
		String sql = "SELECT * FROM cliente WHERE codCliente = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, codCliente);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				cliente = new Cliente();
				cliente.setNome(rs.getString("nome"));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEmail(rs.getString("email"));
				cliente.setSexo(rs.getString("sexo"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				cliente.setSituacao(rs.getString("situacao"));
				cliente.setNascimento(rs.getString("nascimento"));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao acessar o banco de dados.");
			System.out.println("Verifique sua instrução SQL");
			System.out.println("Mensagem: "+e.getMessage());
		}
		
		return cliente;
	}
	
	public static boolean excluirCliente(int codCliente){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "DELETE FROM cliente WHERE codCliente = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, codCliente);
			
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
	
	public static boolean atualizarCliente(String nome, String telefone, String email, String sexo, String cpf, String rg, String situacao, String nascimento){
		
		boolean ok = false;
		Conexao conexao = new Conexao();
		Connection con = conexao.obterConexao();

		String sql = "UPDATE cliente set nome = ?, telefone = ?, email = ?, sexo = ?, cpf = ?, rg = ?, situacao = ?, nascimento = ? WHERE codCliente = ?";

		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, telefone);
			stmt.setString(3, email);
			stmt.setString(4, sexo);
			stmt.setString(5, sexo);
			stmt.setString(6, cpf);
			stmt.setString(7, rg);
			stmt.setString(8, situacao);
			stmt.setString(9, nascimento);
			
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


/*import conexoes.ConexaoMySql;
import model.ModelCliente;
import java.util.ArrayList;
*//**
*
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e cÃ³digo fonte
*//*
public class DAOCliente extends ConexaoMySql {

    *//**
    * grava Cliente
    * @param pModelCliente
    * return int
    *//*
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO clientes ("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCidade() + "',"
                    + "'" + pModelCliente.getUf() + "',"
                    + "'" + pModelCliente.getCep() + "',"
                    + "'" + pModelCliente.getTelefone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    *//**
    * recupera Cliente
    * @param pCodigo
    * return ModelCliente
    *//*
    public ModelCliente getClienteDAO(int pCodigo){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " clientes"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
   *//**
    * recupera Cliente
    * @param pNome
    * return ModelCliente
    *//*
    public ModelCliente getClienteDAO(String pNome){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " clientes"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }


    *//**
    * recupera uma lista de Cliente
        * return ArrayList
    *//*
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " clientes"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    *//**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    *//*
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE clientes SET "
                    + "codigo = '" + pModelCliente.getCodigo() + "',"
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "uf = '" + pModelCliente.getUf() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "'"
                + " WHERE "
                    + "codigo = '" + pModelCliente.getCodigo() + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    *//**
    * exclui Cliente
    * @param pCodigo
    * return boolean
    *//*
    public boolean excluirClienteDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM clientes "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}*/