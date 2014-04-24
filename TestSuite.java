import java.util.Arrays;

/**
 * Created by Ian on 24-04-2014.
 */
public class TestSuite {

    public static void main(String[] args) {
        Generator gen = new RandomGenerator();
        Generator aGen = new AlmostOrderedGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println("Random array: " + Arrays.toString(gen.generateArray(30)));
            System.out.println("Almost random array: " + Arrays.toString(aGen.generateArray(30)));
        }
    }
}
