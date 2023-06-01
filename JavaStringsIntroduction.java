import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        int c = a+b;
        System.out.println(c);
        int check = A.compareTo(B);
        if(check > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,a) + " " + B.substring(0,1).toUpperCase() + B.substring(1,b));
        
    }
}
