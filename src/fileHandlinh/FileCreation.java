package fileHandlinh;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f1= new File("C:\\Users\\Sharatkumar G Hulli\\Desktop\\FileHandling\\First.txt");
		if(f1.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("File not created...");
		}
	}

}
