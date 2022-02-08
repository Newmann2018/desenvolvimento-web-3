package sistema_bancario;

public class Cliente {
	private String cpf;
	private String nome;
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do cliente: %s\nCPF do cliente: %s\n\n", this.nome,this.cpf);
	}
}
