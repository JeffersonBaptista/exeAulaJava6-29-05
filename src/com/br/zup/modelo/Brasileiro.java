package com.br.zup.modelo;

public class Brasileiro extends Pessoa{
	
	private String idioma;
	private boolean gostaFeijoada;
	private ContaBancaria conta;
	
	
	

	public Brasileiro(String nome, String sobreNome, int idade, String idioma, boolean gostaFeijoada, ContaBancaria conta) {
		super(nome, sobreNome, idade);
		this.idioma = idioma;
		this.gostaFeijoada = gostaFeijoada;
		this.conta = conta;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public boolean isGostaFeijoada() {
		return gostaFeijoada;
	}

	public void setGostaFeijoada(boolean gostaFeijoada) {
		this.gostaFeijoada = gostaFeijoada;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public String toString() {
		String modelo ="";
		modelo += "____________________________________";
		modelo += "\nNome -> "+ super.getNome();
		modelo += "\nSobre Nome -> "+ super.getSobreNome();
		modelo += "\nIdade -> "+ super.getIdade();
		modelo += "\nIdioma -> "+ getIdioma();
		modelo += "\nGosta de feijoada -> "+ isGostaFeijoada();
		modelo += "\n***********************************";
		modelo += "\n___________Conta bancaria__________"+ this.getConta();
		
		
		
		return modelo;
	}
	

}
