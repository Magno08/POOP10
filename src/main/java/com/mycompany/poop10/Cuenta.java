/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop10;

/**
 *
 * @author Magno
 */
public class Cuenta {
    private double saldo;

    public Cuenta() {
        saldo = 0;
    }
    
    public void depositar (double monto){
        System.out.println("Dinero depositado: +"+monto);
        saldo+=monto;
    }
    
    public void retirar (double monto) throws SaldoInsuficienteExeption{
        System.out.println("Dinero retirado: -"+monto);
        if(saldo < monto)
            throw new SaldoInsuficienteExeption();
        saldo-=monto;
        
    }
    public void consultaSaldo(){
        System.out.println("Saldo: "+saldo);
    }
    
}
