
public static void BubbleSort(int[] data){

    int n = data.length;

    for (int pass = 1; pass < n; pass++) { // count how many times

        // This next loop becomes shorter and shorter
        for (int i=0; i < n-pass; i++) {
            if (data[i] > data[i+1]) {

                // exchange elements
                int temp    = data[i];
                data[i]     = data[i+1];
                data[i+1]   = temp;
            }
        }
    }
}