package de.dhbw.tinf21b1.principles.lsp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesViolateLSP {

	public static void main(String[] args) throws IOException {
		Properties mottos = new Properties();
		mottos.setProperty("tinf21b1", "YOLO!");
		mottos.put("tinf21b3", -1);
		System.out.println(mottos.getProperty("tinf21b1"));
		System.out.println(mottos.getProperty("tinf21b3"));
		
		try (
			FileOutputStream out = new FileOutputStream(new File("mottos.properties"));
		) {
			mottos.store(out, "Ein cooler Kommentar!");
		}
	}
}
