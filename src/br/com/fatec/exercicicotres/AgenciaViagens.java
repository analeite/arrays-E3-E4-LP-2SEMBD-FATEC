package br.com.fatec.exercicicotres;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.fatec.exerciciodois.Conta;

public class AgenciaViagens {

	public static void menu() {
		System.out.println("-----Cadastro de Viagens-----");
		System.out.println("------------Menu------------");
		System.out.println("----------------------------");
		System.out.println("1 - Cadastrar Nova Viagem");
		System.out.println("2 - Listar Dados do Destino");
		System.out.println("3 - Listar Dados da Pessoa");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
	}

	public static void main(String[] args) {

		ArrayList<Lugar> destinos = new ArrayList<Lugar>();

		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				adicionarConta(destinos);
				break;

			case 2:
				listarDadosDestino(destinos);
				break;

			case 3:
				listarDadosPessoa(destinos);
				break;


			default:
				System.out.println("Opção Inválida.");
			}
		} while (opcao != 0);
	}
	
	
	static void adicionarConta(ArrayList<Lugar> destinos) {

		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		Set<Lugar> cpfSet = new HashSet<Lugar>();

		Lugar lugar = new Lugar();

		System.out.println("Digite o nome do cliente: ");
		lugar.setNomePessoa(cons.nextLine());
		System.out.println("Digite o número do CPF do cliente: ");
		lugar.setCpfPessoa(cons.nextLine());
		cpfSet.add(lugar);
		System.out.println("Digite a data de aniversário do cliente: ");
		lugar.setAniversarioPessoa(cons.nextLine());
		System.out.println("Digite o nome da cidade de destino: ");
		lugar.setCidade(cons.nextLine());
		System.out.println("Digite o nome do estado de destino: ");
		lugar.setEstado(cons.nextLine());
		destinos.add(lugar);

		System.out.println("----------------------------");
		
	}

	static void listarDadosDestino(ArrayList<Lugar> destinos) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número do CPF do cliente que você deseja consultar os dados de destino: ");
		entrada = sc.next();

		for (int n = 0; n < destinos.size(); n++) {

			Lugar lug = destinos.get(n);

			if (lug.getCpfPessoa().equals(entrada)) {

				System.out.println("\n----------------------------\n");

				System.out.println("Dados do Destino do Cliente " + lug.getNomePessoa() + ":\n"
						+ "Cidade do Destino: " + lug.getCidade() + "\n" + "Estado do Destino: "
						+ lug.getEstado());

				System.out.println("\n----------------------------");
			}

		}		
	}
	
	static void listarDadosPessoa(ArrayList<Lugar> destinos) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número do CPF do cliente que você deseja consultar os dados: ");
		entrada = sc.next();

		for (int n = 0; n < destinos.size(); n++) {

			Lugar lug = destinos.get(n);

			if (lug.getCpfPessoa().equals(entrada)) {

				System.out.println("\n----------------------------\n");

				System.out.println("Dados do Cliente: \n" + "Nome do Cliente: " + lug.getNomePessoa() + "\n"
						+ "CPF do Cliente: " + lug.getCpfPessoa() + "\n" + "Data de Aniversário do Cliente: "
						+ lug.getAniversarioPessoa());

				System.out.println("\n----------------------------");
			}

		}		
	}

}
