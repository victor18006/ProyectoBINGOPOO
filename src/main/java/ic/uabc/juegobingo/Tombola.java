/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegobingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VOM
 */

/*public class Tombola {
    private ArrayList<Integer> numeros;       // Números en la tómbola
    private ArrayList<Integer> historial;      // Historial de números sacados
    private Carta carta;                       // Referencia a la carta del jugador
    private ConfiguracionCarta configuracionCarta;
    private boolean salioBola;

    public Tombola(Carta carta) {
        this.carta = carta;
        numeros = new ArrayList<>();
        historial = new ArrayList<>();
        // Rellenar la tómbola con números del 1 al 75
        for (int i = 1; i <= 75; i++) {
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

    // Método para interactuar con el jugador y sacar bolas
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar configuración al jugador
        configuracionCarta = new ConfiguracionCarta();
        System.out.println("Ingresa el número de configuración que deseas (1, 2, etc.): ");
        int configuracion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Configurar la carta según la configuración elegida
        ArrayList<Integer> numerosConfiguracion = configuracionCarta.configurarCartaConConfiguracion(carta, configuracion);
        System.out.println("Números seleccionados según la configuración:");
        System.out.println(numerosConfiguracion);

        // Usar un HashSet para rastrear los números marcados
        HashSet<Integer> numerosMarcados = new HashSet<>();

        while (true) {
            System.out.println("\nPresiona '1' para sacar una bola o escribe 'salir' para terminar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Juego terminado.");
                break;
            }

            if (input.equals("1")) {
                // Inicializamos la bandera en `false` al inicio del ciclo
                salioBola = false;

                do {
                    int bola = sacarBola();
                    System.out.println("La bola sacada es: " + bola);

                    // Verificar si la bola está en la configuración
                    if (numerosConfiguracion.contains(bola)) {
                        System.out.println("¡La bola " + bola + " está en tu configuración!");
                        carta.marcarBola(bola); // Marcar el número en la carta
                        numerosMarcados.add(bola); // Añadir al conjunto de números marcados
                        salioBola = true; // Actualizamos la bandera a `true`
                        historial.add(bola); // Agregar la bola al historial
                    } else {
                        System.out.println("La bola " + bola + " no está en tu configuración.");
                    }

                    // Mostrar la carta actualizada después de marcar la bola
                    System.out.println("\nTu carta de Bingo actualizada:");
                    carta.mostrarCarta();

                    // Mostrar historial
                    System.out.println("\nHistorial de bolas:");
                    for (int num : historial) {
                        String estado = numerosConfiguracion.contains(num) ? " (En configuración)" : " (No en configuración)";
                        System.out.println("Bola " + num + estado);
                    }
                } while (!salioBola); // Repetimos mientras `salioBola` sea `false`
                
                // Verificar si se ha completado la configuración
                if (numerosMarcados.containsAll(numerosConfiguracion)) {
                    System.out.println("\n¡FELICIDADES! Has completado la configuración. JUEGO TERMINADO.");
                    break;
                }
            } else {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        }
    }
}*/

