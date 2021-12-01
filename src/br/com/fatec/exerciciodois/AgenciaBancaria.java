package br.com.fatec.exerciciodois;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import br.com.fatec.exerciciodois.Conta;

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
		System.out.println("Op��o: ");
	}
	
	public static void repetir() {
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		ArrayList<Conta> agencia = new ArrayList<Conta>();
		Set<Conta> cpfSet = new HashSet<Conta>();
		Conta conta;

//			Conta ct = new Conta();
		conta = new Conta();
	}

	public static void inclui() {
		System.out.println("Voc� entrou no m�todo Inclui.");
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		ArrayList<Conta> agencia = new ArrayList<Conta>();
		Set<Conta> cpfSet = new HashSet<Conta>();
		Conta conta;

//			Conta ct = new Conta();
		conta = new Conta();
//			String cpf;
		System.out.println("Digite o nome do cliente: ");
		conta.setNomePessoa(cons.next());
		System.out.println("Digite o n�mero do CPF do cliente: ");
		conta.setCpfPessoa(cons.next());
		cpfSet.add(conta);
		System.out.println("Digite a data de anivers�rio do cliente: ");
		conta.setAniversarioPessoa(cons.next());
		System.out.println("Digite o n�mero da nova conta: ");
		conta.setNumeroConta(cons.next());
		System.out.println("Digite o tipo de conta: ");
		conta.setTipoConta(cons.next());
		agencia.add(conta);
		
		System.out.println(conta.getNomePessoa());
		System.out.println(conta.getCpfPessoa());
		System.out.println(conta.getAniversarioPessoa());
		System.out.println(conta.getNumeroConta());
		System.out.println(conta.getTipoConta());
		
		System.out.println("----------------------------");		
		
	}

	public static void consulta() {
//		@SuppressWarnings("resource")
//		Scanner cons = new Scanner(System.in);
//		ArrayList<Conta> agencia = new ArrayList<Conta>();
//		Set<Conta> cpfSet = new HashSet<Conta>();
		
		Conta conta;
				
//		System.out.println(conta.getNomePessoa());
		
		for (int n = 0; n < agencia.size(); n++) {
			conta = (Conta) agencia.get(n);
			System.out.println("Informa��es de Cliente: \n" + "Nome do Cliente: " + conta.getNomePessoa() + "\n"
					+ "CPF do Cliente: " + conta.getCpfPessoa() + "\n" + "Data de Anivers�rio do Cliente: "
					+ conta.getAniversarioPessoa() + "\n" + "N�mero da Conta: " + conta.getNumeroConta() + "\n"
					+ "Tipo de Conta: " + conta.getTipoConta() + "\n");
			
			System.out.println(conta.getNomePessoa());
		}

	}

	public static void exclui() {
		System.out.println("Voc� entrou no m�todo Exclui.");
	}

	public static void dadosPessoa() {
		System.out.println("Voc� entrou no m�todo Consulta.");
	}

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner cons = new Scanner(System.in);
//		ArrayList<Conta> agencia = new ArrayList<Conta>();
//		Conta conta;

		// Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				inclui();
				break;

			case 2:
				consulta();
				break;

			case 3:
				exclui();
				break;

			case 4:
				dadosPessoa();
				break;

			default:
				System.out.println("Op��o Inv�lida.");
			}
		} while (opcao != 0);
	}

}
