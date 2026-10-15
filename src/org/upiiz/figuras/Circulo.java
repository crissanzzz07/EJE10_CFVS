package org.upiiz.figuras;

/**
 * Clase que representa un círculo en un plano cartesiano.
 */
public class Circulo {
    // Coordenada X del centro del círculo
    private double x;
    // Coordenada Y del centro del círculo
    private double y;
    // Radio del círculo
    private double radio;

    // Constructor sin parámetros: centro en (0, 0) y radio 1
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con X: Y en 0 y radio 1
    public Circulo(double x) {
        this.x = x;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con X y Y: radio 1
    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        this.radio = 1;
    }

    // Constructor completo: X, Y y radio
    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    // Calcula el área del círculo: π * r²
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    // Calcula el perímetro del círculo: 2 * π * r
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    // Mueve el círculo solo en el eje X y lo dibuja
    public void moverX(double unidadesX) {
        this.x = this.x + unidadesX;
        dibujar();
    }

    // Mueve el círculo solo en el eje Y
    public void moverY(double unidadesY) {
        this.y = this.y + unidadesY;
    }

    // Mueve el círculo en el eje X y en el eje Y
    public void moverXY(double unidadesX, double unidadesY) {
        this.x = this.x + unidadesX;
        this.y = this.y + unidadesY;
    }

    // Muestra en consola la posición y el radio del círculo
    public void dibujar() {
        System.out.println("Círculo en la posición X = " + this.x + " Y = " + this.y + " radio = " + this.radio);
    }
}