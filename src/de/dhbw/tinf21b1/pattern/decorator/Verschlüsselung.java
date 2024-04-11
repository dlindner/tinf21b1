package de.dhbw.tinf21b1.pattern.decorator;

import java.nio.charset.Charset;
import java.util.Base64;

public class Verschlüsselung implements Datenkanal {
	
	private static final Charset encoding = Charset.forName("utf-8");
	
	private final Datenkanal nachfolger;

	public Verschlüsselung(Datenkanal nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public int übertrage(String nachricht) {
		return this.nachfolger.übertrage(
			verschlüsselte(nachricht)
		);
	}

	private String verschlüsselte(String nachricht) {
		byte[] geheimnis = Base64.getEncoder().encode(nachricht.getBytes(encoding));
		return new String(geheimnis, encoding);
	}
}
