import java.util.Random;

abstract class Generator {
    Random r;

    public enum ArrayType {
        Random("Random"), CuasiRandom("CuasiRandom");

        public String type;

        ArrayType(String s) {
            this.type = s;
        }
    }

    public Generator() {
        r = new Random();
    }

    protected void swapRandom(int[] sortedData, int index) {
        int randomIndex = this.r.nextInt(sortedData.length - index) + index;

        int tmp = sortedData[index];

        sortedData[index] = sortedData[randomIndex];

        sortedData[randomIndex] = tmp;
    }

    abstract public int[] generateArray(int size);
}