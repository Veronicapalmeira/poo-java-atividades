import java.util.Scanner;

public class ExercLab1_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de cursos: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); 

        Curso[] cursos = new Curso[quantidade];

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Digite os dados do curso " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Duração (em anos): ");
            int duracao = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Nível (Graduação, Pós-Graduação, Mestrado, etc.): ");
            String nivel = sc.nextLine();

            //instanciar o curso e armazenar no vetor
            cursos[i] = new Curso(nome, codigo, duracao, nivel);
        }

        System.out.println("\nDados dos cursos:");
        for (Curso curso : cursos) {
            curso.exibirDados();
            System.out.println(); 
        }

        sc.close();
    }
}