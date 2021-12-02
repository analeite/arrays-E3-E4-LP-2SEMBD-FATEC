package br.com.fatec.exercicioum;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import br.com.fatec.exerciciodois.Conta;
import br.com.fatec.exercicioum.Carro;

public class Concessionaria {

	public static void menu() {
		System.out.println("-----Cadastro de Carros-----");
		System.out.println("------------Menu------------");
		System.out.println("----------------------------");
		System.out.println("1 - Cadastrar Novo Carro");
		System.out.println("2 - Listar Carros Cadastrados");
		System.out.println("3 - Listar Tabela de Preços");
		System.out.println("4 - Listar Dados dos Carros");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
	}

	public static void main(String[] args) {
		ArrayList<Carro> loja = new ArrayList<Carro>();

		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				adicionarCarro(loja);
				break;

			case 2:
				listarCarro(loja);
				break;

			case 3:
				imprimirTabelaPreco(loja);
				break;

			case 4:
				listarDadosCarro(loja);
				break;

			default:
				System.out.println("Opção Inválida.");
			}
		} while (opcao != 0);
	}

	static void adicionarCarro(ArrayList<Carro> loja) {

		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		Map<String, Object> mapaTabela = new HashMap<String, Object>();

		String preco;

		Carro car = new Carro();

		// Adicionando carros no ArrayList
		System.out.println("Digite o nome do carro: ");
		car.setNome(cons.nextLine());
		System.out.println("Digite o marca do carro: ");
		car.setMarca(cons.nextLine());
		System.out.println("Digite o ano do carro: ");
		car.setAno(cons.nextLine());
		System.out.println("Digite a cor do carro: ");
		car.setCor(cons.nextLine());
		System.out.println("Digite a placa do carro: ");
		car.setPlaca(cons.nextLine());
		System.out.println("Digite o preço de tabela do carro: ");
		car.setPrecoTabela(cons.next());
		preco = car.getPrecoTabela();
		mapaTabela.put(preco, car.getNome());

		loja.add(car);

		System.out.println("\n----------------------------\n");
	}

	static void listarCarro(ArrayList<Carro> loja) {
		// Listando ArrayList
		for (Carro car : loja) {

			System.out.println("\n----------------------------\n");

			System.out.println("Informações do Carro: \n" + "Nome do Carro: " + car.getNome() + "\n"
					+ "Placa do Carro: " + car.getPlaca());
			System.out.println("\n----------------------------\n");
		}
	}

	static void imprimirTabelaPreco(ArrayList<Carro> loja) {
		
		// Listando TabelaPreco
		for (Carro car : loja) {

			System.out.println("\n----------------------------\n");

			System.out.println("Informações do Carro: \n" + "Nome do Carro: " + car.getNome() + "\n"
					+ "Placa do Carro: " + car.getPlaca() + "\n" + "Preço de Tabela: " + car.getPrecoTabela());
			System.out.println("\n----------------------------\n");
		}

	}

	static void listarDadosCarro(ArrayList<Carro> loja) {
		
		for (int c = 0; c < loja.size(); c++) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			String entrada;

			System.out.println("Digite o número da placa do carro que você deseja consultar os dados: ");
			entrada = sc.next();

			for (int n = 0; n < loja.size(); n++) {

				Carro car = loja.get(n);

				if (car.getPlaca().equals(entrada)) {

					System.out.println("\n----------------------------\n");

					System.out.println("Informações do Carro: \n" + "Nome do Carro: " + car.getNome() + "\n"
							+ "Marca do Carro: " + car.getMarca() + "\n" + "Cor do Carro: " + car.getCor() + "\n"
							+ "Placa do Carro: " + car.getPlaca() + "\n" + "Ano do Carro: " + car.getAno() + "\n"
							+ "Preço de Tabela do Carro: " + car.getPrecoTabela());

					System.out.println("\n----------------------------");
				}

			}

		}
	}
}
