package br.com.codeyo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.codeyo.beans.Endereco;
import br.com.codeyo.conexao.ConexaoFactory;

public class EnderecoDAO {

	static Connection conexao;

	public EnderecoDAO() throws Exception {
		conexao = new ConexaoFactory().getConnection();
	}

	/*
	 * Cadastrar----------------------------------------------------------- --------
	 */
	public static boolean cadastrar(Endereco codeYo) throws Exception {

		boolean resultado = false;
		try {
			String sql = "insert into ENDERECO (cep, uf, cidade, bairro, logradouro, numero, complemento) values (?,?,?,?,?,?,?)";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getCep());
			estrutura.setString(2, codeYo.getUf());
			estrutura.setString(3, codeYo.getCidade());
			estrutura.setString(4, codeYo.getBairro());
			estrutura.setString(5, codeYo.getLogradouro());
			estrutura.setString(6, codeYo.getNumero());
			estrutura.setString(7, codeYo.getComplemento());
			estrutura.close();
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/*
	 * EXCLUIR----------------------------------------------------------- --------
	 */
	public static boolean deletar(int identificacao) throws Exception {
		boolean resultado = false;
		try {
			String sql = "delete from ENDERECO WHERE id=(?)";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setInt(1, identificacao);
			estrutura.executeUpdate();
			estrutura.close();
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/*
	 * Alterar------------------------------------------------------------- ------
	 */
	public static boolean alterar(Endereco codeYo) throws Exception {
		boolean resultado = false;
		try {
			String sql = "update ENDERECO set cep = ? WHERE id = ?";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getCep());
			estrutura.setString(2, codeYo.getUf());
			estrutura.setString(3, codeYo.getCidade());
			estrutura.setString(4, codeYo.getBairro());
			estrutura.setString(5, codeYo.getLogradouro());
			estrutura.setString(6, codeYo.getNumero());
			estrutura.setString(7, codeYo.getComplemento());
			estrutura.execute();
			estrutura.close();
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
