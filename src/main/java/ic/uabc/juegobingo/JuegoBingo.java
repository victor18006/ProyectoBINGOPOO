/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ic.uabc.juegobingo;

import java.util.Scanner;

/**
 *
 * @author VOM
 */

public class JuegoBingo {

    public static void main(String[] args) {
        // Crear la carta
        Carta carta = new Carta();
        carta.asignarValoresCarta();  // Asignar los valores aleatorios a la carta

        // Crear el objeto Tombola pasando la carta al constructor
        Tombola tombola = new Tombola(carta);  // Pasamos la carta al constructor de Tombola

        // Mostrar la carta
        System.out.println("Tu carta de Bingo:");
        carta.mostrarCarta();

        // Iniciar el juego
        tombola.iniciarJuego();
    }
}