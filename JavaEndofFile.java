import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for(int i = 1; sc.hasNext(); i++ ) {
            String str = sc.nextLine();
            System.out.println(i + " " + str);
        }
        
    }
}
