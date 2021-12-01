package br.com.fatec.exercicioquatro;

import br.com.fatec.exerciciodois.Pessoa;

public class Sapatos {

	Pessoa pessoa = new Pessoa();
	String nomePessoa = pessoa.getNome();
	String cpfPessoa = pessoa.getCpf();
	String tipoSapato;
	String tamanhoSapato;

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

	public String getTipoSapato() {
		return tipoSapato;
	}

	public void setTipoSapato(String tipoSapato) {
		this.tipoSapato = tipoSapato;
	}

	public String getTamanhoSapato() {
		return tamanhoSapato;
	}

	public void setTamanhoSapato(String tamanhoSapato) {
		this.tamanhoSapato = tamanhoSapato;
	}

}