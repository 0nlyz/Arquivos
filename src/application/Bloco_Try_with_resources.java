package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bloco_Try_with_resources {

	public static void main(String[] args) {

		/*
		 * Bloco try-with-resources É um bloco que declar aum ou mais recursos, e
		 * garante que esses recursos serão fechados ao final do bloco
		 */

		String path = "b:\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // ler uma linha do arquivo

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
