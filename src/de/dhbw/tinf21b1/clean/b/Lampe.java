package de.dhbw.tinf21b1.clean.b;

public class Lampe {

    private boolean leuchtet = false;

    public void switchOn() {
        this.leuchtet = true;
        System.out.println("Lampe ist an");
    }

    public void switchOff() {
        this.leuchtet = false;
        System.out.println("Lampe ist aus");
    }
}