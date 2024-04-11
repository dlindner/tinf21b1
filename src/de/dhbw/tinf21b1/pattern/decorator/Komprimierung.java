package de.dhbw.tinf21b1.pattern.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

public class Komprimierung implements Datenkanal {
	
	private static final Charset encoding = Charset.forName("utf-8");

	private Datenkanal nachfolger;

	public Komprimierung(Datenkanal nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public int übertrage(String nachricht) {
		return this.nachfolger.übertrage(
			komprimierte(nachricht)
		);
	}

	protected String komprimierte(String nachricht) {
		try (
			final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			final GZIPOutputStream stream = new GZIPOutputStream(bytes);
		) {
			stream.write(nachricht.getBytes(encoding));
			return new String(bytes.toByteArray(), encoding);
		} catch (IOException e) {
			return "FEHLER!";
		}
	}
}
