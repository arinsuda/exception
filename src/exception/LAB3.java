/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Student
 */
public class LAB3 {
    public static void main(String[] args){
        int[] list = new int[10];
        try {
            System.out.println("Statements 1");
            System.out.println(list[10]);
            System.out.println("Statements 3");
        }
        catch (ArithmeticException e){
        
        }
        finally {
            System.out.println("Statements 4");
        }
        System.out.println("Statements 5");
    }
}
