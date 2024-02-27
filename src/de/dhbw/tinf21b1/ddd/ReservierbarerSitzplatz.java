package de.dhbw.tinf21b1.ddd;

import java.util.Properties;

public class ReservierbarerSitzplatz {

	private final WagonC wagen;
	private final SitzreiheC reihe;
	private final int nummer;
	
	public ReservierbarerSitzplatz(
		WagonC wagen,
		SitzreiheC reihe,
		int nummer
	) {
		super();
		this.wagen = wagen;
		this.reihe = reihe;
		this.nummer = nummer;
	}
	
	Properties p = null;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nummer;
		result = prime * result + ((reihe == null) ? 0 : reihe.hashCode());
		result = prime * result + ((wagen == null) ? 0 : wagen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ReservierbarerSitzplatz))
			return false;
		ReservierbarerSitzplatz other = (ReservierbarerSitzplatz) obj;
		if (nummer != other.nummer)
			return false;
		if (reihe == null) {
			if (other.reihe != null)
				return false;
		} else if (!reihe.equals(other.reihe))
			return false;
		if (wagen == null) {
			if (other.wagen != null)
				return false;
		} else if (!wagen.equals(other.wagen))
			return false;
		return true;
	}
	
	
	
	
	
	
}
