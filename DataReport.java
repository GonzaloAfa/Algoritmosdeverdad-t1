import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
    Obtener los datos
	Generar tablas y todas esas cosas.
*/
class DataReport {

    String header = "Numero de comparaciones;Tiempo de ejecución;Numero de repeticiones;" +
            "Error del experimento;Tamaño del arreglo;Tipo de arreglo";

    PrintWriter[] writers = new PrintWriter[4];

    public enum Algorithm {
        BUBBLESORT(0), INSERTIONSORT(1), MERGESORT(2), QUICKSORT(3);

        public int i;

        Algorithm(int i) {
            this.i = i;
        }
    }

    public DataReport() {
        try {
            writers[0] = new PrintWriter(new BufferedWriter(new FileWriter("results/bubblesort.txt", true)));
            writers[1] = new PrintWriter(new BufferedWriter(new FileWriter("results/insertionsort.txt", true)));
            writers[2] = new PrintWriter(new BufferedWriter(new FileWriter("results/mergesort.txt", true)));
            writers[3] = new PrintWriter(new BufferedWriter(new FileWriter("results/quicksort.txt", true)));

            for (int i = 0; i < 4; i++)
                writers[i].println(header);
        } catch (IOException e) {
            System.out.println("ERROR ABRIENDO ARCHIVOS!!!");
        }
    }

    public void makeReport(long comparisons, double executionTime, int repetitions,
                           int error, int arraySize, String arrayType, Algorithm currAlgorithm) {
        writers[currAlgorithm.i].println(comparisons + ";" + executionTime + ";" + repetitions
                + ";" + error + ";" + arraySize + ";" + arrayType);
    }

    public void closeAll() {
        for (int i = 0; i < 4; i++)
            writers[i].close();
    }
}