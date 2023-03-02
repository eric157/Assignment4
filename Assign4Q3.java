package MyPackage;
import java.util.Scanner;
//Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//calculate Profit or Loss.
public class Assign4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            System.out.println("Enter Selling Price");
            int sp = sc.nextInt();
            System.out.println("Enter Cost Price");
            int cp = sc.nextInt();
            if (sp == cp) {
                System.out.println("Break Even");
            } else if (sp > cp) {
                int profit = sp - cp;
                System.out.println("Profit:" + profit);
            } else {
                int loss = cp - sp;
                System.out.println("Loss:" + loss);
            }
        }
    }
}