import java.util.ArrayList;

/*
 * 
 * Objeto Statistics
 *
 * Crear estadistica
 * Cargar datos
 * porcentaje de error
 * Generar estadistica
 * 
 * 
 * 		numero de comparaciones
		tiempo de ejecucion
		numero de repeticiones
		error del experimento
		tamaño del arreglo (anotarlo para cada experimento)
		tipo de arreglo 

 */
class Statistics {

    private int arraySize;

    ArrayList<AlgorithmStatistic> evaluations;
    public double error, mean, devStd;
    public int repetitions;
    private AlgorithmStatistic currentEvaluation;

    public Statistics(int arraySize) {
        evaluations = new ArrayList<AlgorithmStatistic>(100);
        this.arraySize = arraySize;
    }

    public void updateMeasurement(Algorithms algorithm, int replay) {
        long comparisons = algorithm.getComparisons();
        double executionTime = algorithm.getExecutionTime();

        currentEvaluation = new AlgorithmStatistic(comparisons, executionTime);
        repetitions = replay;

        evaluations.add(currentEvaluation);

        if (replay > 1) {
            mean = computeMean();
            devStd = standardDeviation();
            error = devStd * 100 / mean;
        }
    }

    public boolean doContinue() {
        return error < (5 * mean);
    }

    public double computeMean() {
        double sum = 0;

        for (AlgorithmStatistic measurement : evaluations)
            sum += measurement.executionTime;

        return sum / evaluations.size();
    }

    public double standardDeviation() {

        double sum = 0;

        for (AlgorithmStatistic measurement : evaluations)
            sum += Math.pow(measurement.executionTime - mean, 2);

        return Math.sqrt(sum / (evaluations.size() - 1));
    }

    @Override
    public String toString() {
        return repetitions + ";" + error + ";" + arraySize + ";" + currentEvaluation;
    }

}