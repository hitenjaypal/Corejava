import java.util.*;

public class Elseifincometaxcalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2); // (int) use for correct answer otherwise type caste concept interputs
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is : " + tax);

    }
}
