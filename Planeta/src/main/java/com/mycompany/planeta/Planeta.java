/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.planeta; 
/**
 *
 * @author Santiago
 */
public class Planeta {
    double periodoRotacional;
    double periodoOrbital;
    String nombre = null;
    int  satelites = 0;
    double masa = 0;
    double Volumen = 0;
    int diametro = 0;
    int Distanciasol = 0;
    enum tipo_planeta {GASEOSO,TERRESTRE,ENANO}
    tipo_planeta tipo;
    boolean esObservable = false;
    
    
    Planeta(double periodoRotacional,String nombre, int satelites, double masa,double Volumen,int diametro, int Distanciasol, tipo_planeta tipo, boolean esObservable){   
            this.periodoRotacional=periodoRotacional;
            this.nombre=nombre;
            this.satelites=satelites;
            this.masa=masa;
            this.Volumen=Volumen;
            this.diametro=diametro;
            this.Distanciasol=Distanciasol;
            this.periodoOrbital=calcularperiodoOrbital();
            this.tipo=tipo;
            this.esObservable=esObservable; 
        }
    
        void imprimir(){
            System.out.println("Periodo Rotacional es= " + periodoRotacional + "días");
            System.out.println("Periodo Orbital es= "+ periodoOrbital+ "años");
            System.out.println("Nombre del planeta ="+ nombre);
            System.out.println("Cantidad de satélites = " + satelites);
            System.out.println("Masa del planeta = " + masa);
            System.out.println("Volumen del planeta = " + Volumen);
            System.out.println("Diámetro del planeta = " + diametro);
            System.out.println("Distancia al sol = " + Distanciasol);
            System.out.println("Tipo de planeta = " + tipo);
            System.out.println("Es observable = " + esObservable);
        }
        
        double calcularDensidad(){
            return masa/Volumen;             
        }
        boolean esPlanetaExterior(){
            float limite= (float)(149597870 * 3.4);
            if (Distanciasol > limite){
                return true;} 
            else{ 
                return false;}
        }
        double calcularperiodoOrbital(){
            double comDS = (double)Distanciasol/149597870;
          return Math.pow(comDS,(3.0/2.0));
        }
        
        public static void main(String args[]) {
            Planeta p1 = new Planeta(1,"Tierra",1,5.9736E24,1.08321E12,12742,150000000,tipo_planeta.TERRESTRE,true);
            p1.imprimir();
            System.out.println("Densidad del planeta = "  + 
                p1.calcularDensidad());
            System.out.println("Es planeta exterior = " + 
                p1.esPlanetaExterior());            
            System.out.println();
            
            Planeta p2 = new Planeta(0.41,"Júpiter",79,1.899E27,1.4313E15,139820,750000000,tipo_planeta.GASEOSO,true);
            p2.imprimir();
            System.out.println("Densidad del planeta = " + 
                p2.calcularDensidad());
            System.out.println("Es planeta exterior = " + 
                p2.esPlanetaExterior());
            }
        
}

        
        

