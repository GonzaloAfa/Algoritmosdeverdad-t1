/**
 * Created by Ian on 23-04-2014.
 */
public abstract class Algorithms {

    public long comparisons;
    public double executionTime;
    public final String name;
    public AlgorithmType type;

    public Algorithms(String name) {
        this.name = name;
    }

    public int[] sort(int[] data) {
        this.comparisons = 0;
        this.executionTime = 0;

        long time = System.nanoTime();

        int[] sortedData = mSort(data);

        this.executionTime = (System.nanoTime() - time) / 1000000.0;

        return sortedData;
    }

    public abstract int[] mSort(int[] data);

    public long getComparisons() {
        return this.comparisons;
    }

    public double getExecutionTime() {
        return this.executionTime;
    }

    public String getName() {
        return this.name;
    }

    public enum AlgorithmType {
        BUBBLESORT(0), INSERTIONSORT(1), MERGESORT(2), QUICKSORT(3);

        public int i;

        AlgorithmType(int i) {
            this.i = i;
        }
    }
}
