package dosyaIslemi.veriTabanýOkuma.streamYazýcý;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Yazici {
	
	public void yaz(File file, byte[] b) {
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			stream.write(b);
			stream.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
