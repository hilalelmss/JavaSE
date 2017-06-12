package dosyaIslemi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dosyaIslemi.veriTabanýOkuma.StreamOkuyucu.Okuyucu;

public class TXT {
	public static void main(String[] args) {
		File file = new File("C:/eclipseDosya/Ogrenciler.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		char[] okunan = new char[(int) file.length()];
		try {
			reader.read(okunan);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(okunan);		
		
		String oku_string=new String(okunan);
		oku_string=oku_string.replace("\t", "---->>>");
		System.out.println(oku_string);
		
		FileWriter writer=null;
	try {
		writer=new FileWriter(new File("C:/eclipseDosya/Ogrenciler_son.txt"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		writer.write(oku_string);
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(oku_string);
	try {
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		writer.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}
}
