package br.com.fatec.exercicioum;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import br.com.fatec.exercicioum.Carro;

public class Concessionaria {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		ArrayList<Carro> loja = new ArrayList<Carro>();
		Carro Car;

		System.out.println("Cadastro de Carros: ");
		System.out.println("---------------------------");

		// Definindo a quantidade de Carro a serem inseridas no ArrayList
		Scanner contador = new Scanner(System.in);
		System.out.println("Digite a quantidade de carros que você deseja cadastrar: ");
		int cont = contador.nextInt();
		System.out.println("---------------------------");

		// Adicionando carros no ArrayList
		for (int i = 0; i < cont; i++) {
			Car = new Carro();
			System.out.printf("Carro %d:\n", i);
			System.out.println("Digite o nome do carro: ");
			Car.setNome(cons.next());
			System.out.println("Digite o marca do carro: ");
			Car.setMarca(cons.next());
			System.out.println("Digite o ano do carro: ");
			Car.setAno(cons.nextInt());
			System.out.println("Digite a cor do carro: ");
			Car.setCor(cons.next());
			System.out.println("Digite a placa do carro: ");
			Car.setPlaca(cons.next());
			loja.add(Car);
			System.out.println("---------------------------");
		}

		// Listando ArrayList
		for (int n = 0; n < loja.size(); n++) {
			Car = (Carro) loja.get(n);
			System.out.printf("Carro %d: %s, %s, %d, %s, %s\n", n, Car.getNome(), Car.getMarca(), Car.getAno(),
					Car.getCor(), Car.getPlaca());
			System.out.println("---------------------------");
		}

		// Map
		Map<String, Object> mapaTabela = new HashMap<String, Object>();

		for (int c = 0; c < loja.size(); c++) {
			String preco;
			Scanner tabela = new Scanner(System.in);
			System.out.printf("Preço de Tabela do Carro %d: ", c);
			preco = tabela.nextLine();

			Car = (Carro) loja.get(c);

			mapaTabela.put(preco, Car.getNome());

			System.out.println("---------------------------");

			for (Map.Entry<String, Object> entry : mapaTabela.entrySet()) {
				// Dados Carro
				System.out.println("Dados dos Carros Cadastrados: ");
				System.out.println("Carro: " + Car.getNome() + "\n" + "Marca: " + Car.getMarca() + "\n" + "Ano: "
						+ Car.getAno() + "\n" + "Cor: " + Car.getCor() + "\n" + "Placa: " + Car.getPlaca() + "\n"
						+ "Preço da Tabela: " + entry.getKey());
				
				System.out.println("---------------------------");
			}

		}

		// TabelaPreco
		System.out.println("Tabela de Carros Cadastrados: ");
		for (Map.Entry<String, Object> entry : mapaTabela.entrySet()) {
			System.out.println("Carro: " + entry.getValue() + " | " + "Preço de Tabela: " + entry.getKey() + "\n");
		}
		
		System.out.println("---------------------------");

	}

}
