package de.dhbw.tinf21b1.pattern.decorator;

public class KonsolenDatenkanal implements Datenkanal {
	
	@Override
	public int übertrage(String nachricht) {
		System.out.println(nachricht);
		return nachricht.length();
	}
}
