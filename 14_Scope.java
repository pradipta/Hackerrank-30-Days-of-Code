import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int [] arr){
        this.elements=arr;
    }
    int maxDiff = 0;
    int absDiff=0;
    public void computeDifference(){
        for(int i=0; i<elements.length; i++){
            for(int j=0; j<elements.length; j++){
                absDiff = Math.abs (elements [i] - elements [j]);
                if (absDiff > maxDiff){
                    maxDiff=absDiff;
                }
            }
        }
        //System.out.println(maxDiff);
        maximumDifference=maxDiff;
        //return maximumDifference;
    }
    
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
