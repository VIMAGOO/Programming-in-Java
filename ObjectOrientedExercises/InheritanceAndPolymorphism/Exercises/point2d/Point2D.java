/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punt2d;

/**
 *
 * @author vimago
 */
public class Point2D {
    private double x;
    private double y;

    // Constructor
    public Punt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Mètode per calcular la distància a un altre punt
    public double calcularDistancia(Punt2D otherPoint) {
        double deltaX = this.x - otherPoint.getX();
        double deltaY = this.y - otherPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Mètode per determinar si dos punts són iguals
    public boolean esIgualA(Punt2D otherPoint) {
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Mètode per obtenir una representació en forma de cadena del punt
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Exemple d'ús
    public static void main(String[] args) {
        Punt2D punt1 = new Punt2D(3, 4);
        Punt2D punt2 = new Punt2D(6, 8);

        System.out.println("Punt 1: " + punt1);
        System.out.println("Punt 2: " + punt2);
        System.out.println("Distància entre els punts: " + punt1.calcularDistancia(punt2));
        System.out.println("Els punts són iguals? " + punt1.esIgualA(punt2));
    }
}
