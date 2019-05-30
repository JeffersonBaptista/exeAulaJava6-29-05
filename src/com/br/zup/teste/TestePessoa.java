package com.br.zup.teste;

import java.util.ArrayList;
import java.util.List;

import com.br.zup.modelo.Brasileiro;
import com.br.zup.modelo.ContaBancaria;

public class TestePessoa {

	public static void main(String[] args) {
		// lista do objeto brasileiro
		List<Brasileiro> listaBr = new ArrayList<Brasileiro>();

		// criando e alimentando conta
		ContaBancaria conta = new ContaBancaria("3734-0", "Itau", "5422", 13.00);

		Brasileiro br = new Brasileiro("Jefferson", "Baptista", 34, "Portugues", false, conta);

		ContaBancaria conta2 = new ContaBancaria("0000", "Itau", "0000", 1.00);

		Brasileiro br2 = new Brasileiro("Benjamin", "Baptista", 34, "Portugues", true, conta);
		
		// alimentando a listaBr com o objeto br
		listaBr.add(br);
		listaBr.add(br2);

		for (Brasileiro brasileiro : listaBr) {

			System.out.println(brasileiro);
		}

	}

}
