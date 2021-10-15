package br.com.codeyo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

	public Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm87820", "170301");
	}
}
