package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Calculadora;

public class CalculadoraTeste {

	@Test
	public void meuTeste() {
		 Calculadora calculadora = new Calculadora();
		 
		 int entradaNumero1 = 10;
		 int entradaNumero2 = 5;
		 
		 int resultadoEsperado = 15;
		 
		 int rresultadoEsperado = 15;
		 
		 calculadora.somar(entradaNumero1, entradaNumero2);
		 int resultadoObtido = (int) calculadora.getResultado();
		 
		 Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
}
