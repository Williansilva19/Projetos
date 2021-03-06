package aplicacao;
import java.util.Scanner;
import entities.Conta;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c;
		System.out.println("Informe seus dados:");

		System.out.println("Nº conta: ");
		int numConta = sc.nextInt();
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Deseja fazer um deposito inicial? [s/n]");
		char resp = sc.next().charAt(0);
		if (resp == 's' || resp == 'S') {
			System.out.println("Deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			
			c = new Conta(numConta, nome, depositoInicial);
		} else {
			c = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(c.toString());

		Deposita(c);
		RealizaSaque(c);
		
		sc.close();
	}

	public static void Deposita(Conta c) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor do deposito: ");
		double valor = sc.nextDouble();
		c.Deposito(valor);
		System.out.println(c.toString());
	}

	public static void RealizaSaque(Conta c) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor do saque: ");
		double valor = sc.nextDouble();
		c.Saque(valor);
		System.out.println(c.toString());
	}
}	


