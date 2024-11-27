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
    /*public void configurarCartaConConfiguracion(Carta carta, int configuracion) {
        numerosConfiguracion.clear(); // Limpiar para evitar acumulaciones

        switch (configuracion) {
            case 1:
                // Tomar los valores de la primera fila de la carta
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][0]; // Primera columna
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
    }*/
    public ArrayList<Integer> configurarCartaConConfiguracion(Carta carta, int configuracion) {
        ArrayList<Integer> numerosConfiguracion = new ArrayList<>();

        switch (configuracion) {
            case 1: // Primera fila
                // Tomar los valores de la primera fila de la carta
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][0]; // Primera columna
                    if (!valor.equals("*")) { // Ignorar el espacio vacío si existiera
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 1: Números de la primera fila: " + numerosConfiguracion);
                break;
            case 2: // Segunda fila
                /*for (int j = 0; j < 5; j++) {
                    numerosConfiguracion.add(valoresCarta[1][j]);
                }*/
                break;
            // Agrega más configuraciones según sea necesario
            default:
                System.out.println("Configuración no válida. Se seleccionará la primera fila por defecto.");
                /*for (int j = 0; j < 5; j++) {
                    numerosConfiguracion.add(valoresCarta[0][j]);
                }*/
        }

        return numerosConfiguracion;
    }
}
