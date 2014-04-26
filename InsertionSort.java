
public class InsertionSort extends Algorithms {
	
	
	public InsertionSort(){
		this.comparisons = 0;
	}
   
    public int[] sort(int[] data) {

        // Count how many comparisons
    	this.comparisons = 0;
    	
    	// The output sorted array
        int[] sortedData = data.clone();        

        
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
    
}
