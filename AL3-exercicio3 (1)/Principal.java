
public class Principal {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Carioca",303,"Centro","Perto do parque","Goiânia","Goiás");
		Cliente c1 = new Cliente("Carol","96045632434",e1);
		
		Endereco e2 = new Endereco("Flores",102,"Bela Vista","Nenhum","Goiânia","Goiás");
		Cliente c2 = new Cliente("Fabiana","70745623408",e2);
		
		System.out.println(c1);
		System.out.println("\n=================================\n");
		System.out.println(c2);

	}

}
