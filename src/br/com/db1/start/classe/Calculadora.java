package br.com.db1.start.classe;

public class Calculadora {

	private Double numero1 = 0d;
	private Double numero2 = 0d;

	
	public Calculadora(){
		zerar();
	}
	
	public void zerar() {
		numero1 = 0d;
		numero2 = 0d;
		
	}
	
	public Calculadora(Double valor222, Double valor2333){
		zerar();
		numero1 = valor222;
		numero2 = valor2333;
	}
	
	public Double getSoma() {
		return numero1 + numero2;
	}

	public Double getSubtracao() {
		return numero1 - numero2;
	}

	public Double getMultiplicacao() {
		return numero1 * numero2;
	}

	public Double getDivisao() {
		return numero1 / numero2;
	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

}
