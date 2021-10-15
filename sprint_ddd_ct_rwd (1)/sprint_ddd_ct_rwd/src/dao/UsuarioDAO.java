package br.com.codeyo.dao;

import br.com.codeyo.conexao.*;
import java.sql.*;
import br.com.codeyo.beans.Usuario;

public class UsuarioDAO {

	static Connection conexao;

	public UsuarioDAO() throws Exception {
		conexao = new ConexaoFactory().getConnection();
	}

	/*
	 * Cadastrar----------------------------------------------------------- --------
	 */
	public static boolean cadastrar(Usuario codeYo) throws Exception {

		boolean resultado = false;
		try {
			String sql = "insert into USUARIO (nomeCompleto, dataNascimento, genero, cpf, nomeMae, email, numeroCelular, dataHoraCadastro, possuiNecessidadeVisual) values (?,?,?,?,?,?,?,?,?)";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getNomeCompleto());
			estrutura.setString(2, codeYo.getDataNascimento());
			estrutura.setString(3, codeYo.getGenero());
			estrutura.setString(4, codeYo.getCpf());
			estrutura.setString(5, codeYo.getNomeMae());
			estrutura.setString(6, codeYo.getEmail());
			estrutura.setString(7, codeYo.getNumeroCelular());
			estrutura.setString(8, codeYo.getDataHoraCadastro());
			estrutura.setBoolean(9, codeYo.getPossuiNecessidadeVisual());
			estrutura.execute();
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
	public static boolean deletar(String cpf) throws Exception {
		boolean resultado = false;
		try {
			String sql = "delete from usuario WHERE cpf=(?)";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, cpf);
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
	public static boolean alterar(Usuario codeYo) throws Exception 
	{
		boolean resultado = false;
		try {
			String sql = "update USUARUO set email = ? WHERE cpf = ?";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getNomeCompleto());
			estrutura.setString(2, codeYo.getDataNascimento());
			estrutura.setString(3, codeYo.getGenero());
			estrutura.setString(4, codeYo.getCpf());
			estrutura.setString(5, codeYo.getNomeMae());
			estrutura.setString(6, codeYo.getEmail());
			estrutura.setString(7, codeYo.getNumeroCelular());
			estrutura.setString(8, codeYo.getDataHoraCadastro());
			estrutura.setBoolean(9, codeYo.getPossuiNecessidadeVisual());
			estrutura.execute();
			estrutura.close();
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

}
