package MyPackage;
import java.util.Scanner;
//Write a program to print absolute value of a number entered by the user.
public class Assign4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        if (i==0){
            System.out.println("0");
        } else if (i>=0) {
            System.out.println(i);
        }
        else{
            i *= -1;
            System.out.println(i);
        }
    }
}
