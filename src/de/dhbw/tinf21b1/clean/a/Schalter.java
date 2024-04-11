package de.dhbw.tinf21b1.clean.a;

public class Schalter {
    private final Schaltbar lampe;
    private boolean gedrueckt;

    public Schalter(Schaltbar lampe) {
        this.lampe = lampe;
    }

    public void drueckeSchalter() {
        if (this.gedrueckt) {
            lampe.ausschalten();
            this.gedrueckt = false;
            return;
        }
        lampe.anschalten();
        this.gedrueckt = true;
    }
}