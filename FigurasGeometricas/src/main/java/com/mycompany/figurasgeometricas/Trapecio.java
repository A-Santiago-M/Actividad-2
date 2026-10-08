/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Santiago
 */
public class Trapecio {
    int Base1;
    int Base2;
    int Altura;
    int lado;
    Trapecio(int Base1,int Base2,int Altura,int lado){
        this.Altura=Altura;
        this.Base1=Base1;
        this.Base2=Base2;      
    }
    double calcularArea(){
        return ((Base1+Base2)/2)*Altura;
    }
    double calcularPerimetro(){
        return (Base1+Base2+2*lado);
    }
}
