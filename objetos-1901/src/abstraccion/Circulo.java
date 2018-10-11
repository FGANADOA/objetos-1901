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
public class Circulo {
    float radio;
    float area;
    public Circulo(float x){
        radio=x;
    }
    void calcularArea() {
        area=3.1416f*(radio*radio);
    }
    
}
