/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program7;

/**
 *
 * @author Hernan Manera
 */
import java.util.Scanner;

public class Program7 {

    public static void main(String args[]) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantas columnas y filas quieres");
        m = in.nextInt();
        n = in.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Introduci los elementos");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                matrix[c][d] = in.nextInt();
            }
        }
        System.out.println("Matriz ");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(matrix[c][d] + "\t");
            }
            System.out.println("\n");
        }
        
        int transpose[][] = new int[n][m];
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                transpose[d][c] = matrix[c][d];
            }
        }
        
        System.out.println("Matriz invertida:-");
        for (c = 0; c < n; c++) {
            for (d = 0; d < m; d++) {
                System.out.print(transpose[c][d] + "\t");
            }
            System.out.print("\n");
        }

    }
}
