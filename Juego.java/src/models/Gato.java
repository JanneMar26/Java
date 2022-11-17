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
        System.out.println("1.Jugador vs Computador");
        System.out.println("2.Jugador vs Jugador");
        System.out.println("3.Salir");
    }
    //2.Asigna  a los jugadores
    private void aisignarJugadores(boolean cpu){

    }
    //3.Crear jugador
    private Jugador crearJugador(boolean cpu, int n, char figura){

    }
    //4. Recorrer tablero
    private void imprimeTablero(){

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
        for(i=0)

    }
}
