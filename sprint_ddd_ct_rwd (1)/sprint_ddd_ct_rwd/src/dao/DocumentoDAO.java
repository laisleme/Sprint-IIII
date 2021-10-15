package br.com.codeyo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.codeyo.beans.Documento;
import br.com.codeyo.conexao.ConexaoFactory;

public class DocumentoDAO {
	static Connection conexao;

	public DocumentoDAO() throws Exception {
		conexao = new ConexaoFactory().getConnection();
	}

	/*
	 * Cadastrar----------------------------------------------------------- --------
	 */
	public static boolean cadastrar(Documento codeYo) throws Exception {

		boolean resultado = false;
		try {
			String sql = "insert into DOCUMENTO (caminhoSelfie, caminhoComprovanteEndereco, caminhoDocumentoIdentFrente, caminhoDocumentoIdentVerso ) values (?,?,?,?)";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getCaminhoSelfie());
			estrutura.setString(2, codeYo.getCaminhoComprovanteEndereco());
			estrutura.setString(3, codeYo.getCaminhoDocumentoIdentFrente());
			estrutura.setString(4, codeYo.getCaminhoDocumentoIdentVerso());
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
			String sql = "delete from DOCUMENTO WHERE id=(?)";
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
	public static boolean alterar(Documento codeYo) throws Exception {
		boolean resultado = false;
		try {
			String sql = "update DOCUMENTO set caminhoComprovanteEndereco = ? WHERE id = ?";
			Connection conexao;
			conexao = new ConexaoFactory().getConnection();
			PreparedStatement estrutura = conexao.prepareStatement(sql);
			estrutura.setString(1, codeYo.getCaminhoSelfie());
			estrutura.setString(2, codeYo.getCaminhoComprovanteEndereco());
			estrutura.setString(3, codeYo.getCaminhoDocumentoIdentFrente());
			estrutura.setString(4, codeYo.getCaminhoDocumentoIdentVerso());
			estrutura.execute();
			estrutura.close();
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
