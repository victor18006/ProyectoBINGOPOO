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

    public ArrayList<Integer> configurarCartaConConfiguracion(Carta carta, int configuracion) {
        ArrayList<Integer> numerosConfiguracion = new ArrayList<>();

        switch (configuracion) {
            // COLUMNAS
            case 1: // Primera columna
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][0];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 1: Números de la primera columna: " + numerosConfiguracion);
                break;

            case 2: // Segunda columna
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][1];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 2: Números de la segunda columna: " + numerosConfiguracion);
                break;

            case 3: // Tercera columna
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][2];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 3: Números de la tercera columna: " + numerosConfiguracion);
                break;

            case 4: // Cuarta columna
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][3];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 4: Números de la cuarta columna: " + numerosConfiguracion);
                break;

            case 5: // Quinta columna
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][4];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 5: Números de la quinta columna: " + numerosConfiguracion);
                break;

            // DIAGONAL
            case 6: // Diagonal principal (de arriba izquierda a abajo derecha)
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 6: Números de la diagonal principal: " + numerosConfiguracion);
                break;

            // FILAS
            case 7: // Primera fila
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[0][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 7: Números de la primera fila: " + numerosConfiguracion);
                break;

            case 8: // Segunda fila
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[1][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 8: Números de la segunda fila: " + numerosConfiguracion);
                break;

            case 9: // Tercera fila
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[2][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 9: Números de la tercera fila: " + numerosConfiguracion);
                break;

            case 10: // Cuarta fila
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[3][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 10: Números de la cuarta fila: " + numerosConfiguracion);
                break;

            case 11: // Quinta fila
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[4][i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 11: Números de la quinta fila: " + numerosConfiguracion);
                break;

            // DIAGONAL
            case 12: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int i = 0; i < 5; i++) {
                    String valor = carta.getPosicion()[i][4 - i];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }
                System.out.println("Configuración 12: Números de la diagonal secundaria: " + numerosConfiguracion);
                break;

            // 6 - PACK
            case 13: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 13: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 14: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 1][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 14: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 15: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 2][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 15: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 16: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 16: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 17: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 17: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 18: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 2][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 18: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 19: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 19: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 20: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 20: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 21: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 2][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 21: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 22: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i][j + 3];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 22: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 23: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 3];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 23: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 24: // Diagonal secundaria (de arriba derecha a abajo izquierda)
                for (int j = 0; j < 2; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 2][j + 3];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 24: Números 6 PACK: " + numerosConfiguracion);
                break;

            // 6 - PACK
            case 25: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 25: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 26: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 26: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 27: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 27: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 28: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 1][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 28: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 29: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 29: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 30: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 30: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 31: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 2][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 31: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 32: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 2][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 32: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 33: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 2][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 33: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 34: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 3][j];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 34: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 35: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 3][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 35: Números 6 PACK: " + numerosConfiguracion);
                break;

            case 36: // HORIZONTAL
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 2; i++) {
                        String valor = carta.getPosicion()[i + 3][j + 2];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 36: Números 6 PACK: " + numerosConfiguracion);
                break;

            // 8 - PACK
            case 37: // HORIZONTAL
                int[][] posiciones = {
                    {2, 0}, {3, 1}, {4, 2}, // Primera línea diagonal
                    {0, 2}, {1, 3}, {2, 4}, // Segunda línea diagonal
                    {1, 1}, {3, 3} // Puntos adicionales
                };

                for (int[] pos : posiciones) {
                    String valor = carta.getPosicion()[pos[0]][pos[1]];
                    if (!valor.equals("*")) {
                        numerosConfiguracion.add(Integer.parseInt(valor));
                    }
                }

                System.out.println("Configuración 37: Números de la diagonal principal: " + numerosConfiguracion);
                break;

            case 38: //Small Center Box
                for (int j = 0; j < 3; j++) {
                    for (int i = 0; i < 3; i++) {
                        String valor = carta.getPosicion()[i + 1][j + 1];
                        if (!valor.equals("*")) {
                            numerosConfiguracion.add(Integer.parseInt(valor));
                        }
                    }
                }
                System.out.println("Configuración 38: Números 6 PACK: " + numerosConfiguracion);
                break;

            default:
                System.out.println("Configuración no válida.");
        }
        return numerosConfiguracion;
    }
}
