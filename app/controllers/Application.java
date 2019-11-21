package controllers;

import play.*;
import play.mvc.*;

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
    public static String lista="------------------------------------\n";
    
    public static String concatenar(List<Solution> solutions) {
    	Date d = new Date();
		lista += "Nome: "+ solutions.get(aux).getFilename() + "\n";
		lista += "Problema: "+ solutions.get(aux).getProblem() + "\n";
		lista += "Data: "+ d + "\n";
		lista += "Status: Success";
		lista += "\n------------------------------------\n";
		aux++;
    	return lista;
    }

	public static void show(Solution solution) {
    	solutions.add(solution);
    	String lista = Application.concatenar(solutions);
    	render(lista);
    }    
}