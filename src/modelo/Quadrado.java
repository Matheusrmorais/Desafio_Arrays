package modelo;

import interfaces.Forma;

public class Quadrado implements Forma {
    private double lado;

    @Override
    public double calcularArea(double lado) {
        this.lado = lado;
        return  lado*lado;
    }


    @Override
    public String toString() {
        return "Quadrado: " + calcularArea(lado);
    }

}
