package de.dhbw.tinf21b1.fun;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Siehe die Typdefinition von Schnabeltier
		List<Schnabeltier<?>> tiereDieWirKennen = new ArrayList<>();

		String parameter = null;
		
		if ("test".equals(parameter)) {
			System.out.println("First Test mode enabled");
		} else {
			System.out.println("Haha!");
		}
		
		if (parameter.equals("test")) {
			System.out.println("Second Test mode enabled");
		}
	}
}
