package com.br.zup.modelo;

public interface interfacesDeTransacoes {
	
	void depositar( double valor);
	void sacar(double valor);
	void tranferir(double valor, ContaBancaria contaEntra);
	void saldo();

}
