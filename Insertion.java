
public class Insertion extends Algorithms {
    public long comparisons;

    public int[] sort(int[] data) {
        // The output sorted array
        int[] sortedData = data.clone();
        // Count how many comparisons
        comparisons = 0;

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
