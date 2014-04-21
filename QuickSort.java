public class data{
	
	int [] data;
	
	public data( int[] vector ){
		
		this.data = new int[vector.length];
		for ( int i = 0; i< vector.length; i++ ){
			this.data[i] = vector[i];
		}		
		
	}

	// devuelve el tiempo empleado en ordenar el data
	public long sort(){
	
		long a = System.currentTimeMillis();
		quickSort(0, data.length - 1 );		
		return System.currentTimeMillis() - a;
	}
	
	
	public void quickSort(int primero, int ultimo){
        
		int i=primero, j=ultimo;
        int auxiliar;

        // mediana de 3

        int medio = (primero + ultimo)/2; 

        if( this.data[ medio ]< this.data[ primero ] )
           swap( primero, medio );
        if( this.data[ ultimo ]< this.data[ primero ])
           swap( primero, ultimo );
        if( this.data[ ultimo ]< this.data[ medio ] ) 
           swap(medio, ultimo );

     	// colocamos pivote (= mediana)        
        int pivote = this.data[ medio ]; 
        swap( medio, ultimo-1);
        
        do{
        	while(this.data[i]<pivote) i++;                  
            while(this.data[j]>pivote) j--;
 
            if (i<=j){
            	auxiliar=this.data[j];
                this.data[j]=this.data[i];
                this.data[i]=auxiliar;
                i++;
                j--;
            }
 
        } while (i<=j);
 
        if(primero<j) quickSort(primero, j);
        if(ultimo>i) quickSort(i, ultimo);
    
	}
	

	// en caso de querer revisar el paso a paso
	void views(){
		for(int i = 0; i< this.data.length ; i++){
			System.out.println( data[i] );
		}
	}
		
	// intercambiar los numeros
    private void swap(int index1, int index2 ){

    	int tmp = this.data[ index1 ];
        this.data[index1] = this.data[index2];
        this.data[index2] = tmp;
     
	}


	
}
