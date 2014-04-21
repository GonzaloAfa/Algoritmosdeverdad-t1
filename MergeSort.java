
public class MergenSort{

		private int[] data;
		private int[] b ;

		private int num;

		public MergenSort(int[] values) {
			
			this.data = values;
			num = values.length;
			b = new int [num];

		}

		// tiempo que demora el algoritmo		
		public long sort(){
		 
			long a = System.currentTimeMillis();
			mergesort(0, num - 1);
		 	return System.currentTimeMillis() - a;
		}


		private void mergesort(int min, int max) {

			if (min < max) {
				int medio = (min + max) / 2;

				// El arreglo lo divido en varias partes pequenas
				mergesort(min, medio);
				mergesort(medio + 1, max);

				// Con las partes pequenas, voy mezclando y ordenando
				merge(min, medio, max);
			
			}
		
		}


		void merge(int low, int middle, int high){

		    int i, j, k;
		    
		    for (i=low; i<=high; i++)
				b[i]=this.data[i];

		    i 	= low; 
		    j 	= middle+1; 
		    k 	= low;
		    
		    while ( i<= middle && j<= high)
				if (b[i]<=b[j])
				    this.data[k++]=b[i++];
				else
				    this.data[k++]=b[j++];

		    while (i<=middle)
		    	this.data[k++]=b[i++];
		}


	    public void mostrar(){

	    	if ( num != 0 ){
	    	
	    		for(int i = 0; i < num; i++){
	    			System.out.println(this.data[i]);
	    		}
	    	}
	    }

		


	}

