import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int last = A.length()-1;
        if(A.length()==1) {
            System.out.println("Yes");
        }
        for(int i=0; i<A.length()-1; i++) {
           if(A.charAt(i) == A.charAt(last--)) {
              System.out.println("Yes");
              break;
           } else {
            System.out.println("No");
            break;
           }
        }
    }
}



