package br.com.unicred.correntista.service;

import br.com.unicred.correntista.model.*;
import br.com.unicred.correntista.dao.*;

// implemeta��es de regras
public class ClienteService {
	
	public boolean inserir(Cliente cliente) {
		
		//ifizera
		
		ClienteDao dao = new ClienteDao();
		return dao.inserir(cliente);
	}

}
