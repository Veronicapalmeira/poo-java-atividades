
public class Cliente {
	private String nome;
	private String cpf;
	private Endereco end;
	
	public Cliente(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
	}
	
	public String toString() {
		return "Nome: "+ nome + "\nCPF: "+ cpf + end;
	}
}
