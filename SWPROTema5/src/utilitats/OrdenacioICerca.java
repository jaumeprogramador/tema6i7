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
	
	public int cercarBinaria(int[] a, int cercat) {
		int inici = 0;
		int fi = a.length - 1;
		int mig = -1;
		while (inici <= fi) {
			mig = (inici + fi) / 2;
			if (cercat == a[mig]) {
				return mig;
			} else if (a[mig] > cercat) {
				fi = mig - 1;
			} else {
				inici = mig + 1;
			}
		}
		return -1;
	}
	
	public int cercarBinaria2(int[] a, int cercat) {
		int inici = 0;
		int comptador = 0;
		int fi = a.length - 1;
		int mig = -1;
		while (inici <= fi) {
			comptador++;
			mig = (inici + fi) / 2;
			if (cercat == a[mig]) {
				comptador++;
				return mig;
			} else if (a[mig] > cercat) {
				comptador++;
				fi = mig - 1;
			} else {
				comptador++;
				inici = mig + 1;
			}
		}
		System.out.println("comptador: " + comptador);
		return -1;
	}
	
	

}
