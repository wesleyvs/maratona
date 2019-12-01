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
	
	private static FileReader outputA1;
	private static FileReader outputA2;
	private static FileReader outputA3;
	private static FileReader saidaEsperadaA1;
	private static FileReader saidaEsperadaA2;
	private static FileReader saidaEsperadaA3;
	private static FileReader outputB1;
	private static FileReader outputB2;
	private static FileReader saidaEsperadaB1;
	private static FileReader saidaEsperadaB2;

	public static void criarArquivo(String conteudo) throws IOException {
		String nomeArquivo = "arquivo.py";
		File diretorio = new File("\\conf\\" + nomeArquivo);
	    FileWriter arquivo = new FileWriter("conf\\" + nomeArquivo, false);  
	    arquivo.write(conteudo);
	    arquivo.close();
	}
	
	public static String validacaoA() throws IOException {
		Application application = new Application();
		criarArquivo(application.solutions.get(application.aux).getSourcecode());
		
		ExecutarPython python = new ExecutarPython();
		python.gerarSaidaA1();
		python.gerarSaidaA2();
		python.gerarSaidaA3();
		
		outputA1 = new FileReader("conf/outputA1.txt");
		outputA2 = new FileReader("conf/outputA2.txt");
		outputA3 = new FileReader("conf/outputA3.txt");
		saidaEsperadaA1 = new FileReader("conf/saidaEsperadaA1.txt");
		saidaEsperadaA2 = new FileReader("conf/saidaEsperadaA2.txt");	
		saidaEsperadaA3 = new FileReader("conf/saidaEsperadaA3.txt");	
		
		if (outputA1.read() == saidaEsperadaA1.read() && outputA2.read() == saidaEsperadaA2.read() && outputA3.read() == saidaEsperadaA3.read()) {
			return "Success";
		} else {
			return "Fail";
		}
	}
	
	public static String validacaoB() throws IOException {
		Application application = new Application();
		criarArquivo(application.solutions.get(application.aux).getSourcecode());
		
		ExecutarPython python = new ExecutarPython();
		python.gerarSaidaB1();
		python.gerarSaidaB2();
		
		outputB1 = new FileReader("conf/outputB1.txt");
		outputB2 = new FileReader("conf/outputB2.txt");
		saidaEsperadaB1 = new FileReader("conf/saidaEsperadaB1.txt");
		saidaEsperadaB2 = new FileReader("conf/saidaEsperadaB2.txt");	
		
		if (outputB1.read() == saidaEsperadaB1.read() && outputB2.read() == saidaEsperadaB2.read()) {
			return "Success";
		} else {
			return "Fail";
		}
	}
}
