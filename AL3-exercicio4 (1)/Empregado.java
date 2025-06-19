
public class Empregado {
	private String nome;
	private int matricula;
	private Empresa empresa;
	
	public Empregado(String nome,int matricula,Empresa empresa) {
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
	}
	public String toString() {
		return "Empregado(a): "+ nome + "\nMatrícula: "+ matricula + "\n\n== Informações da empresa que trabalha: =="+ empresa;
	}
}
