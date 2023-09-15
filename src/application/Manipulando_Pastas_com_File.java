package application;

import java.io.File;
import java.util.Scanner;

public class Manipulando_Pastas_com_File {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); 
		
		/*(Fille::isDirectory) = Essa função especifica pra mim
		que é pra listar somente o que for diretorio ou pasta*/
		
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		/*(Fille::isFile) = Essa função lista pra mim somente arquivos*/
		
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		//Criando uma sub-pasta
		
		boolean success = new File(strPath + "\\qualquerNome").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		
		
		
		sc.close();
	}

}
