public class BubbleSort extends Algorithms {

    private long comparisons;
    
    public BubbleSort(){
    	this.comparisons = 0;
    }

    public int[] sort(int[] data) {
        // Count how many comparisons
        this.comparisons = 0;
    	
        // The output sorted array
        int[] sortedData = data.clone();
        // Count how many comparisons
        comparisons = 0;

        for (int pass = 1; pass < sortedData.length; pass++, comparisons++) {

            // This next loop becomes shorter and shorter
            for (int i = 0; i < sortedData.length - pass; i++, comparisons++) {
                // Check if elements are in correct order
                if (sortedData[i] > sortedData[i + 1]) {
                    // Swap elements
                    int temp = sortedData[i];
                    sortedData[i] = sortedData[i + 1];
                    sortedData[i + 1] = temp;
                    comparisons++;
                }
            }
        }
        return sortedData;
    }
    
    public long getComparisons(){
    	return this.comparisons;
    }
}