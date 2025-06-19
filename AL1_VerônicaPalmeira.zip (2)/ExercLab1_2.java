import java.util.Scanner;

public class ExercLab1_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Curso[] cursos = new Curso[4];

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Digite os dados do curso " + (i + 1) + ":");

            //validação nome do curso
            String nome;
            do {
                System.out.print("Nome: ");
                nome = sc.nextLine().trim();
                if (nome.isEmpty()) {
                    System.out.println("Erro: O nome do curso não pode ser vazio. Tente novamente.");
                }
            } while (nome.isEmpty());

            // Validar código do curso
            String codigo;
            do {
                System.out.print("Código: ");
                codigo = sc.nextLine().trim();
                if (codigo.isEmpty()) {
                    System.out.println("Erro: O código do curso não pode ser vazio. Tente novamente.");
                }
            } while (codigo.isEmpty());

            //Validar duração do curso
            int duracao = 0;
            boolean duracaoValida = false;
            while (!duracaoValida) {
                try {
                    System.out.print("Duração (em anos): ");
                    duracao = Integer.parseInt(sc.nextLine());
                    if (duracao <= 0) {
                        System.out.println("Erro: A duração deve ser um número positivo. Tente novamente.");
                    } else {
                        duracaoValida = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: A duração deve ser um número inteiro. Tente novamente.");
                }
            }

            // Validar nível do curso
            String nivel;
            do {
                System.out.print("Nível (Graduação, Pós-Graduação, Mestrado, Doutorado), escreva exatamente como está nas opções: ");
                nivel = sc.nextLine().trim();
                if (!nivel.equalsIgnoreCase("Graduação") &&
                    !nivel.equalsIgnoreCase("Pós-Graduação") &&
                    !nivel.equalsIgnoreCase("Mestrado") &&
                    !nivel.equalsIgnoreCase("Doutorado")) {
                    System.out.println("Erro: Nível inválido. Escolha entre Graduação, Pós-Graduação, Mestrado ou Doutorado.");
                }
            } while (!nivel.equalsIgnoreCase("Graduação") &&
                     !nivel.equalsIgnoreCase("Pós-Graduação") &&
                     !nivel.equalsIgnoreCase("Mestrado") &&
                     !nivel.equalsIgnoreCase("Doutorado"));

            // instanciar o curso e armazenar no vetor
            cursos[i] = new Curso(nome, codigo, duracao, nivel);
        }

        System.out.println("\nDados dos cursos:");
        for (Curso curso : cursos) {
            curso.exibirDados();
            System.out.println(); //Linha em branco para separar os cursos
        }

        sc.close();
    }
}