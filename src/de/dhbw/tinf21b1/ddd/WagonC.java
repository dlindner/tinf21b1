package de.dhbw.tinf21b1.ddd;

import java.util.Objects;

public class WagonC {

	private final int nummer;

	public WagonC(int nummer) {
		super();
		this.nummer = nummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof WagonC))
			return false;
		WagonC other = (WagonC) obj;
		return nummer == other.nummer;
	}
	
	
}
