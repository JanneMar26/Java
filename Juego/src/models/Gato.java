package models;

import java.util.Scanner;

import jugador.Jugador;



public class Gato{


    Scanner sc = new Scanner(System.in);
    //caracteres del tablero
    private Jugador j1;
    private Jugador j2;
    private int tirada;

    //mi tablero es una matriz bidimencional
    private char[][] tablero = new char[3][3];
    public void iniciarJuego(){
        System.out.println("=^..^=      Juego del Gato   =^..^= ");
        System.out.println("Elige una opción: ");
        System.out.println("1.Jugador vs Computador");
        System.out.println("2.Jugador vs Jugador");
        System.out.println("3.Salir");
    }
    //2.Asigna  a los jugadores
    private void asignarJugadores(boolean cpu){

    }
    //3.Crear jugador
    private Jugador crearJugador(boolean cpu, int n, char figura){

    }
    //4. Recorrer tablero
    /**
     * 
     */
    public void imprimeTablero(){
        for(int fila = 0;fila < tablero.length;fila++){
            for (int col = 0;col <tablero[fila].length;col++){
                System.out.println(tablero[fila][col]);
            }
        System.out.println(fila!=2?"\n-----\n":"\n");
        }

    }
    //5.
    private boolean tirar(Jugador jt){

    }
    //6.
    private boolean verificaTres(char figura){

    }
    //7.
    public int jugar(){

    }
    // 1.Inicia tablero
    private void iniciaTablero(){
        for(int i = 0; i< tablero.length; i++){
            for (int j = 0; j < tablero.length; j++){
                tablero[i][j] =___ ;

            }
        }

    }
}

