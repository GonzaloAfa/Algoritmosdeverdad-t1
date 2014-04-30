
public class MergeSort extends Algorithms {

    private int[] sortedData;
    private int[] helper;

    private int length;

    public MergeSort() {
        super("MergeSort");
        this.type = AlgorithmType.MERGESORT;
    }


    public int[] mSort(int[] data) {

        this.sortedData = data.clone();
        length = this.sortedData.length;
        helper = new int[length];

        mergeSort(0, length - 1);

        return this.sortedData;
    }

    private void mergeSort(int low, int high) {
        // Base case: 1 element
        if (low < high) {
            comparisons++;

            int middle = low + (high - low) / 2;

            // Divide in the half and mSort recursively
            mergeSort(low, middle);
            mergeSort(middle + 1, high);

            // Sort in one pass the 2 sorted arrays
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++, comparisons++)
            helper[i] = sortedData[i];

        int index1 = low;
        int index2 = middle + 1;
        int indexOutput = low;

        while (index1 <= middle && index2 <= high) {
            comparisons++;

            if (helper[index1] <= helper[index2]) {
                sortedData[indexOutput++] = helper[index1++];
            } else {
                sortedData[indexOutput++] = helper[index2++];
            }

        }
        while (index1 <= middle) {
            comparisons++;
            sortedData[indexOutput++] = helper[index1++];
        }

    }
}

