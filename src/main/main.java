/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author aluno
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 5.3);
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());
        System.out.println(calc.dividir());
    }
    
}
