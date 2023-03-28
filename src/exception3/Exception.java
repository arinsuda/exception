
package exception3;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    try {
            System.out.println(number1+"/"+number2+" is "+(number1/number2));
    } catch (ArithmeticException e) {
            System.out.println("Divisor cannot be zero");
        }
    }

    String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}