/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program5;

/**
 *
 * @author Hernan Manera
 */
public class Program5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaracion de variables
        int row, numberOfStars;
        // inclemental de 1 star a 10 stars
        for (row = 1; row <= 10; row++) {
            for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
