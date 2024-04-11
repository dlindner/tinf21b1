package de.dhbw.tinf21b1.test.mock;

public class Main {

	public static void main(String[] args) {
		Kino kino = new Kino(new Projektor());
		Film wolf_of_wallstreet = new Film() {
			@Override
			public String name() {
				return "Wolf of Wallstreet";
			}
			
			@Override
			public int lauflänge() {
				return 180;
			}
		};
		kino.spiele(wolf_of_wallstreet);
	}
}
