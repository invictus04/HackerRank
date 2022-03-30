import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        String us  = usFormat.format(payment);
        String india  = inFormat.format(payment);
        String china  = chFormat.format(payment);
        String france  = frFormat.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
