/**
 * Created by Ian on 23-04-2014.
 */
public abstract class Algorithms {
	
	public long comparisons;
	public long executionTime;
	public long auxTime;

    public abstract int[] sort(int[] data);
   
    public abstract long getComparisons();
    
    public abstract long getExecutionTime();

}
