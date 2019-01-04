import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String line = scan.nextLine();

        for (int i=0; i<n; i++){
            String first = "";
            String second = "";
            line = scan.nextLine();

            for (int c = 0; c< line.length(); c++){
                char ch = line.charAt(c);
                if (c%2==0){
                    first+=ch;
                }
                else{
                    second+=ch;
                }
            }
            System.out.println(first+" "+second);
        }
        scan.close();
    }
}

