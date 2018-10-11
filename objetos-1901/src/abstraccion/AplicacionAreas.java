/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import java.util.Scanner;

/**
 *
 * @author campitos
 */
public class AplicacionAreas {
    public static void main(String[] args) {
        System.out.println("Bienvenido, elige tu opcion:");
        Scanner opc=new Scanner(System.in);
        int op= opc.nextInt();
        //Elegir la opcion
        switch (op)
        {
            case 1:
                //Soy el circculo
                System.out.println("Dame el radio del circulo:");
        Scanner scaner=new Scanner(System.in);
        float r= scaner.nextFloat();
        float a;
        float pi=3.1416f;
        //aplicamos la formula
        a=pi*(r*r);
        System.out.println("el area es "+a);
        break;
            case 2:
                //Soy el trangulo
                System.out.println("Ingresa la base: ");
                Scanner base=new Scanner(System.in);
                System.out.println("Ingresa la altura: ");
                Scanner altura=new Scanner(System.in);
                float bt= base.nextFloat();
                float at= altura.nextFloat();
                float area;
                area=(bt*at)/2;
                System.out.println("El area es: "+area);
                break;
            case 3:
            //Soy el rectangulo
                System.out.println("Ingresa la base: ");
                Scanner base1=new Scanner(System.in);
                System.out.println("Ingresa la altura: ");
                Scanner altura1=new Scanner(System.in);
                float br= base1.nextFloat();
                float ar= altura1.nextFloat();
                float arear;
                arear=(br*ar)/2;
                System.out.println("El area es: "+arear);
                break;    
        }
    }
}
