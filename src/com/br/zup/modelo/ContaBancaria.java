package com.br.zup.modelo;

public class ContaBancaria implements interfacesDeTransacoes {

	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;

	public ContaBancaria(String numeroConta, String banco, String agencia, double saldo) {
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		String modelo = "";
		modelo += "\nBanco -> " + this.getBanco();
		modelo += "\nConta -> " + this.getNumeroConta();
		modelo += "\nAgencia -> " + this.getAgencia();
		modelo += "\nSaldo -> " + this.getSaldo();

		return modelo;
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(valor + this.getSaldo());
		System.out.println("Deposito realizado com sucesso\n"+valor);

	}

	@Override
	public void sacar(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente " + this.getSaldo()+ " valor saque "+valor);
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso\n"+valor);
		}

	}

	@Override
	public void saldo() {
		System.out.println("Saldo atual\n" + this.getSaldo());

	}

	@Override
	public void tranferir(double valor, ContaBancaria contaEntra) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente " + this.getSaldo()+ " valor transferencia- "+valor);
		} else {
			this.setSaldo(this.getSaldo() - valor);
			contaEntra.setSaldo(contaEntra.getSaldo() + valor);

			System.out.println("Tranferencia realizada com sucesso\n"+valor);
		}

	}

}
