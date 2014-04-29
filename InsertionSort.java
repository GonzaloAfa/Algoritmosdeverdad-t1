
public class InsertionSort extends Algorithms {
	
    private String name = "InsertionSort";
	
	public InsertionSort(){
        this.comparisons    = 0;
        this.executionTime  = 0;
        this.auxTime        = 0;

	}
   
    public int[] sort(int[] data) {
    	
    	// The output sorted array
        int[] sortedData = data.clone();        

        this.comparisons = 0;
        this.auxTime = System.currentTimeMillis();

        sortedData = insertionSort(sortedData);
        
        this.executionTime = System.currentTimeMillis() - this.auxTime;
        return sortedData;
    }
    

    private int[] insertionSort(int[] sortedData){

        for (int i = 1; i < sortedData.length; i++, comparisons++) {
        
            int aux = sortedData[i];
            int j;

            for (j = i - 1; j >= 0 && sortedData[j] > aux; j--, comparisons++)
                sortedData[j + 1] = sortedData[j];
            
            sortedData[j + 1] = aux;
        }
        
        return sortedData;
    }



    public long getComparisons(){
    	return this.comparisons;
    }

    public long getExecutionTime(){
        return this.executionTime;
    }

    public String getName(){
        return this.name;
    }


    
}
