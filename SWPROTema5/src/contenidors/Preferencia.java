package contenidors;

public class Preferencia implements Comparable<Preferencia> {
	int ordre;
	String plat;
	//s'afegeix l'atribut preu
	double preu;

	public Preferencia(int ordre, String plat, int preu) {
		super();
		this.ordre = ordre;
		this.plat = plat;
		this.preu = preu;
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


	public double getPreu() {
		return preu;
	}


	public void setPreu(double preu) {
		this.preu = preu;
	}


	public Preferencia(int ordre, String plat, double preu) {
		super();
		this.ordre = ordre;
		this.plat = plat;
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Preferencia [ordre=" + ordre + ", plat=" + plat + ", preu="
				+ preu + "]";
	}

	@Override
	public int compareTo(Preferencia o) {
		if (this.ordre>o.ordre){
			return 1;
		}
		return 0;
	}
	
}