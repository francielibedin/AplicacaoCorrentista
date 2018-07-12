package br.com.unicred.correntista.util;

import java.sql.*;

public class ConnectorSqlServer {

	private Connection conexao;
	private CallableStatement comando;

	public ConnectorSqlServer(String sql) throws SQLException {
		// preparar a conexao
		this.conexao = DriverManager.getConnection("conn... ");
		this.comando = conexao.prepareCall(sql);
	}

	public void close() throws SQLException {
		this.comando.close();
		this.conexao.close();
	}
	
	public void executar() throws SQLException {
		this.comando.executeUpdate();
	}
	
	public ResultSet obterLeitor() throws SQLException {
		return this.comando.executeQuery();
	}
	
	public void adicionarParametro(int posicao, int valor) throws SQLException {
		this.comando.setInt(posicao, valor);
	}
	
	public void adicionarParametro(int posicao, String valor) throws SQLException {
		this.comando.setString(posicao, valor);
	}
	
	public void adicionarParametroOut(int posicao) throws SQLException {
		this.comando.registerOutParameter(posicao, Types.VARCHAR);
	}

}
