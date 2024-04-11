package de.dhbw.tinf21b1.clean.b_adapter;

import de.dhbw.tinf21b1.clean.a.Schaltbar;
import de.dhbw.tinf21b1.clean.b.Lampe;

public class SchaltbareLampe implements Schaltbar {
	
	private Lampe lampe;

	public SchaltbareLampe(Lampe lampe) {
		super();
		this.lampe = lampe;
	}

	@Override
	public void ausschalten() {
		this.lampe.switchOff();
	}

	@Override
	public void anschalten() {
		this.lampe.switchOn();
	}
}
