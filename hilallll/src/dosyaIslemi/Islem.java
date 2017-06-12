package dosyaIslemi;

import java.io.File;

public class Islem {
	public static void main(String[] args) {
		File file = new File("C:/eclipseDosya/hilal");
		System.out.println(file.getParentFile().getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		String[] dosyalar = file.list();
		for (int i = 0; i < dosyalar.length; i++) {
			System.out.println(dosyalar[i]);

		}
		File file2 = new File("C:/eclipseDosya/hilmus");
		if (file2.exists()) {
			System.out.println("var evet");
		} else
			System.out.println("hayýýýýýýýýýýýýr yok" + file2.getName());
		file2.mkdir();

		File file3 = new File("C:/eclipseDosya/mmmm");
		if (file3.isDirectory())
			if (file3.exists()) {
				File file4 = new File("C:/eclipseDosya/hilal/ergan");
				file4.mkdirs();
			}

		System.out.println("#######");
		File file4 = new File("C:/eclipseDosya/hilal");
		if (file4.canRead()) {
			System.out.println("okunur");

		}
		if (file4.exists()) {
			File[] files = file4.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());

			}
			if (!files[3].getName().equals("ergan")) {
				System.out.println("deðilllll");
				files[4].delete();
			}
		}
	}
}
