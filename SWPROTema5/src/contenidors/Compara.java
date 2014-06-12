package contenidors;

import java.util.Comparator;

public class Compara implements Comparator {

	@Override
	public int compare(Object plat1, Object plat2) {
		
		String plat1Nombre = ((Preferencia)plat1).getPlat();
		String plat2Nombre = ((Preferencia)plat1).getPlat();
		
		return plat1Nombre.compareTo(plat2Nombre);
	}

}
