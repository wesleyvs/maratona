package controllers;

import play.*;
import play.mvc.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.omg.CORBA.Current;
import models.*;

public class Application extends Controller {
	public static void maratona() {
        render();
    }
    
    public static void index() {
        render();
    }
    
    public static List<Solution> solutions = new ArrayList<>();
    public static Integer aux=0;
    
    public static StringBuilder concatenar(List<Solution> solutions) throws IOException {
    	Date d = new Date();
    	String data = new SimpleDateFormat("dd/MM/yyyy").format(d);
    	String hora = new SimpleDateFormat("HH:mm").format(d);
    	lst.append("ID: "+ aux + "\n");
    	solutions.get(aux).setId(aux+"");
    	lst.append("Nome: "+ solutions.get(aux).getFilename() + "\n");
    	lst.append("Problema: "+ solutions.get(aux).getProblem().toUpperCase() + "\n");
    	solutions.get(aux).setData("" + data + " " +hora);
    	lst.append("Data: "+ solutions.get(aux).getData() + "\n");
    	Validar validar = new Validar();
    	if(solutions.get(aux).getProblem().toUpperCase().equals("A")) {
    		validar.validacaoA();
    		solutions.get(aux).setStatus(validar.validacaoA());
    		lst.append("Status: " + solutions.get(aux).getStatus());
    	} else {
    		validar.validacaoB();
    		solutions.get(aux).setStatus(validar.validacaoB());
    		lst.append("Status: " + solutions.get(aux).getStatus());
    	}
    	lst.append("\n------------------------------------\n");
		aux++;
    	return lst;
    }

    static StringBuilder lst = new StringBuilder();
    
	public static void show(Solution solution) throws IOException {
    	solutions.add(solution);
    	StringBuilder lst = Application.concatenar(solutions);
    	render(lst);
    }    
	
	
	
	
	
	
	public static void busca(Busca busca) throws IOException {
		StringBuilder lstBusca = Buscas.comparar(solutions, busca);
    	render(lstBusca);
    } 
}