/*import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Tombola implements ITombola {
    private ArrayList<Integer> numeros;       // Números en la tómbola
    private ArrayList<Integer> historial;      // Historial de números sacados
    private Carta carta;                       // Referencia a la carta del jugador
    private ConfiguracionCarta configuracionCarta;
    private boolean salioBola;

    public Tombola(Carta carta) {
        this.carta = carta;
        numeros = new ArrayList<>();
        historial = new ArrayList<>();
        // Rellenar la tómbola con números del 1 al 75
        for (int i = 1; i <= 75; i++) {
            numeros.add(i);
        }
    }

    @Override
    public int sacarBola() {
        Random random = new Random();
        int index = random.nextInt(numeros.size());
        int bola = numeros.get(index);
        numeros.remove(index);  // Elimina la bola sacada
        return bola;
    }

    @Override
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar configuración al jugador
        configuracionCarta = new ConfiguracionCarta();
        System.out.println("Ingresa el número de configuración que deseas (1, 2, etc.): ");
        int configuracion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Configurar la carta según la configuración elegida
        ArrayList<Integer> numerosConfiguracion = configuracionCarta.configurarCartaConConfiguracion(carta, configuracion);
        System.out.println("Números seleccionados según la configuración:");
        System.out.println(numerosConfiguracion);

        // Usar un HashSet para rastrear los números marcados
        HashSet<Integer> numerosMarcados = new HashSet<>();

        while (true) {
            System.out.println("\nPresiona '1' para sacar una bola o escribe 'salir' para terminar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Juego terminado.");
                break;
            }

            if (input.equals("1")) {
                // Inicializamos la bandera en `false` al inicio del ciclo
                salioBola = false;

                do {
                    int bola = sacarBola();
                    System.out.println("La bola sacada es: " + bola);

                    // Verificar si la bola está en la configuración
                    if (numerosConfiguracion.contains(bola)) {
                        System.out.println("¡La bola " + bola + " está en tu configuración!");
                        carta.marcarBola(bola); // Marcar el número en la carta
                        numerosMarcados.add(bola); // Añadir al conjunto de números marcados
                        salioBola = true; // Actualizamos la bandera a `true`
                        historial.add(bola); // Agregar la bola al historial
                    } else {
                        System.out.println("La bola " + bola + " no está en tu configuración.");
                    }

                    // Mostrar la carta actualizada después de marcar la bola
                    System.out.println("\nTu carta de Bingo actualizada:");
                    carta.mostrarCarta();

                    // Mostrar historial
                    System.out.println("\nHistorial de bolas:");
                    for (int num : historial) {
                        String estado = numerosConfiguracion.contains(num) ? " (En configuración)" : " (No en configuración)";
                        System.out.println("Bola " + num + estado);
                    }
                } while (!salioBola); // Repetimos mientras `salioBola` sea `false`
                
                // Verificar si se ha completado la configuración
                if (numerosMarcados.containsAll(numerosConfiguracion)) {
                    System.out.println("\n¡FELICIDADES! Has completado la configuración. JUEGO TERMINADO.");
                    break;
                }
            } else {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        }
    }
}*/

import java.util.HashSet;
import java.util.Scanner;

public class Tombola extends TombolaBase {
    private Carta carta;
    private ConfiguracionCarta configuracionCarta;

    public Tombola(Carta carta) {
        super();  // Llama al constructor de la clase base
        this.carta = carta;
        llenarNumeros(1, 75);  // Llena la tómbola con números del 1 al 75
    }

    @Override
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        configuracionCarta = new ConfiguracionCarta();
        System.out.println("Ingresa el número de configuración que deseas (1, 2, etc.): ");
        int configuracion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        ArrayList<Integer> numerosConfiguracion = configuracionCarta.configurarCartaConConfiguracion(carta, configuracion);
        System.out.println("Números seleccionados según la configuración:");
        System.out.println(numerosConfiguracion);

        HashSet<Integer> numerosMarcados = new HashSet<>();
        boolean salioBola;

        while (true) {
            System.out.println("\nPresiona '1' para sacar una bola o escribe 'salir' para terminar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Juego terminado.");
                break;
            }

            if (input.equals("1")) {
                salioBola = false;

                do {
                    int bola = sacarBola();
                    System.out.println("La bola sacada es: " + bola);

                    if (numerosConfiguracion.contains(bola)) {
                        System.out.println("¡La bola " + bola + " está en tu configuración!");
                        carta.marcarBola(bola);
                        numerosMarcados.add(bola);
                        salioBola = true;
                    } else {
                        System.out.println("La bola " + bola + " no está en tu configuración.");
                    }

                    System.out.println("\nTu carta de Bingo actualizada:");
                    carta.mostrarCarta();

                    System.out.println("\nHistorial de bolas:");
                    for (int num : historial) {
                        String estado = numerosConfiguracion.contains(num) ? " (En configuración)" : " (No en configuración)";
                        System.out.println("Bola " + num + estado);
                    }
                } while (!salioBola);

                if (numerosMarcados.containsAll(numerosConfiguracion)) {
                    System.out.println("\n¡FELICIDADES! Has completado la configuración. JUEGO TERMINADO.");
                    break;
                }
            } else {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        }
    }
}

