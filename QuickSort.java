public class QuickSort extends Algorithms {

    private int[] sortedData;

    public QuickSort() {
        super("QuickSort");
        this.type = AlgorithmType.QUICKSORT;
    }

    public int[] mSort(int[] data) {

        sortedData = data.clone();

        quickSort(0, data.length - 1);

        return sortedData;
    }

    public void quickSort(int low, int high) {

        int pivot = sortedData[(low + high) / 2];

        int i = low;
        int j = high;

        while (i <= j) {
            while (sortedData[i] < pivot) {
                i++;
                comparisons++;
            }
            while (sortedData[j] > pivot) {
                j--;
                comparisons++;
            }

            comparisons++;
            if (i <= j) {
                swap(i++, j--);
            }
        }

        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
        comparisons += 2;
    }

    private void swap(int index1, int index2) {
        int tmp = sortedData[index1];
        sortedData[index1] = sortedData[index2];
        sortedData[index2] = tmp;
    }
}
