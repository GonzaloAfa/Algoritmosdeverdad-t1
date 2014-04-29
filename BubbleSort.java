public class BubbleSort extends Algorithms {

    private String name = "BubbleSort"; 
    
    public BubbleSort(){
    	this.comparisons    = 0;
        this.executionTime  = 0;
        this.auxTime        = 0;
    }

    public int[] sort(int[] data) {
    	
        // The output sorted array
        int[] sortedData = data.clone();
        // Count how many comparisons
        this.comparisons = 0;
        this.auxTime = System.currentTimeMillis();

        sortedData = bubbleSort(sortedData);
        
        this.executionTime = System.currentTimeMillis() - this.auxTime;

        return sortedData;
    }

    private int[] bubbleSort(int[] sortedData){
        
        for (int pass = 1; pass < sortedData.length; pass++, comparisons++) {

            // This next loop becomes shorter and shorter
            for (int i = 0; i < sortedData.length - pass; i++, comparisons++) {
                // Check if elements are in correct order
                if (sortedData[i] > sortedData[i + 1]) {
                    // Swap elements
                    int temp = sortedData[i];
                    sortedData[i] = sortedData[i + 1];
                    sortedData[i + 1] = temp;
                    this.comparisons++;
                }
            }
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