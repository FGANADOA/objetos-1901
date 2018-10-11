/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author campitos
 */
public class SolucionFinal {
    public static void main(String[] args) {
        Circulo x= new Circulo(4);
        //x.radio=4;
        x.calcularArea();
        System.out.println("El area del circulo es "+x.area);
        Triangulo t=new Triangulo(3, 2);
        t.calcularArea();
        System.out.println("El area del triangulo es "+t.area);
        Rectangulo r= new Rectangulo(5, 6);
        r.calcularArea();
        System.out.println("El area del rectangulo es "+r.area);
    }
}
