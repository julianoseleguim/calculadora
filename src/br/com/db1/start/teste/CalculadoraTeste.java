package br.com.db1.start.teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classe.Calculadora;

public class CalculadoraTeste {
	
	private Calculadora calculadora = new Calculadora();
	private Calculadora calculadora2 = new Calculadora(123d, 333d);

	@After
	public void finaliza() {
		System.out.println("fim da execucao do teste");
	}

	@Before
	public void init() {
		calculadora.setNumero1(1d);
		Assert.assertTrue(calculadora.getNumero1() == 1);

		calculadora.setNumero2(23d);
		Assert.assertTrue(calculadora.getNumero2() == 23);
		Assert.assertTrue(23 == calculadora.getNumero2());
	}

	@Test
	public void somarTest() {
		Assert.assertTrue(24 == calculadora.getSoma());
	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(22 == calculadora.getSubtracao());
	}
	@Test
	public void multiplicarTest() {
		Assert.assertTrue(23 == calculadora.getMultiplicacao());
	}
	
	@Test
	public void dividirTest() {
		Assert.assertTrue(0.043478260869565216d == calculadora.getDivisao());
	}
	
	
	@Test
	public void zerarTest(){
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getNumero1());
		Assert.assertTrue(0 == calculadora.getNumero2());
	}

}
