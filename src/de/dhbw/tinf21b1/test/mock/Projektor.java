package de.dhbw.tinf21b1.test.mock;

import java.util.Optional;

public class Projektor {
	
	private Optional<Film> eingelegterFilm;
	
	public Projektor() {
		super();
		this.eingelegterFilm = Optional.empty();
	}

	public void legeEin(Film film) {
		this.eingelegterFilm = Optional.ofNullable(film);
	}

	public void spieleAb() {
		this.eingelegterFilm.ifPresent(f -> {
			System.out.println("Es läuft... " + f.name() + " für " + f.lauflänge() + " Minuten.");
		});
	}

	public void warteAufEnde() {
		this.eingelegterFilm.ifPresent(f -> {
			try {
				Thread.sleep(f.lauflänge() * 100);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});
	}
}
