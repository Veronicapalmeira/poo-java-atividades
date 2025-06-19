//codigo correspondente ao exercicio 1- da atividade
package exer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[4];

        System.out.println("=== SISTEMA DE GERENCIAMENTO DE PRODUTOS ===");

        // cadastro dos produtos
        System.out.println("\n--- CADASTRO DE PRODUTOS ---");

        // produto 1: Apenas código
        System.out.println("\n[Produto 1 - Apenas código]");
        System.out.print("Digite o código: ");
        produtos[0] = new Produto(scanner.nextInt());
        scanner.nextLine();

        // produto 2: codigo + nome
        System.out.println("\n[Produto 2 - Código + nome]");
        System.out.print("Digite o código: ");
        int cod2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        produtos[1] = new Produto(cod2, scanner.nextLine());

        // produto 3: codigo + nome + quantidade
        System.out.println("\n[Produto 3 - Código + nome + quantidade]");
        System.out.print("Digite o código: ");
        int cod3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome3 = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        produtos[2] = new Produto(cod3, nome3, scanner.nextInt());
        scanner.nextLine();

        // produto 4: todos os dados
        System.out.println("\n[Produto 4 - Todos os dados]");
        System.out.print("Digite o código: ");
        int cod4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome4 = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        int qtd4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o tipo: ");
        String tipo4 = scanner.nextLine();
        System.out.print("Digite o valor: R$ ");
        produtos[3] = new Produto(cod4, nome4, qtd4, tipo4, scanner.nextDouble());
        scanner.nextLine();

        // completar dados do produto 1
        System.out.println("\n--- COMPLETAR DADOS DO PRODUTO 1 ---");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Quantidade: ");
        int qtd1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo1 = scanner.nextLine();
        System.out.print("Valor: R$ ");
        double valor1 = scanner.nextDouble();
        scanner.nextLine();
        produtos[0].inserir(nome1, qtd1, tipo1, valor1);

        // operações com cada produto
        System.out.println("\n--- OPERAÇÕES ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("\n=== PRODUTO %d ===\n", i+1);
            
            // consulta INICIAL
            System.out.println("\n[ESTADO INICIAL]");
            System.out.println(produtos[i]);
            
            // venda
            System.out.println("\n[VENDA]");
            System.out.print("Quantidade para vender: ");
            System.out.println(produtos[i].vender(scanner.nextInt()));
            scanner.nextLine();
            
            // compra com novo valor
            System.out.println("\n[COMPRA COM NOVO VALOR]");
            System.out.print("Quantidade para comprar: ");
            int qtdCompra = scanner.nextInt();
            System.out.print("Novo valor: R$ ");
            produtos[i].comprar(qtdCompra, scanner.nextDouble());
            scanner.nextLine();
            
            // compra sem alterar valor
            System.out.println("\n[COMPRA SEM ALTERAR VALOR]");
            System.out.print("Quantidade para comprar: ");
            produtos[i].comprar(scanner.nextInt());
            scanner.nextLine();
            
            // consulta FINAL
            System.out.println("\n[ESTADO FINAL]");
            System.out.println(produtos[i]);
            System.out.println("=======================");
        }

        // comparação com produto externo
        System.out.println("\n--- COMPARAÇÃO ---");
        System.out.println("Digite os dados do produto para comparação:");
        System.out.print("Nome: ");
        String nomeComp = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipoComp = scanner.nextLine();
        Produto produtoComp = new Produto(0, nomeComp, 0, tipoComp, 0);

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < produtos.length; i++) {
            boolean resultado = produtos[i].igual(produtoComp);
            System.out.printf("Produto %d: %s | Tipo: %s | Igual? %b\n",
                            i+1,
                            produtos[i].getNome(),
                            produtos[i].getTipo(),
                            resultado);
        }

        scanner.close();
        System.out.println("\n=== SISTEMA ENCERRADO ====");
    }
}