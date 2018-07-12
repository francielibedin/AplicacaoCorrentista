package br.com.unicred.correntista.dao;

import java.sql.SQLException;

import br.com.unicred.correntista.model.Cliente;
import br.com.unicred.correntista.util.*;

//	é onde persiste os dados
public class ClienteDao {
//	preciso inserir o cliente, recebe cliente pq ele tem todos os dados
	public boolean inserir(Cliente cliente) {
		
		String sql = "{call DBO.PR_INS_CLIENTE (?, ?, ?, ?)}";
		
		try {
			ConnectorSqlServer conn = new ConnectorSqlServer(sql);
			conn.adicionarParametro(1, cliente.getCodigo());
			conn.adicionarParametro(2, cliente.getNome());
			conn.adicionarParametro(3, cliente.getEndereco());
			conn.adicionarParametroOut(4);
			
			conn.executar();
			
			conn.close();
			
			return true;
		}
		catch(SQLException erroSQL){
			return false;
		}
		catch (Exception erro) {
			return false;
		}
	}

}
