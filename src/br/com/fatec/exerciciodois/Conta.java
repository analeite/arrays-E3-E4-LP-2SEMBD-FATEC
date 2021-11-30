package br.com.fatec.exerciciodois;

import br.com.fatec.exerciciodois.Pessoa;

public class Conta {
	
	//Classe classe = new Classe(); int A = classe.getA();
	
	Pessoa pessoa = new Pessoa ();
	String nomePessoa = pessoa.getNome();
	String cpfPessoa = pessoa.getCpf();
	String aniversarioPessoa = pessoa.getDataAniversario();
	int numeroConta;
	String tipoConta;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getCpfPessoa() {
		return cpfPessoa;
	}
	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	public String getAniversarioPessoa() {
		return aniversarioPessoa;
	}
	public void setAniversarioPessoa(String aniversarioPessoa) {
		this.aniversarioPessoa = aniversarioPessoa;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}
