package utilitats;

import utilitats.Cronometre;

public class OrdenacioICerca {
	Cronometre temps = new Cronometre();

	public void bimbolla(int[] a) {
		temps.start();
		for (int i = 2; i <= a.length; i++) {
			for (int j = 0; j <= a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
		for (int g = 0; g < a.length; g++) {
			System.out.println(a[g]);
		}
		temps.stop();
		System.out.println("El temps requerit és " + temps.temps()
				+ " milisegons.");

	}

	public void quickSort(int[] vector, int esquerra, int dreta) {
		int i = esquerra;
		int j = dreta;
		int vPivot = vector[(i + j) / 2];

		do {
			while (vector[i] < vPivot) {
				i++;
			}
			while (vector[j] > vPivot) {
				j--;
			}
			if (i <= j) {
				int aux = vector[i];
				vector[i] = vector[j];
				vector[j] = aux;
				i++;
				j--;
			}
		} while (i < j);
		if (esquerra < j) {
			quickSort(vector, esquerra, j);
		}
		if (i < dreta) {
			quickSort(vector, i, dreta);
		}
	}

	public int CercaBinaria(int[] array, int num) {
		int inici = 0, fi = array.length - 1, mig = -1;
		while (inici <= fi) {

			mig = (inici + fi) / 2;
			if (num == array[mig]) {

				return mig;
			} else if (array[mig] > num) {
				fi = mig - 1;

			} else {
				inici = mig + 1;
			}

		}

		return -1;
	}

	public String CercaBinaria2(int[] array, int num) {
		int inici = 0, fi = array.length - 1, mig = -1, contador = 0;
		while (inici <= fi) {
			String missatge;
			mig = (inici + fi) / 2;
			if (num == array[mig]) {
				contador++;
				return missatge = mig + " botes " + contador;
			} else if (array[mig] > num) {
				fi = mig - 1;
				contador++;
			} else {
				inici = mig + 1;
				contador++;
			}

		}

		return "-1";
	}

	// A la classe OrdenacioICerca sobrecarrega el mètode bimbolla de forma que
	// accepti com a paràmetre un array d'objectes Comparable.

	 public void bimbolla(Comparable[] desordenat) {
		 temps.start();
		    boolean ordenat = false;  
		    while (!ordenat) {
		      ordenat = true;
		      for (int i = 0; i < desordenat.length - 1; i++) {
		        if (desordenat[i].compareTo(desordenat[i + 1]) > 0 ){
		          Comparable temp = desordenat[i + 1];
		          desordenat[i + 1] = desordenat[i];
		          desordenat[i] = temp;
		          ordenat = false;
		        }
		      }
		    } 
		    temps.stop();
			System.out.println("El temps requerit és " + temps.temps()
					+ " milisegons.");
		  } 
	 
}
