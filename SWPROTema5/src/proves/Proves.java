package proves;
import utilitats.OrdenacioICerca;
import utilitats.Cronometre;

public class Proves {

	private void mostraArray (int[] a){
		for (int i=0; i<=a.length-1; i++){
			System.out.println(a[i]);
		}
	}
	
	public int [] crearVector() {
		System.out.print("El vector de " + 20 + " sencers aleatoris és:\n");
		int vector[] = new int[20];
		for (int i = 1; i < 20; i++) {
			vector[i] = 1+(int)(Math.random()*((100- 1)+1));
			System.out.println(vector[i]);
		}
		return vector;

	}
	
	public void provaOrdenacio (String metode){
		OrdenacioICerca ordenar = new OrdenacioICerca();
		int [] arrayCreat = crearVector();
		System.out.println("L'array de 20 aleatoris ordenat és: ");
		ordenar.bimbolla(arrayCreat);
	}
	
	public void provaCercaBinaria(int longitud){
		Proves mostra = new Proves();
		int [] array = new int [longitud];
		for (int i=0; i<array.length; i++){
			array[i] = i;
		}
		//El mostra
		System.out.println("Array\n");
		mostra.mostraArray(array);
		OrdenacioICerca ordenar = new OrdenacioICerca();
		//Cerca binària 2
		System.out.println("Cerca binària 2\n");
		System.out.println(ordenar.cercarBinaria2(array, 15));
		
	}
	
	public static void main(String[] args) {
		OrdenacioICerca ordenar = new OrdenacioICerca();
		int a [] = {10, 120, 15, 2, 4, 400, 477, 30, 27, 88, 9, 2, 23, 58, 59, 60, 61, 
				62, 40, 41, 42, 43, 20, 21, 22, 23, 12, 13, 14, 25, 16, 39478, 3837, 322,
				23, 39, 39999, 430};
		
		ordenar.bimbolla(a);
		Proves mostra = new Proves();
		//mostra.mostraArray(a);
		mostra.provaOrdenacio("Algorisme triat");
		System.out.println("QuickSort");
		
		ordenar.quickSort(a, 0, a.length-1);
		mostra.mostraArray(a);
		
		//A la classe Proves sobrecarrega el mètode provaCercaBinaria de forma 
		//que la nova versió tengui com a paràmetre la longitud de l'array. 
		//Prova'l des del main amb distintes longituds:100, 1000, 10000, ...
		mostra.provaCercaBinaria(1000);
		
		
		
}
}
