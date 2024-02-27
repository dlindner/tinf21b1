package de.dhbw.tinf21b1.ddd;

import java.util.Objects;

public class SitzreiheC implements Sitzreihe {

	private final String name;

	public SitzreiheC(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SitzreiheC))
			return false;
		SitzreiheC other = (SitzreiheC) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
}
