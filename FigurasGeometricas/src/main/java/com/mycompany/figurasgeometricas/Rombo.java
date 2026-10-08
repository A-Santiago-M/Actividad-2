/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author Santiago
 */
public class Rombo {
    int lado;
    int altura;
    int base;
    Rombo(int lado,int altura, int base){
        this.lado=lado;
        this.altura=altura;
        this.base=base;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return 4*lado;
    }
}
