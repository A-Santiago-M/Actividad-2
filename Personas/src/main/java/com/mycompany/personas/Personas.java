/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personas;

/**
 *
 * @author Santiago
 */
public class Personas {
    String Nombre;
    String Apellidos;
    String NumeroIdentidad;
    int AñoNacimiento;
    String Pais;
    char Genero;
    
    
    Personas(String Pais, char Genero, String Nombre, String Apellidos, 
            String NumeroIdentidad, int AñoNacimiento){
        this.Pais=Pais;
        this.Genero=Genero;
        this.Nombre= Nombre;
        this.Apellidos=Apellidos;
        this.NumeroIdentidad=NumeroIdentidad;
        this.AñoNacimiento=AñoNacimiento;
    }
    void imprimir(){
        System.out.println("Es de = " + Pais);
        System.out.println("Es = " + Genero);
        System.out.println("Nombre = " + Nombre);
        System.out.println("Apellidos = " + Apellidos);
        System.out.println("Numero de Documento de Identidad = " + 
                NumeroIdentidad);
        System.out.println("Año de Nacimiento = " + AñoNacimiento);
        System.out.println();
    }
    public static void main(String args[]) {
        Personas p1 = new Personas("Moroco",'H',"Pedro","Pérez","1053121010",
                1998);
        Personas p2 = new Personas("yugoslavia",'H',"Luis","León","1053223344", 
                2001);
        p1.imprimir();
        p2.imprimir();
    }
}
