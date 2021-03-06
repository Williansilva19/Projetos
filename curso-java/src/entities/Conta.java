package entities;

public class Conta {

	private int numConta;
	private String nome;
	private double Saldo;

	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		Deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return Saldo;
	}

	public double Saque(double valor) {
		this.Saldo -= valor + 5;

		return this.Saldo;
	}

	public double Deposito(double valor) {
		this.Saldo += valor;

		return this.Saldo;
	}

	public String toString() {
		return "Nº conta: " + numConta + " Titular Conta: " + nome + " Saldo atual: " + Saldo;
	}

}