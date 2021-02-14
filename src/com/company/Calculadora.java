package com.company;

public class Calculadora {

    // variables globales

    private double memeoriaResultado;  // se guarda el resultado para usarlo en suma tras suma

    // inicializa el objeto
    public Calculadora(){
        this.memeoriaResultado = 0;
    }

    //funciones

    public double suma(double numUno, double numDos){
        this.memeoriaResultado = numUno + numDos;
        return this.memeoriaResultado;
    }

    /**
     * Nos ayuda a restar dos numeros de tipo double
     * @param numUno el nuemreo que se va a restar
     * @param numDos el número al que se le va a restar
     * @return regresa la resta
     */
    public double resta(double numUno, double numDos){
        this.memeoriaResultado = numDos - numUno;
        return this.memeoriaResultado;
    }

    /**
     * Nos ayuda a restar dos numeros de tipo int
     * @param numUno el número que se va a restar
     * @param numDos el número al que se le a a restar
     * @return el resulta en un entero
     */
    public int resta(int numUno, int numDos){  // 1.1, 2.3
        this.memeoriaResultado = numDos - numUno; /// 1.2
        return (int) this.memeoriaResultado; //1
    }



    /**
     * Resta dos fracciones
     * numeradoB/denomidorB - numeradoA/denomidorA
     * @param numeradorA el numerador de la primera fraccion
     * @param denominadorA el denominador de la primera fraccion
     * @param numeradorB el numerador de la segunda fraccion
     * @param denomidadorB el denominador de la segunda fraccion
     * @return el resultado de la resta en un double
     */
    public double resta(int numeradorA, int denominadorA, int numeradorB, int denomidadorB){

        double numeradorRB = (denominadorA*numeradorB);
        double numeradorRA = (denomidadorB*numeradorA);
        double denominadorR = (denomidadorB+denominadorA);

        this.memeoriaResultado = ((numeradorRB - numeradorRA) / denominadorR);

        return this.memeoriaResultado;
    }


}
