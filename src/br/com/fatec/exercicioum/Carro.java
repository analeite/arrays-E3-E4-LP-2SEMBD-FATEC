package br.com.fatec.exercicioum;

public class Carro {
	
	//Nome do Carro, Placa, Ano
	
	public String nome;
	public String marca;
	public String cor;
	public String placa;
	public int ano;
	
//	public Carro(String nome, String marca) {
//		super();
//		this.nome = nome;
//		this.marca = marca;
//	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
