import java.util.*;

public class reversestringsum {
    public static void main(String args[]) {
        int n = 234567;
    while( n > 0 ) {
        int lastDigit = n % 10;
        System. out.print(lastDigit) ;
        n= n / 10; //n/=10
        
        }
        
        System.out.println();
        
}
}

// rev = (rev*10) + last digit;