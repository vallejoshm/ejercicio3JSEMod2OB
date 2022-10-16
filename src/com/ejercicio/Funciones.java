package com.ejercicio;

public class Funciones {

    public static void concatenarTextos(String[] textList){
        String cadena = "";
        for( String texto: textList){

            cadena = cadena + texto;
            cadena = cadena + " ";

        }
        System.out.println(cadena);
    }
}
