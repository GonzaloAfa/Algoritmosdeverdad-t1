public class QuickSort extends Algorithms {
	
    private int[] sortedData;
	
	public QuickSort(){
        this.comparisons    = 0;
        this.executionTime  = 0;
        this.auxTime        = 0;
	}
	
    public int[] sort(int[] data) {
    	
    	sortedData = data.clone();

        this.comparisons = 0;
        this.auxTime = System.currentTimeMillis();


        quickSort(0, data.length-1);
        
        this.executionTime = System.currentTimeMillis() - this.auxTime;
        
        return sortedData;
    }
    
    public void quickSort(int low, int high) {

        int pivot = sortedData[(low+high)/2];

        int i = low; 
        int j = high;
        
        while (i <= j) {
        	comparisons++;
        	
        	while(sortedData[i] < pivot){
        		i++;
        		comparisons++;
        	}
        	while(sortedData[j] > pivot){
        		j--;        	
        		comparisons++;
        	}
        	if(i<=j){
        		comparisons++;
        		swap(i++, j--);
        	}
        }

        if (low < j){
    		comparisons++;
        	quickSort(low, j);
        }
        if (i < high){	
    		comparisons++;
        	quickSort(i, high);        
        }
    }

    private void swap(int index1, int index2) {
        int tmp = sortedData[index1];
        sortedData[index1] = sortedData[index2];
        sortedData[index2] = tmp;
    }
    
    public long getComparisons(){
    	return this.comparisons;
    }

    public long getExecutionTime(){
        return this.executionTime;
    }


}
