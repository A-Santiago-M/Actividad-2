/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

/**
 *
 * @author Santiago
 */
public class CuentaBancaria {
    // Atributo que define los nombres del titular de la cuenta bancaria
    String nombresTitular;
    // Atributo que define los apellidos del titular de la cuenta bancaria
    String apellidosTitular;
    // Atributo que define el número de la cuenta bancaria
    int númeroCuenta;
    // Tipo de cuenta como un valor enumerado
    enum tipo {AHORROS, CORRIENTE}
    // Atributo que define el tipo de cuenta bancaria
    tipo tipoCuenta;
    /* Atributo que define el saldo de la cuenta bancaria con valor inicial 
    cero */
    float saldo = 0;
    double porcentajeInteres;
    
    
    CuentaBancaria(String nombresTitular, String apellidosTitular,
            int numeroCuenta, tipo tipoCuenta,double porcentajeInteres) {
        /* Tener en cuenta que no se pasa como parámetro el saldo ya 
        que inicialmente es cero. */
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteres=porcentajeInteres;
    }
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Tasa de interes= "+ porcentajeInteres);
        }
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
        }
    boolean consignar(int valor) {
        // El valor a consignar debe ser mayor que cero
        if (valor > 0) {
        saldo = saldo + valor; /* Se actualiza el saldo de la cuenta con 
        el valor consignado */
        System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
        return true;
        } else {
        System.out.println("El valor a consignar debe ser mayor que cero.");
        return false;
        }
    }
    boolean retirar(int valor) {
        /* El valor debe ser mayor que cero y no debe superar el saldo 
        actual */
        if ((valor > 0) && (valor <= saldo)) {
        saldo = saldo - valor; /* Se actualiza el saldo de la cuenta con 
        el valor retirado */
        System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
        return true;
        } else {
        System.out.println("El valor a retirar debe ser menor que el saldo actual.");
        return false;
        }
    }
    
    double InteresAplicado(){
        return (saldo*(porcentajeInteres/100))+saldo;
    }
    
    public static void main(String args[]) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez", 
        123456789,tipo.AHORROS,0.76);
        cuenta.imprimir();
        cuenta.consignar(200000);
        System.out.println("Saldo con interes aplicado= $" + cuenta.InteresAplicado());
        cuenta.consignar(300000);
        System.out.println("Saldo con interes aplicado= $" + cuenta.InteresAplicado());
        cuenta.retirar(400000);
        System.out.println("Saldo con interes aplicado= $" + cuenta.InteresAplicado());
    }
}
