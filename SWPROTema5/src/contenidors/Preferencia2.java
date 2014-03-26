package contenidors;

public class Preferencia2 implements Comparable<Preferencia2> {
	int ordre;
	String plat;

	public Preferencia2(int ordre, String plat) {
		super();
		this.ordre = ordre;
		this.plat = plat;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	@Override
	public String toString() {
		return "Preferencia [ordre=" + ordre + ", plat=" + plat + "]";
	}

	public int compareTo(Preferencia2 a) {
		if (this.ordre < a.ordre) {
			return 1;
		} else {
			return 0;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ordre;
		result = prime * result + ((plat == null) ? 0 : plat.hashCode());
		return result;
	}

	/*
	 * Source --> Generate hashCode... Clona la classe Preferencia amb el nom
	 * Preferencia2 i programa els mètodes hashCode i equals utilitzant
	 * l'asistent de l'IDE.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preferencia2 other = (Preferencia2) obj;
		if (ordre != other.ordre)
			return false;
		if (plat == null) {
			if (other.plat != null)
				return false;
		} else if (!plat.equals(other.plat))
			return false;
		return true;
	}

	// 18. Clona la classe Preferencia amb el nom Preferencia2 i programa els
	// mètodes hashCode i equals utilitzant l'asistent de l'IDE. Utilitza tots
	// els atributs.

}