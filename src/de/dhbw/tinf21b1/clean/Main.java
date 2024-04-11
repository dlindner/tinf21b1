package de.dhbw.tinf21b1.clean;

import de.dhbw.tinf21b1.clean.a.Schaltbar;
import de.dhbw.tinf21b1.clean.a.Schalter;
import de.dhbw.tinf21b1.clean.b.Lampe;
import de.dhbw.tinf21b1.clean.b_adapter.SchaltbareLampe;

public class Main {

	public static void main(String[] args) {
		Lampe leuchte = new Lampe();
		SchaltbareLampe schaltbar = new SchaltbareLampe(leuchte);
		Schalter schalter = new Schalter(schaltbar);
		schalter.drueckeSchalter();
		schalter.drueckeSchalter();
	}
}
