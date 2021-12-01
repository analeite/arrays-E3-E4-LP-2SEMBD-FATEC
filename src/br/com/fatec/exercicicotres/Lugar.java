package br.com.fatec.exercicicotres;

import br.com.fatec.exerciciodois.Pessoa;

public class Lugar {
	
	Pessoa pessoa = new Pessoa();
	String nomePessoa = pessoa.getNome();
	String cpfPessoa = pessoa.getCpf();
	String aniversarioPessoa = pessoa.getDataAniversario();
	String cidade;
	String estado;
	
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
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
}