package de.dhbw.tinf21b1.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Datenkanal ausgabe = new VerrauschterDatenkanal();
		Komprimierung kleiner = new Komprimierung(ausgabe);
		Verschlüsselung geheimnis = new Verschlüsselung(kleiner);
		Verschlüsselung geheimnis2 = new Verschlüsselung(geheimnis);
		Verschlüsselung geheimnis3 = new Verschlüsselung(geheimnis2);
		
		Datenkanal außen = geheimnis3;
		
		int datenlänge = außen.übertrage("Hello TINF21B1, ist es nicht noch viel Zeit bis zur Abgabe des Programmentwurfs?");
		System.out.println("-- " + datenlänge + " Zeichen übertragen");
	}
}
