package de.dhbw.tinf21b1.test.mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import org.junit.Test;
import org.mockito.Mockito;

public class KinoTest {

	@Test
	public void zeige_Film_mit_Überlänge() throws Exception {
		Projektor mockedProjektor = Mockito.mock(Projektor.class);
		Film mockedFilm = Mockito.mock(Film.class);
		Mockito.when(mockedFilm.name()).thenReturn("The revenge of the Tests!");
		//Mockito.replay(mockedProjektor, mockedFilm);
		
		// Arrange
		Kino target = new Kino(mockedProjektor);
		
		// Act
		target.spiele(mockedFilm);
		
		// Assert
		Mockito.verify(mockedProjektor, times(1)).legeEin(mockedFilm);
		Mockito.verify(mockedProjektor, times(1)).spieleAb();
		Mockito.verify(mockedProjektor, times(1)).warteAufEnde();
	}
}
