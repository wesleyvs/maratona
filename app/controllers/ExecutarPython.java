package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecutarPython {
	public static void gerarSaidaA() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputA.txt > conf/outputA.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}
	
	public static void gerarSaidaB() throws IOException {
		Process process = Runtime.getRuntime().exec("cmd.exe /c python conf/arquivo.py < conf/inputB.txt > conf/outputB.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String pythonOutput = in.readLine();
	}
}
