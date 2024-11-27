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

public class Carta {
    private ArrayList<Integer> carta;
    private String[][] posicion;

    public Carta() {
        carta = new ArrayList<>();
        posicion = new String[5][5];  // 5x5 para la carta
    }

    // Asignar valores a la carta (sin argumento de configuración)
    public void asignarValoresCarta() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    posicion[i][j] = "*";  // Centro vacío
                } else {
                    int valor;
                    do {
                        valor = (int) (Math.random() * 75) + 1;  // Números del 1 al 75
                    } while (carta.contains(valor));  // Evita duplicados
                    carta.add(valor);
                    posicion[i][j] = String.valueOf(valor);
                }
            }
        }
    }

    // Getter para la matriz 'posicion' de la carta
    public String[][] getPosicion() {
        return posicion;
    }

    // Método para marcar una bola en la carta
    public boolean marcarBola(int bola) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (posicion[i][j].equals(String.valueOf(bola))) {
                    posicion[i][j] = "X";  // Marca la bola
                    return true;
                }
            }
        }
        return false;  // Bola no encontrada
    }

    // Mostrar la carta de manera visual
    public void mostrarCarta() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(posicion[i][j] + "\t");
            }
            System.out.println();
        }
    }
}