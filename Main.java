import java.io.*;

/**
 Main
		> Metodo que arranque
		> Iterar
 > Tamaño del arreglo
 > Tipo de arreglo
			> Repeticiones por el tema del error
			> Correr cada algoritmo
 * */

class Main {

	static	public void main (String[] args) throws IOException{

		System.out.println("Test");

		int sortedData[] =  {1, 2, 3, 5, 4, 11, 293, 14, 231, 33, 92};
		
		BubbleSort bubble 		= new BubbleSort();
		InsertionSort insertion	= new InsertionSort();
		MergeSort merge			= new MergeSort();
		QuickSort quick 		= new QuickSort();

		viewData(bubble.sort(sortedData));
		viewData(insertion.sort(sortedData));
		viewData(merge.sort(sortedData));
		viewData(quick.sort(sortedData));
		
		System.out.println("Bubble: "	+ bubble.getComparisons());
		System.out.println("Insertion: "+ insertion.getComparisons());
		System.out.println("Merge: "	+ merge.getComparisons());
		System.out.println("Quick: "	+ quick.getComparisons());
		 
	}
	
	
	public static void viewData(int sortedData[]){
		for (int i = 0; i < sortedData.length; i++){
			System.out.print(sortedData[i]+" | ");
		}
		System.out.println("");

	}



} 