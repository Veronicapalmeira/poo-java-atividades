
public class Principal {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Carioca",303,"Centro","Perto do parque","Goiânia","Goiás");
		Empresa empresa1 = new Empresa("23764678/00287","Soluções",endereco1);
		
		Endereco endereco2 = new Endereco("Flores",102,"Bela Vista","Nenhum","Goiânia","Goiás");
		Empresa empresa2 = new Empresa("32764678/00279","Soluções",endereco2);
		
		Empregado empregado1= new Empregado("Ed",1001,empresa1);
		Empregado empregado2= new Empregado("Felipe",1002,empresa2);
		
		System.out.println(empregado1);
		System.out.println("\n=================================\n");
		System.out.println(empregado2);
	}

}
