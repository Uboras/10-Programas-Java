/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program4;

import java.util.Scanner;

/**
 *
 * @author Hernan Manera Par o impar Odd and Even
 */
public class Program4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        //Ingreso de numero por consola
        //Number entry through console
        System.out.println("Ingresa un numero para verificar si es par o impar");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        //calcula el modulo
        if (x == 0) {
            System.out.println("Tu número es 0 No es par ni Impar.");
        }else{
        if (x % 2 == 0)/*afirmacion*/ {
            //si es verdadero
            System.out.println("Tu número es Par.");
        } else {
            // si es falso
            System.out.println("Tu número es Impar.");
        }
              }
        }
    }

