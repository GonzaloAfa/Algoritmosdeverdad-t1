public class QuickSort extends Algorithms {

    public void quickSort(int[] sortedData, int first, int last) {
        // Select the last one as the pivot
        int piv = sortedData[last];

        int i = first, j = last - 1;
        int aux;

        while (i < last && i <= j && j >= 0) {
            if (sortedData[i] > piv) {
                swap(sortedData, i, j--);
            } else
                i++;
        }

        if (first < j) quickSort(sortedData, first, j);
        if (j < last - 1) quickSort(sortedData, j + 1, last);
    
	}

    private void swap(int[] sortedData, int index1, int index2) {
        int tmp = sortedData[index1];
        sortedData[index1] = sortedData[index2];
        sortedData[index2] = tmp;
    }

    public int[] sort(int[] data) {
        int[] sortedData = data.clone();
        quickSort(sortedData, 0, data.length);
        return sortedData;
    }
}
