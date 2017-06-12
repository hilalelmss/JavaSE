package dosyaIslemi.veriTabanýOkuma.karakterBazlý;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazici {

	public void yaz(String path, String veri) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.println(veri);
		writer.close();
	}

	
	
	public void yaz(File file) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void yaz(String path,List<Person> personList) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (Person person : personList) {
			writer.println(person.getIsim()+ "* " + person.getSoyad());
			
		}
		
		writer.close();
	}
	
	
}
