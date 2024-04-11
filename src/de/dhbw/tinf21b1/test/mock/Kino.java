package de.dhbw.tinf21b1.test.mock;

public class Kino {

	private final Projektor vorführgerät;

	public Kino(Projektor vorführgerät) {
		super();
		this.vorführgerät = vorführgerät;
	}
	
	public void spiele(Film film) {
		System.out.println("Lege Film " + film.name() + " ein");
		this.vorführgerät.legeEin(film);
		this.vorführgerät.spieleAb();
		this.vorführgerät.warteAufEnde();
		System.out.println("Licht geht an!");
	}
}
