/**
 * Created by Ian on 24-04-2014.
 */
public class AlmostOrderedGenerator extends Generator {

    public AlmostOrderedGenerator() {
        super();
    }

    public int[] generateArray(int size) {
        int[] array = new int[size];

        // Ordered array
        for (int i = 0; i < size; i++)
            array[i] = i + 1;

        // Select the 5% of the elements to swap
        int changedElements = (int) Math.round(size * 0.05);

        // Let's randomize the array
        for (int i = 0; i < changedElements; i++) {
            int randomIndex = this.r.nextInt(size - i) + i;
            swapRandom(array, randomIndex);
        }

        return array;
    }
}
