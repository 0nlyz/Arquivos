package application;

import java.io.File;
import java.util.Scanner;

public class Informacoes_do_Caminho_do_Arquivo {

	public static void main(String[] args) {
		
		//Obtendo informações do caminho do arquivo
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Acessando apenas o nome do arquivo não o caminho completo
		
		System.out.println("getName: " + path.getName());
		
		//Acessando apenas o caminho do arquivo e não apenas o nome
		
		System.out.println("getParent: " + path.getParent());
		
		//Acessando o caminho todo
		
		System.out.println("getPath: " + path.getPath());
		
		
		
		
		sc.close();
		

	}

}
