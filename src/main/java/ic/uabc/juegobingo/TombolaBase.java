/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegobingo;

/**
 *
 * @author VOM
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class TombolaBase implements ITombola {
    protected ArrayList<Integer> numeros;       // Números en la tómbola
    protected ArrayList<Integer> historial;    // Historial de números sacados

    public TombolaBase() {
        numeros = new ArrayList<>();
        historial = new ArrayList<>();
    }

    // Método para rellenar la tómbola con números
    protected void llenarNumeros(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            numeros.add(i);
        }
    }

    @Override
    public int sacarBola() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("No quedan bolas en la tómbola.");
        }
        int index = new Random().nextInt(numeros.size());
        int bola = numeros.remove(index);
        historial.add(bola);
        return bola;
    }

    // Método abstracto que debe implementar cualquier tómbola concreta
    public abstract void iniciarJuego();
}