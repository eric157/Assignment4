package MyPackage;
//Write a program which takes the values of length and breadth from user and check if it is a square or not.
import java.util.Scanner;
public class Assign4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int l = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        if (l==b){
            System.out.println("SQUARE");
        }
        else
            System.out.println("Rectangle");
    }
}
