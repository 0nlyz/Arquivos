package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_and_BufferedReader {

	public static void main(String[] args) {

		// processo manual

		String path = "b:\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine(); // ler uma linha do arquivo

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
