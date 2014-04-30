
import java.io.*;

/*
    Obtener los datos
	Generar tablas y todas esas cosas.
*/
class DataReport {

    String header = "N° repeticiones;Error;Tamano del arreglo;N° comparaciones;Tiempo de ejecucion;";

    private PrintWriter writer;
    public boolean console;


    public DataReport(Generator.ArrayType arrayType, Algorithms algorithm, boolean console) {
        // First create the folder
        File theDir = new File("results");
        if (!theDir.exists())
            theDir.mkdir();

        String filename = "results/" + algorithm.getName() + "-" + arrayType.type + ".txt";
        this.console = console;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));

            writer.println(header);
            if (console)
                System.out.println("" + header);
        } catch (IOException e) {
            System.out.println("ERROR ABRIENDO ARCHIVO!!!");
        }
    }

    public void makeReport(Statistics statistic) {
        writer.println("" + statistic);
        if (console)
            System.out.println("" + statistic);
    }

    public void close() {
        writer.close();
    }
}