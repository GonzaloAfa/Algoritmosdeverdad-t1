/**
 * Created by Ian on 24-04-2014.
 */
public class AlgorithmStatistic {

    long comparisons;
    double executionTime;
    int repetitions, error, arraySize;
    String arrayType;

    public AlgorithmStatistic() {
        comparisons = 0;
        executionTime = -1;
        repetitions = 0;
        error = -1;
        arraySize = -1;
        arrayType = "no type";
    }

    public void appendMeasurement(long comparisons, double executionTime, int repetitions, int error, int arraySize, String arrayType) {

    }
}
