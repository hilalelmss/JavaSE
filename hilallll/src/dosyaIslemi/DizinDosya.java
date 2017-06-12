package dosyaIslemi;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DizinDosya {

	public File dosyaAl(String path) {
		File file = new File(path);
		if (file.exists())
			if (file.isFile())
				return file;
		return null;
	}

	public List<String> oku(File file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
		
		List<String> myList = new ArrayList<>();
		while (scanner.hasNextLine()) {
			myList.add(scanner.nextLine());
		}
		return myList;
	}
	
	
	
	

	public void yaz() {

	}

}
