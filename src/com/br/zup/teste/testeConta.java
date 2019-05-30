package com.br.zup.teste;


import com.br.zup.modelo.ContaBancaria;

public class testeConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("3734-0", "Itau", "5422", 0);		
		ContaBancaria conta2 = new ContaBancaria("0000", "Itau", "0000", 1000);
		
		System.out.println("Saldo atual da canto\n"+conta.getSaldo());
		
		
		conta.depositar(500);
		conta.tranferir(150, conta2);
		conta.sacar(100);
		
		
		

		System.out.println("\n---Jefferson----");
		conta.saldo();
		System.out.println("\n---Benjamin----");
		conta2.saldo();

	}

}
