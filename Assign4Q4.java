package MyPackage;
import java.util.Scanner;
//Write a program to print positive number entered by the user, if user enters a negative
//number, it is skipped
public class Assign4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer:");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("The number is negative and skipped");
        }
        else {
            System.out.println("The number entered:"+n);
        }
    }
}
