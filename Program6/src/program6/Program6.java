/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program6;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Program6 {

 public static void main(String args[])
 {
//letra por letra
     String original, reverse = "";
 Scanner in = new Scanner(System.in);
 System.out.println("Enter a string to reverse");
 original = in.nextLine();
 int length = original.length();
 for ( int i = length - 1 ; i >= 0 ; i-- )
 reverse = reverse + original.charAt(i);
 System.out.println("Reverse of entered string is: "+reverse);


// metedodo de los strings

 StringBuffer a = new StringBuffer("Esta Palabra se lee igual al derecho y al revez: oso\n" +
"reconocer\n" +
"radar\n" +
"salas\n" +
"anita lava la tina");
     System.out.println("---------------derecho------------");
     System.out.println(a);
     System.out.println("---------------Revez--------------");
 System.out.println(a.reverse());



    }
    
}
