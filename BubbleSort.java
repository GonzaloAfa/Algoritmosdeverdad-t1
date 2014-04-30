public class BubbleSort extends Algorithms {

    public BubbleSort(){
        super("BubbleSort");
        this.type = AlgorithmType.BUBBLESORT;
    }

    public int[] mSort(int[] data) {
        // The output sorted array
        int[] sortedData = data.clone();

        sortedData = bubbleSort(sortedData);

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
}