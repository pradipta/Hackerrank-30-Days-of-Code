import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap <String,Integer> phoneDir = new HashMap <>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneDir.put (name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            //boolean contains= phoneDir.containsKey(s);
            if (phoneDir.containsKey(s)){
                //int temp= phoneDir.get(s);
                System.out.println(s+"="+phoneDir.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

