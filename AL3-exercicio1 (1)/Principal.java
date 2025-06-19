
public class Principal {

	public static void main(String[] args) {
		Compositor c1 = new Compositor("Alan","Brasileiro");
		Musica m1 = new Musica("Felicidades",2025,"MPB",c1);
		
		Compositor c2 = new Compositor("Rafaela","Espanhola");
		Musica m2 = new Musica("Terra",2024,"Reggaeton",c2);

		System.out.println(m1);
		System.out.println("\n=================================\n");
		System.out.println(m2);
	}

}
