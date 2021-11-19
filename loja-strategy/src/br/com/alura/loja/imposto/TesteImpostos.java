package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class TesteImpostos {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}

}
