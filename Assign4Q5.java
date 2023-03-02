package MyPackage;
import java.util.Scanner;
//Create a calculator using switch statement to perform addition, subtraction, multiplication
//and division.
public class Assign4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(0==0) {
            System.out.println("Enter any of these Operator(+,-,x,/)");
            char op = sc.next().charAt(0);
            if (op != '+' && op != '-' && op != 'x' && op != '/') {
                System.out.println("Invalid Input");
                continue;
            } else {
                System.out.print("Enter number 1:");
                double a = sc.nextDouble();
                System.out.print("Enter number 2:");
                double b = sc.nextDouble();
                double ans = 0;
                switch (op) {
                    case '+':
                        ans = a + b;
                        break;
                    case '-':
                        ans = a - b;
                        break;
                    case 'x':
                        ans = a * b;
                        break;
                    case '/':
                        ans = a / b;
                        break;
                }
                System.out.println("Answer:" + ans);
            }
        }
    }
}
