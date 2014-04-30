
public class InsertionSort extends Algorithms {

    public InsertionSort() {
        super("InsertionSort");
        this.type = AlgorithmType.INSERTIONSORT;
    }

    public int[] mSort(int[] data) {
        // The output sorted array
        int[] sortedData = data.clone();

        sortedData = insertionSort(sortedData);

        return sortedData;
    }


    private int[] insertionSort(int[] sortedData) {

        for (int i = 1; i < sortedData.length; i++) {

            int aux = sortedData[i];
            int j;

            for (j = i - 1; j >= 0 && sortedData[j] > aux; j--, comparisons++)
                sortedData[j + 1] = sortedData[j];

            sortedData[j + 1] = aux;
        }

        return sortedData;
    }
}
