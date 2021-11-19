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
public class Main {
    public static void main(String[] args) {
        System.out.println("########Arreglos########");
        try{
            String mensajes[]= {"Mensaje 1", "Mensaje 2", "Mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);  
        }
       } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Apuntador fuera de rango");
            System.out.println(e);
       }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        System.out.println("########Aritméica########");
        try{
            Integer denominador = null;
            float equis = 5/denominador;
            System.out.println(equis);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Error: " +e.getMessage());
        } catch (Exception e){
            System.out.println("Error general: "+e.getMessage());
        }
        
        System.out.println("########Propagación########");
        try{
            int division = division (10,0);
            System.out.println(division);
        } catch(ArithmeticException e) {
            System.out.println("Error: "+ e.getMessage());
    }
        int div2 = division(4,0);
        System.out.println(div2);
        
        System.out.println("########thow-twhows########");
        try{
            int div3 = division3 (6,0);
        } catch (ArithmeticException e){
            System.out.println("Error:" +e.getMessage());
        }
        
        
        System.out.println("########Nuevas Excepciones########");
        Cuenta miCuenta = new Cuenta();
        try{
            miCuenta.depositar(2000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(650);
            miCuenta.consultaSaldo();
    } catch(SaldoInsuficienteExeption e){
            System.out.println("Error: "+e.getMessage());
    }
    }

    private static int division(int a, int b) {
        int c= 0;
        try{
            c = a/b;
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        return c;
    }

    private static int division3(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("División entre cero, evitalo.");
        }
        int c = a/b;
        return c; 
    }
}
