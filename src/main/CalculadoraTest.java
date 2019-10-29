package main;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase{
	
	Calculadora calc = new Calculadora(15, 10);
	
	public void testeSoma() {		
		assertEquals(25, calc.somar(),0);
	}
	
	public void testeSub() {
		assertEquals(5, calc.subtrair(),0);
	}
	
	public void testeMult() {		
		assertEquals(150, calc.multiplicar(),0);
	}
	
	public void testeDiv() {	
		assertEquals(1.5, calc.dividir(),0);
	}
	
	public void testeArredondamento() {
		assertEquals(0, calc.arredondarNota(0.1), 0);
	}
}
