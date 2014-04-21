
public class Insertion {
	
	int [] data;
	int comp_i = 0;
	
	// constructor! copio el arreglo completo
	Insertion ( int[] vector ){
		
		data = new int [vector.length];
		for ( int i = 0; i< vector.length; i++){
			this.data[i] = vector[i];
		}		

	}


	public long sort(){
	
		long a = System.currentTimeMillis();
		insertionSort();
		return System.currentTimeMillis() - a;	
		
	}


	private void insertionSort(){
		
		//Algoritmo InsertionSort				
		for (int i=1; i<data.length; i++) {
	         int aux = data[i];
	         int j;
	    
	        for (j=i-1; j>=0 && data[j]>aux; j--, comp_i++)
	            
	        	data[j+1] = data[j];
	         	data[j+1] = aux;
	      }
	   	//Fin del algoritmo
	}
	

	public void views(){
		for ( int i = 0; i< this.data.length; i++){
			System.out.println(this.data[i]);
		}
	}

}
