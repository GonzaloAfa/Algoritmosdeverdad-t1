/**
 * Created by Ian on 24-04-2014.
 */
public class AlgorithmStatistic {

    long comparisons;
    double executionTime;

    public AlgorithmStatistic(long comparisons, double executionTime) {
        this.comparisons = comparisons;
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return comparisons + ";" + executionTime;
    }
}
