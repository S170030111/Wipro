package com.wipro.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOStreams2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String inputFilename ="C:\\Users\\prasad\\eclipse-workspace\\WTN\\src\\com\\wipro\\IOStreams\\input";
		String outputFilename = "C:\\Users\\prasad\\eclipse-workspace\\WTN\\src\\com\\wipro\\IOStreams\\output";
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
		sc.close();
	}
}