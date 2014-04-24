public class BubbleSort extends Algorithms {

    public long comparisons;

    public int[] sort(int[] data) {
        // The output sorted array
        int[] sortedData = data.clone();
        // Count how many comparisons
        comparisons = 0;

        for (int pass = 1; pass < sortedData.length; pass++) {

            // This next loop becomes shorter and shorter
            for (int i = 0; i < sortedData.length - pass; i++, comparisons++) {
                // Check if elements are in correct order
                if (sortedData[i] > sortedData[i + 1]) {
                    // Swap elements
                    int temp = sortedData[i];
                    sortedData[i] = sortedData[i + 1];
                    sortedData[i + 1] = temp;
                }
            }
        }
        return sortedData;
    }
}