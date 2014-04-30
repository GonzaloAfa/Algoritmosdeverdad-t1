import java.io.*;

/**
 * Main
 *		> Metodo que arranque
 *		> Iterar
 * > Tamaño del arreglo
 * > Tipo de arreglo
 *			> Repeticiones por el tema del error
 *			> Correr cada algoritmo
 * */

class Main {

    static public void main(String[] args) throws IOException {

        int maxReplays = 5000;

        int minSizeArray = 10;
        int maxSizeArray = 20;

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        Algorithms algorithm[] = {bubble, insertion, merge, quick};

        // Type Array
        RandomGenerator randomArray = new RandomGenerator();
        AlmostOrderedGenerator almostOrderedArray = new AlmostOrderedGenerator();

        Generator array[] = {randomArray, almostOrderedArray};


        // Size Array
        int size[] = new int[maxSizeArray - minSizeArray + 1];

        // Init Array
        for (int i = 0; i < size.length; i++)
            size[i] = (int) Math.pow(2.0, (double) (minSizeArray + i));

        // start algorithm.

        // Type array
        for (int type = 0; type < array.length; type++) {

            // Algorithm type
            for (int i = 0; i < algorithm.length; i++) {

                Generator.ArrayType arrayType = type == 1 ? Generator.ArrayType.Random : Generator.ArrayType.CuasiRandom;

                // Print information run algorithm
                System.out.println(algorithm[i].getName() + " \t\t: " + arrayType.type);

                DataReport dataReporter = new DataReport(arrayType, algorithm[i], true);

                // Size array
                for (int p = 0; p < size.length; p++) {

                    // Reset the statistics object
                    Statistics statistics = new Statistics(size[p]);

                    // replay
                    for (int replay = 0; replay < maxReplays; replay++) {

                        // generate Array
                        int unsortedData[] = array[type].generateArray(size[p]);

                        // mSort
                        int sortedData[] = algorithm[i].sort(unsortedData);

                        statistics.updateMeasurement(algorithm[i], replay);

                        // Save information
                        dataReporter.makeReport(statistics);

                        // Check if error is lower than 5%
                        if (statistics.doContinue() && replay > 1)
                            break;

                    }
                    dataReporter.makeSummary(statistics);
                    dataReporter.flush();
                }
                dataReporter.close();
            }
        }
    }


    public static void viewData(int sortedData[]) {
        for (int i = 0; i < sortedData.length; i++) {
            System.out.print(sortedData[i] + " | ");
        }
        System.out.println("");

    }
} 