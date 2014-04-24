
public class MergeSort extends Algorithms {

    private void recursiveMergeSort(int[] sortedData, int low, int high) {
        // Base case: 1 element
        if (high == low + 1)
            return;

        int middle = (int) Math.floor((low + high) / 2);

        // Divide in the half and sort recursively
        recursiveMergeSort(sortedData, low, middle);
        recursiveMergeSort(sortedData, middle + 1, high);

        // Sort in one pass the 2 sorted arrays
        merge(sortedData, low, middle, high);
    }

    private void merge(int[] sortedData, int low, int middle, int high) {

        int[] original = new int[high - low];
        for (int i = low; i < high; i++)
            original[i] = sortedData[i];

        int index1 = low;
        int index2 = middle + 1;
        int indexOutput = low;

        while (index1 <= middle && index2 < high)
            if (original[index1] <= original[index2])
                sortedData[indexOutput++] = original[index1++];
            else
                sortedData[indexOutput++] = original[index2++];

        while (index1 <= middle)
            sortedData[indexOutput++] = original[index1++];
    }

    public int[] sort(int[] data) {
        int[] sortedData = data.clone();
        recursiveMergeSort(sortedData, 0, sortedData.length);
        return sortedData;
    }
}

