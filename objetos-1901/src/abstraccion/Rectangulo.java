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
public class Rectangulo {
    float alto;
    float area;
    float ancho;

    public Rectangulo(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    void calcularArea() {
        area=ancho*alto;
    }
    
}
