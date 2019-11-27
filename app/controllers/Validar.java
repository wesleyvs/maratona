package controllers;

import play.*;
import play.mvc.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import models.*;

public class Validar{
	
	private static FileReader output;
	private static FileReader saidaEsperada;

	public static void criarArquivo(String conteudo) throws IOException {
		String nomeArquivo = "arquivo.py";
		File diretorio = new File("\\conf\\" + nomeArquivo);
	    FileWriter arquivo = new FileWriter("conf\\" + nomeArquivo, false);  
	    arquivo.write(conteudo);
	    arquivo.close();
	}
	
	public static void validacaoA() throws IOException {
		Application application = new Application();
		criarArquivo(application.solutions.get(application.aux).getSourcecode());
		
		ExecutarPython python = new ExecutarPython();
		python.gerarSaidaA();
		
		output = new FileReader("conf/outputA.txt");
		saidaEsperada = new FileReader("conf/saidaEsperadaA.txt");	
		
		if (output.read() == saidaEsperada.read()) {
			application.lst.append("Status: Success");
		} else {
			application.lst.append("Status: Fail");
		}
	}
	
	public static void validacaoB() throws IOException {
		Application application = new Application();
		criarArquivo(application.solutions.get(application.aux).getSourcecode());
		
		ExecutarPython python = new ExecutarPython();
		python.gerarSaidaB();
		
		output = new FileReader("conf/outputB.txt");
		saidaEsperada = new FileReader("conf/saidaEsperadaB.txt");	
		
		if (output.read() == saidaEsperada.read()) {
			application.lst.append("Status: Success");
		} else {
			application.lst.append("Status: Fail");
		}
	}
}
