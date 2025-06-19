
public class Principal {

	public static void main(String[] args) {
		Departamento d1 = new Departamento("Instituto de informática","INF");
		Departamento d2 = new Departamento("Instituto de Física","IF");
		
		Curso c1 = new Curso("Engenharia de Software","ES",d1);
		Curso c2 = new Curso("Inteligência Artificial","IA",d1);
		Curso c3 = new Curso("Física","",d2);
		
		
		Aluno a1 = new Aluno("Andre",202483738,2024,c1);
		Aluno a2 = new Aluno("Felipe",20238745,2023,c2);
		Aluno a3 = new Aluno("Maria",20208557,2020,c3);
		
		System.out.println(a1);
		System.out.println("\n=================================\n");
		System.out.println(a2);
		System.out.println("\n=================================\n");
		System.out.println(a3);

	}

}
