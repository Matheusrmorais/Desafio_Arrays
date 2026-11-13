package modelo;

import interfaces.Forma;

public class Circulo implements Forma {
    private double raio;
    @Override
    public double calcularArea(double raio) {
        this.raio = raio;
        return  3.14 * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo: " + calcularArea(raio);
    }
}
