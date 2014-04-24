/**
 * Created by Ian on 24-04-2014.
 */
public class RandomGenerator extends Generator {

    public RandomGenerator() {
        super();
    }

    public int[] generateArray(int size) {
        int[] array = new int[size];

        // Ordered array
        for (int i = 0; i < size; i++)
            array[i] = i + 1;

        // Let's randomize the array
        for (int i = 0; i < size; i++)
            swapRandom(array, i);

        return array;
    }
}
