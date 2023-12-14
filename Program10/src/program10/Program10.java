/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program10;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Program10 {
private static int factorial(int n){
 if (n == 1)
 return 1;
 else
 return(n * factorial(n-1));
 }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("¿que factorial queres?");
int num = sc.nextInt();
    System.out.println("Factorial de "+num+"  es : "+factorial(num));
}
} 