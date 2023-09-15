package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_and_BufferedWriter {

	public static void main(String[] args) {
		
		/*
		 * FileWriter é uma stream básica  de escrita de caracteres em arquivos
		 * (new FileWriter(path) = Cria/recria o arquivo
		 * (new FileWriter(path,true) = Acrescenta ao arquivo já existente
		 */
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "b:\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ /*está recriando o arquivo
			para não recriar basta colocar (path,true)*/
			for (String line : lines) {
				bw.write(line); //não tem quebra de linha
				bw.newLine(); //quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
