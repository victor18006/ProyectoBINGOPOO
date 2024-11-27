/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic.uabc.juegobingo;

/**
 *
 * @author VOM
 */
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoGUI extends JFrame {
    private final JPanel cartaPanel; // Panel para mostrar la carta
    private final JPanel tableroPanel; // Panel para mostrar el tablero
    private final JButton generarNumeroButton;
    private final JLabel numeroActualLabel;
    private final String[][] carta;
    private final JButton[][] cartaBotones;
    private final JButton[][] tableroBotones;
    private final Set<Integer> numerosSalidos;
    private final Random random;

    public BingoGUI(Carta cartaObj) {
        // Configuración de la ventana principal
        setTitle("Juego de Bingo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setLayout(new BorderLayout());

        // Inicializar componentes
        carta = cartaObj.getPosicion();
        cartaBotones = new JButton[5][5];
        tableroBotones = new JButton[5][15]; // 15 filas (75 números en total, 5 por columna)
        numerosSalidos = new HashSet<>();
        random = new Random();

        // Panel para la carta
        cartaPanel = new JPanel(new GridLayout(5, 5));
        inicializarCarta();

        // Panel para el tablero
        tableroPanel = new JPanel(new GridLayout(5, 15));
        inicializarTablero();

        // Botón y etiqueta para el número actual
        generarNumeroButton = new JButton("Generar número");
        numeroActualLabel = new JLabel("Número actual: --", JLabel.CENTER);

        // Panel inferior para controles
        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(numeroActualLabel, BorderLayout.CENTER);
        controlPanel.add(generarNumeroButton, BorderLayout.SOUTH);

        // Añadir paneles al marco principal
        add(cartaPanel, BorderLayout.WEST);
        add(tableroPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // Acción para generar número
        generarNumeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarNumero();
            }
        });

        setVisible(true);
    }

    private void inicializarCarta() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String valor = carta[i][j];
                JButton boton = new JButton(valor);
                boton.setEnabled(false);
                boton.setBackground(Color.WHITE);
                cartaBotones[i][j] = boton;
                cartaPanel.add(boton);
            }
        }
        cartaBotones[2][2].setBackground(Color.LIGHT_GRAY); // Centro vacío
    }

    private void inicializarTablero() {
        int numero = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                JButton boton = new JButton(String.valueOf(numero));
                boton.setEnabled(false);
                boton.setBackground(Color.WHITE);
                tableroBotones[i][j] = boton;
                tableroPanel.add(boton);
                numero++;
            }
        }
    }

    private void generarNumero() {
        if (numerosSalidos.size() >= 75) {
            JOptionPane.showMessageDialog(this, "¡Ya se generaron todos los números!");
            return;
        }

        int numero;
        do {
            numero = random.nextInt(75) + 1; // Números del 1 al 75
        } while (numerosSalidos.contains(numero));
        numerosSalidos.add(numero);

        numeroActualLabel.setText("Número actual: " + numero);

        // Marcar el número en el tablero
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (Integer.parseInt(tableroBotones[i][j].getText()) == numero) {
                    tableroBotones[i][j].setBackground(Color.YELLOW);
                }
            }
        }

        // Marcar el número en la carta
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (carta[i][j].equals(String.valueOf(numero))) {
                    cartaBotones[i][j].setBackground(Color.YELLOW);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear la carta
        Carta carta = new Carta();
        carta.asignarValoresCarta();

        // Iniciar la interfaz gráfica
        new BingoGUI(carta);
    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoGUI extends JFrame {
    private final JPanel cartaPanel;
    private final JPanel tableroPanel;
    private final JButton generarNumeroButton;
    private final JLabel numeroActualLabel;
    private final String[][] carta;
    private final JButton[][] cartaBotones;
    private final JButton[][] tableroBotones;
    private final Set<Integer> numerosSalidos;
    private final Random random;

    public BingoGUI(Carta cartaObj) {
        setTitle("Juego de Bingo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);
        setLayout(new BorderLayout());

        carta = cartaObj.getPosicion();
        cartaBotones = new JButton[5][5];
        tableroBotones = new JButton[5][15]; // 15 columnas
        numerosSalidos = new HashSet<>();
        random = new Random();

        // Panel para la carta
        JPanel cartaContainer = new JPanel(new BorderLayout());
        JLabel cartaLabel = new JLabel("CARTA", JLabel.CENTER);
        cartaLabel.setFont(new Font("Arial", Font.BOLD, 20));
        cartaContainer.add(cartaLabel, BorderLayout.NORTH);

        cartaPanel = new JPanel(new GridLayout(5, 5));
        inicializarCarta();

        // Panel para el tablero
        JPanel tableroContainer = new JPanel(new BorderLayout());
        tableroPanel = new JPanel(new GridLayout(6, 15)); // Una fila adicional para las letras BINGO
        inicializarTablero();
        tableroContainer.add(tableroPanel, BorderLayout.CENTER);

        // Botón y etiqueta para el número actual
        generarNumeroButton = new JButton("Generar número");
        numeroActualLabel = new JLabel("Número actual: --", JLabel.CENTER);

        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(numeroActualLabel, BorderLayout.CENTER);
        controlPanel.add(generarNumeroButton, BorderLayout.SOUTH);

        add(cartaContainer, BorderLayout.WEST);
        add(tableroContainer, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        // Acción del botón para generar el número
        generarNumeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarNumero();
            }
        });

        setVisible(true);
    }

    private void inicializarCarta() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String valor = carta[i][j];
                JButton boton = new JButton(valor);
                boton.setEnabled(false);
                boton.setFont(new Font("Arial", Font.BOLD, 10));
                boton.setBackground(Color.LIGHT_GRAY);
                boton.setForeground(Color.BLACK);
                cartaBotones[i][j] = boton;
                cartaPanel.add(boton);
            }
        }
        cartaBotones[2][2].setBackground(Color.GRAY); // Centro vacío
    }

    private void inicializarTablero() {
        // Primera fila con las letras BINGO en vertical
        String[] letras = {"B", "I", "N", "G", "O"};
        for (int i = 0; i < 5; i++) {
            JButton boton = new JButton(letras[i]);
            boton.setFont(new Font("Arial", Font.BOLD, 10));
            boton.setBackground(Color.DARK_GRAY);
            boton.setForeground(Color.WHITE);
            boton.setEnabled(false);
            tableroPanel.add(boton);
        }

        // Los números se distribuyen en las columnas de acuerdo con su rango
        int[] inicioColumna = {1, 16, 31, 46, 61}; // Rango de inicio para cada columna
        for (int col = 0; col < 5; col++) {
            int numero = inicioColumna[col];
            for (int row = 0; row < 5; row++) {
                JButton boton = new JButton(String.valueOf(numero));
                boton.setEnabled(false);
                boton.setFont(new Font("Arial", Font.PLAIN, 14));
                boton.setBackground(Color.LIGHT_GRAY);
                boton.setForeground(Color.BLACK);
                tableroBotones[row][col] = boton;
                tableroPanel.add(boton);
                numero++;
            }
        }
    }

    private void generarNumero() {
        if (numerosSalidos.size() >= 75) {
            JOptionPane.showMessageDialog(this, "¡Ya se generaron todos los números!");
            return;
        }

        int numero;
        do {
            numero = random.nextInt(75) + 1; // Generar número entre 1 y 75
        } while (numerosSalidos.contains(numero));
        numerosSalidos.add(numero);

        numeroActualLabel.setText("Número actual: " + numero);

        // Marcar el número en el tablero
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (Integer.parseInt(tableroBotones[i][j].getText()) == numero) {
                    tableroBotones[i][j].setBackground(Color.YELLOW);
                }
            }
        }

        // Marcar el número en la carta
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (carta[i][j].equals(String.valueOf(numero))) {
                    cartaBotones[i][j].setBackground(Color.YELLOW);
                }
            }
        }
    }

    public static void main(String[] args) {
        Carta carta = new Carta();
        carta.asignarValoresCarta();
        new BingoGUI(carta);
    }
}
