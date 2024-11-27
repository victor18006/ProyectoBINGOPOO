/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegobingo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VOM
 */

public class Tombola {
    private ArrayList<Integer> numeros;
    private Carta carta;  // Referencia a la carta del jugador

    // Constructor de Tombola que recibe la carta del jugador
    public Tombola(Carta carta) {
        this.carta = carta;  // Asignamos la carta al objeto Tombola
        numeros = new ArrayList<>();
        // Rellenar el ArrayList con los números del 1 al 75 (o hasta el número que desees)
        for (int i = 1; i <= 75; i++) {  // Cambia 75 si quieres más bolas
            numeros.add(i);
        }
    }

    // Método para sacar una bola aleatoria
    public int sacarBola() {
        Random random = new Random();
        int index = random.nextInt(numeros.size());
        int bola = numeros.get(index);
        numeros.remove(index);  // Elimina la bola sacada
        return bola;
    }

    // Método para interactuar con el jugador y sacar una bola cuando presiona 1
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Presiona '1' para sacar una bola...");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                int bola = sacarBola();
                System.out.println("La bola sacada es: " + bola);
                // Marca la bola en la carta
                boolean bolaMarcada = carta.marcarBola(bola);  
                
                if (bolaMarcada) {
                    System.out.println("La bola " + bola + " ha sido marcada en tu carta.");
                } else {
                    System.out.println("La bola " + bola + " no está en tu carta.");
                }

                // Muestra la carta actualizada después de marcar la bola
                System.out.println("Tu carta de Bingo actualizada:");
                carta.mostrarCarta(); // Muestra la carta después de marcar la bola
            } else {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        }
    }
}