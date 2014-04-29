import java.io.*;

/**
* Main
*		> Metodo que arranque
*		> Iterar
* > Tamaño del arreglo
* > Tipo de arreglo
*			> Repeticiones por el tema del error
*			> Correr cada algoritmo
 * */

class Main {

	static	public void main (String[] args) throws IOException{

		System.out.println("Test");

		RandomGenerator randomArray 				= new RandomGenerator();
		AlmostOrderedGenerator almostOrderedArray 	= new AlmostOrderedGenerator();

		int size[] = new int[10];
		
		for (int i = 0 ; i < size.length ; i++)
			size[i] = (int)Math.pow(2.0 , (double)(20+i));


//		int sortedData[] 	= randomArray.generateArray(2048);
		int sortedData[] 	= randomArray.generateArray(2048);
		
		BubbleSort bubble 		= new BubbleSort();
		InsertionSort insertion	= new InsertionSort();
		MergeSort merge			= new MergeSort();
		QuickSort quick 		= new QuickSort();

		Statistics statistics 	= new Statistics();

		bubble.sort(sortedData);
		System.out.println("Bubble: "	+ bubble.getComparisons());
		
		insertion.sort(sortedData);
		System.out.println("Insertion: "+ insertion.getComparisons());
		
		merge.sort(sortedData);
		System.out.println("Merge: "	+ merge.getComparisons());
		
		quick.sort(sortedData);
		System.out.println("Quick: "	+ quick.getComparisons());
		
		 
	}
	
	
	public static void viewData(int sortedData[]){
		for (int i = 0; i < sortedData.length; i++){
			System.out.print(sortedData[i]+" | ");
		}
		System.out.println("");

	}

	public static double standardDeviation(int sortedData[]){

		double sd 	= 0;
		double sum 	= 0;
		double mean	= 0;

		for(int i=0; i < sortedData.length; i++)
			sum = sum+sortedData[i];
		mean = sum / sortedData.length;

		sum = 0;

		for(int i=0; i<sortedData.length ; i++)
			sum = sum + Math.pow(sortedData[i]-mean, 2);

		sd = Math.sqrt(sum/(sortedData.length-1));

		System.out.println("Standard Deviation:"+sd);
		
		return sd;
	}



} 