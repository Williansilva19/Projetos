package entities;

public class Department {
	private String nome;

	public Department () {
		
	}
	//constructor
	public Department(String nome) {		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
