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

		int minReplays 	= 3;

		// TODO: replace value 
		int minSizeArray = 5;
		int maxSizeArray = 15;

		BubbleSort bubble 		= new BubbleSort();
		InsertionSort insertion	= new InsertionSort();
		MergeSort merge			= new MergeSort();
		QuickSort quick 		= new QuickSort();

		Algorithms algorithm[] 	= {bubble, insertion, merge, quick};

		Statistics statistics 	= new Statistics();


		// Type Array
		RandomGenerator randomArray 				= new RandomGenerator();
		AlmostOrderedGenerator almostOrderedArray 	= new AlmostOrderedGenerator();

		Generator array[] = {randomArray, almostOrderedArray};


		// Size Array
		int size[] = new int[maxSizeArray - minSizeArray + 1];

		// Init Array		
		for (int i = 0 ; i < size.length ; i++)
			size[i] = (int)Math.pow(2.0 , (double)(minSizeArray+i));


		// start algorithm.

		// Type array
		for (int type=0; type < array.length ; type++ ) {

			// Size array
			for (int p = 0; p < size.length; p++ ) {

				// replay
				for (int replay = 0; replay < minReplays ; replay++ ) {

					// TODO: calculate SD all algorithm and then stop.

					// generate Array
					int sortedData[] 	= array[type].generateArray(size[p]);
				
					// Type algorithm				
					for (int i = 0 ; i < algorithm.length; i++) {

						// TODO: if !(sd in range) --> replay algorithm

						// sort
						algorithm[i].sort(sortedData);

						// get information run algorithm
						System.out.println(algorithm[i].getName() + " \t\t: " + algorithm[i].getComparisons());
	
						// Save information

					}


				}
			}
		}
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