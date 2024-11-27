/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegobingo;

import java.util.ArrayList;

/**
 *
 * @author VOM
 */

public class Bingo {
    private ArrayList<Carta> cartas;  // Lista de cartas del jugador
    private Tombola tombola;  // Tómbola que sacará los números
    private ConfiguracionCarta configuracionCarta;  // Configuración para la carta

    public Bingo() {
        cartas = new ArrayList<>();  // Inicializamos la lista de cartas
        configuracionCarta = new ConfiguracionCarta();  // Inicializamos la configuración
    }

    // Método para añadir una carta al juego
    public void añadirCarta(Carta carta) {
        cartas.add(carta);
    }

    // Comparar los valores de la carta con la bola que salió
    public boolean compararValorCartaConBolaQueSalio(int bola) {
        for (Carta carta : cartas) {
            // Comparar la bola con los valores en la carta
            if (carta.marcarBola(bola)) {
                System.out.println("¡La bola " + bola + " está en la carta!");
                return true;
            }
        }
        System.out.println("La bola " + bola + " no está en ninguna carta.");
        return false;
    }

    // Método para iniciar el juego con interacciones
    public void iniciarJuego() {
        // Crear y asignar cartas, puedes añadir más cartas aquí según el número de jugadores
        Carta carta = new Carta();  // Crear una carta
        carta.asignarValoresCarta();  // Asignar los valores a la carta
        añadirCarta(carta);  // Añadir la carta al juego

        tombola = new Tombola(carta);  // Crear la tómbola y asociarla con la carta

        // Mostrar las cartas del jugador
        System.out.println("Cartas del jugador:");
        for (Carta c : cartas) {
            c.mostrarCarta();  // Mostrar cada carta
        }

        // Iniciar el juego en la tómbola
        tombola.iniciarJuego();
    }
}