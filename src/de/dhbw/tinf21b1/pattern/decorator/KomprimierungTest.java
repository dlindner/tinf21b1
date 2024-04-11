package de.dhbw.tinf21b1.pattern.decorator;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KomprimierungTest {

	@Test
	public void roundtrip() {
		Datenkanal mock = t -> 1;
		Komprimierung target = new Komprimierung(
			mock
		);
		Random rng = new Random();
		List<Character> zeichen = Stream.generate(() -> (char) rng.nextInt()).limit(10_000).collect(Collectors.toList());
		StringBuilder helper = new StringBuilder();
		for (Character each : zeichen) {
			helper.append(each);
		}
		String actual = target.komprimierte(helper.toString());
		Assertions.assertThat(actual.length()).isEqualTo(497);
	}

}
