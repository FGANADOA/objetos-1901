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
public class Triangulo {
    float altura;
    float area;
    float base;

    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }
    
    void calcularArea() {
        area=(base*altura)/2;
    }
    
}
