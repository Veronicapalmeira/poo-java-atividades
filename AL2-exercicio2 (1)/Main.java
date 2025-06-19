// codigo correspondente ao exercicio 2- da atividade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoCodigoAutomatico[] produtos = new ProdutoCodigoAutomatico[4];

        System.out.println("=== SISTEMA DE PRODUTOS (CÓDIGO AUTOMÁTICO) ===");

        // 1.cadastro (construtores sem codigo)
        System.out.println("\n--- Cadastro ---");
        
        // produto 1: construtor vazio
        produtos[0] = new ProdutoCodigoAutomatico();
        System.out.println("\nProduto 1 criado. Código gerado: " + produtos[0].getCodigo());
        
        // produto 2: nome
        System.out.print("\nDigite o nome do Produto 2: ");
        produtos[1] = new ProdutoCodigoAutomatico(scanner.nextLine());
        
        // produto 3: nome + Quantidade
        System.out.print("\nDigite o nome do Produto 3: ");
        String nome3 = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        produtos[2] = new ProdutoCodigoAutomatico(nome3, scanner.nextInt());
        scanner.nextLine();
        
        // produto 4: todos dados
        System.out.print("\nDigite o nome do Produto 4: ");
        String nome4 = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        int qtd4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o tipo: ");
        String tipo4 = scanner.nextLine();
        System.out.print("Digite o valor: R$ ");
        produtos[3] = new ProdutoCodigoAutomatico(nome4, qtd4, tipo4, scanner.nextDouble());
        scanner.nextLine();

        // 2.completar dados do produto 1 
        System.out.println("\n--- Completar Produto 1 ---");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Quantidade: ");
        int qtd1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo1 = scanner.nextLine();
        System.out.print("Valor: R$ ");
        produtos[0].inserir(nome1, qtd1, tipo1, scanner.nextDouble());
        scanner.nextLine();

        // 3. operações
        System.out.println("\n--- Operações ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("\n=== Produto %d ===\n", i+1);
            
            System.out.println("\n[ANTES]");
            System.out.println(produtos[i]);
            
            System.out.print("\nQuantidade para vender: ");
            System.out.println(produtos[i].vender(scanner.nextInt()));
            scanner.nextLine();
            
            System.out.print("\nQuantidade para comprar (com novo valor): ");
            int qtdCompra = scanner.nextInt();
            System.out.print("Novo valor: R$ ");
            produtos[i].comprar(qtdCompra, scanner.nextDouble());
            scanner.nextLine();
            
            System.out.print("\nQuantidade para comprar (sem alterar valor): ");
            produtos[i].comprar(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("\n[DEPOIS]");
            System.out.println(produtos[i]);
        }

        // 4. comparação
        System.out.println("\n--- Comparação ---");
        System.out.println("Criar produto para comparar:");
        System.out.print("Nome: ");
        String nomeComp = scanner.nextLine();
        System.out.print("Tipo: ");
        ProdutoCodigoAutomatico produtoComp = new ProdutoCodigoAutomatico(nomeComp, 0, scanner.nextLine(), 0);
        
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Produto %d é igual? %b\n", i+1, produtos[i].igual(produtoComp));
        }

        scanner.close();
    }
}