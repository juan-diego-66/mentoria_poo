package com.company;


import javax.xml.soap.SOAPPart;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("hola mundo");
        System.out.println(suma(5, 2)); // 7
        String numeroDosLetra = "2";
        int nDos = Integer.parseInt(numeroDosLetra);
        // [NombreClase]   [NombreVariable] = new [Constructor]
        Calculadora miCalculadora = new Calculadora();
        System.out.println(miCalculadora.suma(5.3, 2.2));
        System.out.println(miCalculadora.resta(2,5));
        System.out.println(miCalculadora.resta(2.2,5.5));

        // 1/2 - 1/8
        System.out.println(miCalculadora.resta(1,8,1,2));

    }

    public static double suma(int numeroUno, int numeroDos){
        // public, private, protected
        // void - sin parametros, double - numero , int - numero , String -
        return numeroUno + numeroDos;
    }
}
