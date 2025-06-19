
public class Aluno {
	private String nome;
	private int matricula;
	private int ano;
	private Curso curso;
	
	
	public Aluno(String nome,int matricula,int ano, Curso curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.ano = ano;	
		this.curso = curso;
	}
	
	public String toString() {
		return "Aluno(a): " + nome + "\nMatricula: "+ matricula +"\nAno: "+ ano + curso;
	}
}
