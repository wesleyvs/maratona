package controllers;

import play.*;
import play.mvc.*;

import java.io.IOException;
import java.util.*;
import models.*;

public class Application extends Controller {
	public static void maratona() {
        render();
    }
    
    public static void index() {
        render();
    }
    
    public static List<Solution> solutions= new ArrayList<>();
    public static Integer aux=0;
    
    public static StringBuilder concatenar(List<Solution> solutions) throws IOException {
    	Date d = new Date();
    	lst.append("Nome: "+ solutions.get(aux).getFilename() + "\n");
    	lst.append("Problema: "+ solutions.get(aux).getProblem().toUpperCase() + "\n");
    	lst.append("Data: "+ d + "\n");
    	Validar validar = new Validar();
    	if(solutions.get(aux).getProblem().equals("A")) {
    		validar.validacaoA();
    	} else {
    		validar.validacaoB();
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
}