import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int convertAndCount(int n){
        int count=0, countMax=0;
        while (n>0){
            if (n%2==1){
                count++;
                if (count>countMax){
                    countMax=count;
                }
            }
            else{
                count=0;
            }
            n=n/2;
        }    
        return countMax; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(convertAndCount(n));
        scanner.close();
    }
}

