package contenidors;

public class Preferencia implements Comparable<Preferencia> {
	int ordre;
	String plat;

	public Preferencia(int ordre, String plat) {
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

	public int compareTo(Preferencia a) {
		if (this.ordre < a.ordre) {
			return 1;
		} else {
			return 0;
		}

		
	}


	

}