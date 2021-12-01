package br.com.fatec.exercicioquatro;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import br.com.fatec.exercicicotres.Lugar;
import br.com.fatec.exerciciodois.Conta;

public class Loja {

	public static void menu() {
		System.out.println("-------Loja de Sapatos------");
		System.out.println("------------Menu------------");
		System.out.println("----------------------------");
		System.out.println("1 - Cadastrar Nova Compra");
		System.out.println("2 - Listar Dados da Pessoa");
		System.out.println("3 - Listar Todas as Compras");
		System.out.println("4 - Excluir Compra");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
	}

	public static void main(String[] args) {

		LinkedList<Sapatos> loja = new LinkedList<Sapatos>();

		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				adicionarCompra(loja);
				break;

			case 2:
				listarDadosPessoa(loja);
				break;
				
			case 3:
				listarCompras(loja);
				break;

			case 4:
				excluirCompra(loja);
				break;

			default:
				System.out.println("Opção Inválida.");
			}
		} while (opcao != 0);
	}


	static void adicionarCompra(LinkedList<Sapatos> loja) {

		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		Set<Sapatos> cpfSet = new HashSet<Sapatos>();

		Sapatos sapatos = new Sapatos();

		System.out.println("Digite o nome do cliente: ");
		sapatos.setNomePessoa(cons.nextLine());
		System.out.println("Digite o número do CPF do cliente: ");
		sapatos.setCpfPessoa(cons.nextLine());
		cpfSet.add(sapatos);
		System.out.println("Digite o tipo dos sapatos: ");
		sapatos.setTipoSapato(cons.nextLine());
		System.out.println("Digite o número dos sapatos: ");
		sapatos.setTamanhoSapato(cons.nextLine());
		loja.add(sapatos);

		System.out.println("----------------------------");
	}

	static void listarDadosPessoa(LinkedList<Sapatos> loja) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número do CPF do cliente que você deseja consultar os dados: ");
		entrada = sc.next();

		for (int n = 0; n < loja.size(); n++) {

			Sapatos sap = loja.get(n);

			if (sap.getCpfPessoa().equals(entrada)) {

				System.out.println("\n----------------------------\n");

				System.out.println("Dados do Cliente: \n" + "Nome do Cliente: " + sap.getNomePessoa() + "\n"
						+ "CPF do Cliente: " + sap.getCpfPessoa());

				System.out.println("\n----------------------------");
			}

		}
	}
	
	static void listarCompras(LinkedList<Sapatos> loja) {
		
		for (Sapatos sapat : loja) {

			System.out.println("\n----------------------------\n");

			System.out.println("Informações de Cliente: \n" + "Nome do Cliente: " + sapat.getNomePessoa() + "\n"
					+ "CPF do Cliente: " + sapat.getCpfPessoa() + "\n" + "Tipo dos Sapatos: " + sapat.getTipoSapato() + "\n"
					+ "Número dos Sapatos: " + sapat.getTamanhoSapato() + "\n");

			System.out.println("----------------------------");

		}
		
	}

	static void excluirCompra(LinkedList<Sapatos> loja) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número do CPF do cliente que realizou a compra que você deseja excluir: ");
		entrada = sc.next();

		for (int n = 0; n < loja.size(); n++) {

			Sapatos sapato = loja.get(n);

			if (sapato.getCpfPessoa().equals(entrada)) {

				loja.remove(n);
			}

		}

	}
}
