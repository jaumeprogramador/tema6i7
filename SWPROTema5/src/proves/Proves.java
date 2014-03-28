package proves;

import contenidors.Preferencia;
import utilitats.OrdenacioICerca;
import utilitats.Algorismes;
import utilitats.Cronometre;

public class Proves {

	private void mostraArray(int[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

	public int[] crearVector() {
		System.out.print("El vector de " + 20 + " sencers aleatoris és:\n");
		int vector[] = new int[20];
		for (int i = 1; i < 20; i++) {
			vector[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));
			System.out.println(vector[i]);
		}
		return vector;

	}

	public void provaOrdenacio(Algorismes tipus) {
		int[] arry = new int[19];
		for (int i = 0; i < arry.length - 1; i++) {

			arry[i] = 1 + (int) (Math.random() * ((100 - 1) + 1));

		}
		for (int i = 0; i < arry.length - 1; i++) {

			System.out.println(arry[i]);

		}
		OrdenacioICerca ordena = new OrdenacioICerca();
		if (tipus == tipus.BIMBOLLA) {

			ordena.bimbolla(arry);
			System.out.println("Ordenat amb BIMBOLLA");
			for (int i = 0; i < arry.length - 1; i++) {

				System.out.println(arry[i]);

			}
		} else if (tipus == tipus.BIMBOLLA) {

			ordena.quickSort(arry, 0, arry.length - 1);
			System.out.println("Ordenat");
			for (int i = 0; i < arry.length - 1; i++) {

				System.out.println(arry[i]);

			}
		}
	}

	public void provaCercaBinaria(int longitud) {
		int[] p = new int[longitud];
		int valor = 8;
		for (int i = 0; i < longitud; i++) {
			p[i] = i;

		}

		Proves obj = new Proves();

		obj.mostraArray(p);
		OrdenacioICerca posicio = new OrdenacioICerca();
		System.out.println("El valor cercat és: " + valor
				+ " i ocupa la posició: " + posicio.CercaBinaria(p, valor));

	}

	public void provaCercaBinaria() {
		int[] p = new int[20];
		int valor = 5;
		for (int i = 0; i < 20; i++) {
			p[i] = i;

		}

		Proves obj = new Proves();

		obj.mostraArray(p);
		OrdenacioICerca posicio = new OrdenacioICerca();
		System.out.println("El valor cercat és: " + valor
				+ " ocupa la posició: " + posicio.CercaBinaria(p, valor));

	}

	public void provaBimbollaComparable() {
		Preferencia braciola = new Preferencia(4, "Braciola", 10);
		Preferencia tortilla = new Preferencia(2, "Tortilla", 5);
		Preferencia arrosBrut = new Preferencia(1, "Arròs Brut", 12);
		Preferencia filetMignon = new Preferencia(3, "Filet Mignon", 15);
		Preferencia platsDesordenats[] = { braciola, tortilla, arrosBrut,
				filetMignon };

		for (int i = 0; i < platsDesordenats.length; i++) {
			System.out.println(platsDesordenats[i]);
		}

		OrdenacioICerca obj = new OrdenacioICerca();
		// Amb el mètode Bimbolla amb comparable de la classe Ordenació i cerca
		// podrem ordenar l'array plats Desordenats de tipus Preferència.
		obj.bimbolla(platsDesordenats);

		for (int i = 0; i < platsDesordenats.length; i++) {
			System.out.println(platsDesordenats[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordenació i Cerca
		OrdenacioICerca j = new OrdenacioICerca();
		Proves mostra = new Proves();
		int desordenat[] = { 1, 8, 5, 9, 3, 6, 7, 4, 2, 10 };
		int desordenat2[] = { 1, 8, 5, 9, 3, 6, 7, 4, 2, 10 };
		// j.bimbolla(desordenat);
		// mostra.separador();

		// mostra.mostraArray(desordenat);
		// mostra.separador();
		// mostra.provaOrdenacio();
		// mostra.separador();
		j.quickSort(desordenat, 0, desordenat.length - 1);
		// mostra.mostraArray(desordenat);
		// mostra.separador();
		// mostra.provaOrdenacio("qui");
		// mostra.separador();
		// System.out.println(j.CercaBinaria(desordenat, 9));

		// mostra.provaCercaBinaria(15);

		// System.out.println(j.CercaBinaria2(desordenat, 4));
		// mostra.provaCercaBinaria(1000);
		Algorismes tipus = null;
		/*
		 * Al paquet utilitats crea una enumeració anomenada Algorismes amb una
		 * constant per a cada algorisme d'ordenació que hem programat a la
		 * classe OrdenacioICerca. A la classe proves, modifica el mètode
		 * provaOrdenacio de manera que el paràmetre sigui del tipus de
		 * l'enumeració i utilitzi aquest valor per executar l'algorisme de
		 * cerca que vulgui l'usuari.
		 */
		mostra.provaOrdenacio(tipus.BIMBOLLA);
		// Executem el mètode Bimbolla amb Comparable
		mostra.provaBimbollaComparable();

	}
}
