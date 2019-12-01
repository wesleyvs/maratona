package controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import models.Busca;
import models.Solution;

public class Buscas {
	
	public static StringBuilder comparar(List<Solution> solutions, Busca search) throws IOException {
		Application application = new Application();
		StringBuilder lstBusca = new StringBuilder();
		StringBuilder vazio = new StringBuilder();
		int cont=0;
		
		for (int i = 0 ;i < solutions.size();i++) {
			if ((search.getTipo().equals("ID"))
					&& (search.getText().equals(solutions.get(i).getId()))) {
		    	lstBusca.append("ID: "+ solutions.get(i).getId() + "\n");
		    	lstBusca.append("Nome: "+ solutions.get(i).getFilename() + "\n");
		    	lstBusca.append("Problema: "+ solutions.get(i).getProblem().toUpperCase() + "\n");
		    	lstBusca.append("Data: "+ solutions.get(i).getData() + "\n");
		    	lstBusca.append("Status: "+ solutions.get(i).getStatus());
		    	lstBusca.append("\n\nCodigo: \n\n" + solutions.get(i).getSourcecode());
		    	cont++;	
		    }
			if ((search.getTipo().equals("Status"))
					&& (search.getText().equals(solutions.get(i).getStatus()))) {
				lstBusca.append("ID: "+ solutions.get(i).getId() + "\n");
		    	lstBusca.append("Nome: "+ solutions.get(i).getFilename() + "\n");
		    	lstBusca.append("Problema: "+ solutions.get(i).getProblem().toUpperCase() + "\n");
		    	lstBusca.append("Data: "+ solutions.get(i).getData() + "\n");
		    	lstBusca.append("Status: "+ solutions.get(i).getStatus());
		    	lstBusca.append("\n\nCodigo: \n\n" + solutions.get(i).getSourcecode());
		    	lstBusca.append("\n---------------------------------------------------------------------------------------------\n");
		    	cont++;
			}
			if ((search.getTipo().equals("Periodo"))
					&& (search.getText().equals(solutions.get(i).getData()))) {
				lstBusca.append("ID: "+ solutions.get(i).getId() + "\n");
		    	lstBusca.append("Nome: "+ solutions.get(i).getFilename() + "\n");
		    	lstBusca.append("Problema: "+ solutions.get(i).getProblem().toUpperCase() + "\n");
		    	lstBusca.append("Data: "+ solutions.get(i).getData() + "\n");
		    	lstBusca.append("Status: "+ solutions.get(i).getStatus());
		    	lstBusca.append("\n\nCodigo: \n\n" + solutions.get(i).getSourcecode());
		    	lstBusca.append("\n---------------------------------------------------------------------------------------------\n");
		    	cont++;
			}
		}
		
		if (cont == 0) {
			return lstBusca.append("Registro não encontrado!\n\n");
		}
		
		return lstBusca;
	}
}
