/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program3;
import java.util.Scanner;


/**
 *
 * @author Hernan Manera
 */
public class Program3 {

 public static void main(String args[]){
 // declaracion Variables
 // Variables declaration
 int a;
 float b;
 String s;
 
 //instancia Scanner (tipo de metodo del sistema)
 //Scanner instance (system method type)
 Scanner in = new Scanner(System.in);
 
 // Introducir un string y guardarla como String
 // Enter a string and save it as String
 System.out.println("Introducir una Frase");
 s = in.nextLine();
 System.out.println("Tu frase es "+s);
 
 // introducir un número  y se guarde como int, Integer
 // enter a number and save it as int, Integer
 System.out.println("Enter un Entero");
 a = in.nextInt();
 System.out.println("Tu entero es "+a);
 
 // introducior un numero con decimales
 // enter a number with decimals
 System.out.println("Enter a float");
 b = in.nextFloat();
 System.out.println("Tu numero es "+b); 
 }
}
   //gracias por mirar, sigmos adelante
//thanks for watching, let's move on
    

