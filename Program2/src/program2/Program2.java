/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program2;

/**
 *
 * @author Hernan Manera Vamos a mostrar la una variable numerica y mostrar los
 * argumentos que aparecen en nuestra app (recuerden que para modificicar los
 * argumentos hay que ir al proyecto click derecho, propiedades, Run, Argumentos
 * y completar los datos que queramos que reciba) [Martin Ester y gloria] van a
 * a ser mis argumentos
 *
 */
public class Program2 {

    public static void main(String[] args) {
        int c;
//declaracion variable
//declaring a variable


//mostramos numeros del 1 al 10 , le atribuimos el numero 1 y luego incrementa hasta 10
/* Using for loop to repeat instruction execution of 1 to 10 */

        for (c = 1; c <= 10; c++) {
            System.out.println(c);
        }
//mostramos los argumentos1        
/* Using for loop to repeat instruction execution */
        for (String t : args) {
            System.out.println(t);
        }

    }
}
   //gracias por mirar, sigmos adelante
//thanks for watching, let's move on
    