package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecutarPython {
	/**
	 * TESTES B:
	 * ENTRADA 1: 1 1 0 
	 * ENTRADA 2: 0 0 0
	 * ENTRADA 3: 1 0 0
	 * 
	 * SAIDA ESPERADA 1: C
	 * SAIDA ESPERADA 2: * 
	 * SAIDA ESPERADA 3: A
	**/
	//Testando o teste 1 do problema A:
	public static void gerarSaidaA1() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputA1.txt > conf/outputA1.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}
	//Testando o teste 2 do problema A:
		public static void gerarSaidaA2() throws IOException {
			Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputA2.txt > conf/outputA2.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String pythonOutput = in.readLine();
	}
	//Testando o teste 3 do problema A:
	public static void gerarSaidaA3() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputA3.txt > conf/outputA3.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}
	
	/**
	 * TESTES B:
	 * ENTRADA 1: 5 3 3 1 5 
	 * ENTRADA 2: 6 6 1 3 2 5 4
	 * 
	 * SAIDA ESPERADA 1: 2 4
	 * SAIDA ESPERADA 2: * 
	**/
	//Testando o teste 1 do problema B:
	public static void gerarSaidaB1() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputB1.txt > conf/outputB1.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}	
	//Testando o teste 2 do problema B:
	public static void gerarSaidaB2() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputB2.txt > conf/outputB2.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}	
}
