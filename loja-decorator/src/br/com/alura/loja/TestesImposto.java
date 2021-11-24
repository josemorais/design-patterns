package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);

		Imposto imposto = new ICMS(new ISS(new ICMS(new ICMS(null))));
		System.out.println(imposto.calcular(orcamento));
	}

}
