package br.com.fatec.exerciciodois;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AgenciaBancaria {

	public static void menu() {
		System.out.println("-----Cadastro de Contas-----");
		System.out.println("------------Menu------------");
		System.out.println("----------------------------");
		System.out.println("1 - Cadastrar Nova Conta");
		System.out.println("2 - Buscar Todas as Contas");
		System.out.println("3 - Apagar Conta");
		System.out.println("4 - Listar Dados da Pessoa");
		System.out.println("0 - Sair");
		System.out.println("Opção: ");
	}

	public static void main(String[] args) {

		ArrayList<Conta> agencia = new ArrayList<Conta>();

		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				adicionarConta(agencia);
				break;

			case 2:
				consultar(agencia);
				break;

			case 3:
				apagarConta(agencia);
				break;

			case 4:
				listarDadosPessoa(agencia);
				break;

			default:
				System.out.println("Opção Inválida.");
			}
		} while (opcao != 0);
	}

	static void adicionarConta(ArrayList<Conta> agencia) {

		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		Set<Conta> cpfSet = new HashSet<Conta>();

		Conta conta = new Conta();

		System.out.println("Digite o nome do cliente: ");
		conta.setNomePessoa(cons.nextLine());
		System.out.println("Digite o número do CPF do cliente: ");
		conta.setCpfPessoa(cons.nextLine());
		cpfSet.add(conta);
		System.out.println("Digite a data de aniversário do cliente: ");
		conta.setAniversarioPessoa(cons.nextLine());
		System.out.println("Digite o número da nova conta: ");
		conta.setNumeroConta(cons.nextLine());
		System.out.println("Digite o tipo de conta: ");
		conta.setTipoConta(cons.nextLine());
		agencia.add(conta);

		System.out.println("----------------------------");

	}

	static void consultar(ArrayList<Conta> agencia) {

		for (Conta conta : agencia) {

			System.out.println("\n----------------------------\n");

			System.out.println("Informações de Cliente: \n" + "Nome do Cliente: " + conta.getNomePessoa() + "\n"
					+ "CPF do Cliente: " + conta.getCpfPessoa() + "\n" + "Data de Aniversário do Cliente: "
					+ conta.getAniversarioPessoa() + "\n" + "Número da Conta: " + conta.getNumeroConta() + "\n"
					+ "Tipo de Conta: " + conta.getTipoConta() + "\n");

			System.out.println("----------------------------");

		}

	}

	static void apagarConta(ArrayList<Conta> agencia) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número da conta que você deseja excluir: ");
		entrada = sc.next();

		for (int n = 0; n < agencia.size(); n++) {

			Conta cont = agencia.get(n);

			if (cont.getNumeroConta().equals(entrada)) {

				agencia.remove(n);
			}
		}

	}

	static void listarDadosPessoa(ArrayList<Conta> agencia) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String entrada;

		System.out.println("Digite o número do CPF do cliente que você deseja consultar os dados: ");
		entrada = sc.next();

		for (int n = 0; n < agencia.size(); n++) {

			Conta cont = agencia.get(n);

			if (cont.getCpfPessoa().equals(entrada)) {

				System.out.println("\n----------------------------\n");

				System.out.println("Dados do Cliente: \n" + "Nome do Cliente: " + cont.getNomePessoa() + "\n"
						+ "CPF do Cliente: " + cont.getCpfPessoa() + "\n" + "Data de Aniversário do Cliente: "
						+ cont.getAniversarioPessoa());

				System.out.println("\n----------------------------");
			}

		}

	}

}