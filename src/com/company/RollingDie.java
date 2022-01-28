package com.company;

/* A statistician is studying sequences of numbers obtained by repeatedly tossing a 6-sided die.
The statistician is particularly interested in runs of numbers.  A run occurs when 2 or more
consecutive tosses of the die produce the same value.  For example, in the following sequence of
die rolls, there are runs starting at positions 1,6,12,and 14.

Index: 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17
Result: 1  5  5  4  3  1  2  2  2  6  1  3  3  5  5  5  5  5

The die is represented by the following class:
*/

public class RollingDie {
    /** @return an integer value between 1 and 6
     */
    public int toss()
    {
        return (int)(6 * Math.random()) + 1;
    }

 /* Write the method getRolls that takes a number of tosses as a parameter.  The method
 should return an array of values produced by rolling the die the given number of times.
 */

    /** Returns an array of the values obtained by tossing the die numTosses times.
     *  @param numTosses the number of die tosses
     *       Precondition: numTosses >0
     * @return an array of numTosses values
     */
    public int[] getRolls(int numTosses)
    {
        int[] totalTosses = new int[numTosses];
        for (int i = 0; i < totalTosses.length; i++){
            totalTosses[i] = toss();
        }
        return totalTosses;
    }




 /*Write the method getBestRun that takes as its parameter a array of integer values
 representing a series of die tosses.  The method returns the starting index in the array
 of a run of maximum size.  A run is defined as the repeated occurrence of the same value
 in 2 or more consecutive positions in the array.  If there are 2 runs of the same size
 it may return either index.  If there are no runs, the method returns -1.
 Precondition:  values.length > 0
 */

    public int getBestRun(int[] values)
    {
        int bestcount = 0;
        int count = 0;
        int bestindex = 0;

        for(int i = 0; i < values.length - 1; i++){
            if (values[i] == values[i+1]) {
                count++;
            }
            else {
                if (count > bestcount) {
                    bestcount = count;
                    bestindex = i-count + 1;
                }
                count = 0;
            }
        }
        return bestindex - 1;
    }


    public static void main(String[] args) {
        RollingDie nc = new RollingDie();

        for (int p = 0; p < 10; p++) {
            int[] tossArr = nc.getRolls(20);
            for (int i = 0; i < 20; i++)
                System.out.print(tossArr[i] + ",");
            System.out.println();

            int x = nc.getBestRun(tossArr);
            System.out.println(x);
        }
    }

}
