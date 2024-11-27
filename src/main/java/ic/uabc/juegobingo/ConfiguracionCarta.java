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

public class ConfiguracionCarta {
    private ArrayList<Integer> numerosConfiguracion; // Almacena los números de la configuración

    public ConfiguracionCarta() {
        numerosConfiguracion = new ArrayList<>();
    }

    public ArrayList<Integer> getNumerosConfiguracion() {
        return numerosConfiguracion;
    }

    // Configurar la carta según la configuración seleccionada
    public void configurarCartaConConfiguracion(Carta carta, int configuracion) {
        numerosConfiguracion.clear(); // Limpiar para evitar acumulaciones

        switch (configuracion) {
            case 1:
                // Tomar los valores de la primera fila de la carta
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[0][i]; // Primera fila
                    if (!valor.equals("*")) { // Ignorar el espacio vacío si existiera
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 1: Números de la primera fila: " + numerosConfiguracion);
                break;

            case 2:
                // Otra configuración (puedes añadir otras reglas aquí)
                break;

            default:
                System.out.println("Configuración no válida. Intenta de nuevo.");
                break;
        }
    }
}