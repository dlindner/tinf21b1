package de.dhbw.tinf21b1.pattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Runnable> erzeugungen = new ArrayList<Runnable>();
		for (int i = 0; i < 10; i++) {
			erzeugungen.add(new Runnable() {
				@Override
				public void run() {
					EntityManager myInstance = EntityManager
						.instance;
					System.out.println(myInstance);
//						.getBean(
//							String.class
//						);
				}
			});
		}
		erzeugungen.forEach(r -> {
			new Thread(r).start();
		});
	}
}
