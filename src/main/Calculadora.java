
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
public class Calculadora {
    
    private double nota1;
    
    private double nota2;

    public Calculadora(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }   
    
        public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double somar() {
        return roundToHalf(this.nota1 + this.nota2);
    }
    
    public double subtrair() {
        return roundToHalf(this.nota1 - this.nota2);        
    }
    
    public double multiplicar() {
        return roundToHalf(this.nota1 * this.nota2);        
    }
    
    public double dividir() {
        return roundToHalf(this.nota1 / this.nota2);        
    }
    
    public double arredondarNota(double nota){
    	return Math.round(nota);
    }
    
    private static double roundToHalf(double d) {
        return Math.round(d * 2) / 2.0;
    }
    
}
