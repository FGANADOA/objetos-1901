/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.*;

/**
 *
 * @author campitos
 */
public class Probar {
    public static void main(String[] args) {
        Opcion op1=new Opcion("Ecatepec",false);
        Opcion op2=new Opcion("Ecaterror",false);
        Opcion op3=new Opcion("Kiev",true);
        Opcion op4=new Opcion("Chalco",false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);opciones.add(op2);opciones.add(op3);opciones.add(op4);
        Pregunta p1=new Pregunta("¿Cuál es la capital de Ucrania?",opciones);
        //Probamos el modelo
        System.out.println(p1.getTitulo());
        for(Opcion o:opciones){
            System.out.println(o.getTitulo());
        }
    }
}
