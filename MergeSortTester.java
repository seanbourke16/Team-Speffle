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
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

    }//end main

}//end class
