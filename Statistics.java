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

    AlgorithmStatistic[] algorithms = new AlgorithmStatistic[4];

    public Statistics() {
        for (int i = 0; i < 4; i++) {
            algorithms[i] = new AlgorithmStatistic();
        }
    }

    public void updateMeasurement(long comparisons, double executionTime, int repetitions,
                                  int error, int arraySize, String arrayType, DataReport.Algorithm currAlgorithm) {
        algorithms[currAlgorithm.i].appendMeasurement(comparisons, executionTime, repetitions,
                error, arraySize, arrayType);

    }
}