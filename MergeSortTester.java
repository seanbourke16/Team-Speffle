/*======================================
  class MergeSortTester
  ALGORITHM:
1. Continuously split the list through recursion until each list has a only one element in it.
2. Sort the list, by comparing the first element of each list (There should be two, since each recursion divides the list in half). Continue to do this until all the elements are sorted.
3. Repeat step 2 for recursion up the chain until the first recursion, which will return a sorted list.

  BIG-OH CLASSIFICATION OF ALGORITHM:
My trio came up with a runtime of O(nlog(n)). We split the alogithm into 
two parts: the splitting up of the numbers and the merging of the numbers.
The first part of the algorithm is O(n). This is because it touches every 
element once before its done. The second part is O(nlog(n)) because it goes 
through every element multiple times but not quite n^2. This would make the 
total for the algoritm O(n+nlog(n)) but this is effectivly O(nlog(n)).

  Mean execution times for dataset of size n:
  Batch size: <10>
  n=1       time: 32901.1 nanoseconds 
  n=10      time: 38941.5 nanoseconds
  n=100     time: 96679.7 nanoseconds
  ...
  n=10000   time: 1.71164 * 10^6 nanoseconds
  n=100000  time: 1.39364 * 10^7 nanoseconds
  n=<1000000>  time: 1.40515 * 10^8 nanoseconds
  ANALYSIS:
  The sort is extremely efficient. As can be seen with the results, the runtime execution
  times increase relatively slowly from n sizes from 1 to 100. Then it increases in a 
  manner that more closely resembles 10s (where s = log(n - 10000) where n >= 10000), as
  n moves past 10000. This indicates that the runtime increases in a manner faster than
  O(n) and slower than O(n^2), thereby reinforcing that merge sort runs with O(nlog(n)).
  ======================================*/

public class MergeSortTester 
{
  public static void populate (int[] arr) {
    for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(50 * Math.random());
        }
  }

    /******************************
     * execution time analysis 
     * The testing apparatis uses an int array Franz of various size. It first replaces each
     * element of the array with with a randomly generated value between 0 and 49. Then it
     * takes the current value of the system timer in nanoseconds, runs the sort, and adds
     * the difference of the new value of the system timer and the value before the sort
     * to a sum. This process is repeated 10 times. Afterwhich, the average of the 10 times
     * is printed for the user to analyze.
     ******************************/
    public static void main( String[] args ) 
    {
	int[] Franz = new int[100000];
        double Time = 0;
        double initial;

	//Times the merge sort for 10 separate sorts.
        for (int i = 0; i < 10; i++) {
	     populate(Franz);	     
             initial = System.nanoTime();
             MergeSort.sort(Franz);
             Time += System.nanoTime() - initial;
        }

        // Average the times
        Time /= 10;

        System.out.println("Merge Sort took an average of " + Time + " nanoseconds.");
    }//end main

}//end class
