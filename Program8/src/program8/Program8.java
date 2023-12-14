/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program8;

import java.io.IOException;

/**
 *
 * @author Herna
 */
public class Program8 {

    public static void main(String[] args) {
        // app a abrir (usar path para apps en particular)
        String app = "notepad";
        //path (cambiarla para que funcione)
        String valorant = "C:\\Riot Games\\Riot Client\\RiotClientServices.exe";
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec(app);
            rs.exec(valorant);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
