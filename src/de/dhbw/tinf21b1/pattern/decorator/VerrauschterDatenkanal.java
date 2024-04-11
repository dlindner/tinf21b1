package de.dhbw.tinf21b1.pattern.decorator;

import java.util.Random;

public class VerrauschterDatenkanal implements Datenkanal {
	
	@Override
	public int übertrage(String nachricht) {
		Random rng = new Random();
		char[] charArray = nachricht.toCharArray();
		for (char each : charArray) {
			int rauschen = rng.nextInt(5);
			for (int i = 0; i < rauschen; i++) {
				System.out.print(".");
			}
			System.out.print(each);
		}
		System.out.println();
		return nachricht.length();
	}

}
