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

	public static void inclui() {
		System.out.println("Voc� entrou no m�todo Inclui.");
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		ArrayList<Conta> agencia = new ArrayList<Conta>();
		Set<Conta> cpfSet = new HashSet<Conta>();
		Conta conta;
		
		for (int i = 0; i < 3; i++) {
			Conta ct = new Conta();
			conta = new Conta();
			String cpf;
			System.out.println("Digite o nome do cliente: ");
			conta.setNomePessoa(cons.nextLine());
			System.out.println("Digite o n�mero do CPF do cliente: ");
		    conta.setCpfPessoa(cons.nextLine());
		    cpfSet.add(conta);
		    System.out.println("Digite a data de anivers�rio do cliente: ");
		    conta.setAniversarioPessoa(cons.nextLine());
		    System.out.println("Digite o n�mero da nova conta: ");
		    conta.setNumeroConta(cons.nextLine());
		    System.out.println("Digite o tipo de conta: ");
		    conta.setTipoConta(cons.nextLine());
		    agencia.add(conta);
		    
			System.out.println("----------------------------");
		}
	}

//	public static void altera() {
//		System.out.println("Voc� entrou no m�todo Altera.");
//	}

	public static void consulta() {
		System.out.println("Voc� entrou no m�todo Consulta.");
	}
	
	public static void exclui() {
		System.out.println("Voc� entrou no m�todo Exclui.");
	}
	
	public static void dadosPessoa() {
		System.out.println("Voc� entrou no m�todo Consulta.");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cons = new Scanner(System.in);
		ArrayList<Conta> agencia = new ArrayList<Conta>();
		Conta conta;
		
		//Menu
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		do {
			menu();
			opcao = entrada.nextInt();
			
			switch(opcao) {
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
