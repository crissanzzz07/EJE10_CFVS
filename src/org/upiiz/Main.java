package org.upiiz;

import org.upiiz.figuras.Circulo;

public class Main {
    public static void main(String[] args) {
        //Crear circulos
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(2, 3);
        Circulo circulo3 = new Circulo(1, 1, 5);

        //Dibujarlos
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();

        //Cambiarlos de posicion
        circulo1.moverX(5);
        circulo2.moverY(4);
        circulo3.moverXY(2, 2);

        //Volver a dibujar
        circulo1.dibujar();
        circulo2.dibujar();
        circulo3.dibujar();

        //Area y perimetro
        System.out.println("Area circulo 1: " + circulo1.calcularArea());
        System.out.println("Perimetro circulo 1: " + circulo1.calcularPerimetro());
        System.out.println("Area circulo 2: " + circulo2.calcularArea());
        System.out.println("Perimetro circulo 2: " + circulo2.calcularPerimetro());
        System.out.println("Area circulo 3: " + circulo3.calcularArea());
        System.out.println("Perimetro circulo 3: " + circulo3.calcularPerimetro());
    }
}