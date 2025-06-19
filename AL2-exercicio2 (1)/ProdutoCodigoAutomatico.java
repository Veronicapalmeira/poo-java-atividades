// codigo correspondente ao exercicio 2- da atividade

public class ProdutoCodigoAutomatico {
    private static int proximoCodigo = 1;
    private final int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    // construtores sem codigo
    public ProdutoCodigoAutomatico() {
        this.codigo = proximoCodigo++;
    }

    public ProdutoCodigoAutomatico(String nome) {
        this();
        this.nome = nome;
    }

    public ProdutoCodigoAutomatico(String nome, int quantidade) {
        this(nome);
        this.quantidade = quantidade;
    }

    public ProdutoCodigoAutomatico(String nome, int quantidade, String tipo, double valor) {
        this(nome, quantidade);
        this.tipo = tipo;
        this.valor = valor;
    }

    // metodos 
    public String vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) return "Quantidade inválida!";
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            return "Venda realizada! Total: R$ " + String.format("%.2f", quantidadeVendida * valor);
        }
        return "Estoque insuficiente!";
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        if (quantidadeComprada > 0) {
            quantidade += quantidadeComprada;
            valor = novoValor;
        }
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) quantidade += quantidadeComprada;
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(ProdutoCodigoAutomatico outro) {
        if (outro == null) return false;
        return (this.nome != null && this.nome.equalsIgnoreCase(outro.nome)) &&
               (this.tipo != null && this.tipo.equalsIgnoreCase(outro.tipo));
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }

   
    public String toString() {
        return String.format(
            "Código: %d\nNome: %s\nQuantidade: %d\nTipo: %s\nValor: R$ %.2f",
            codigo,
            nome != null ? nome : "Não informado",
            quantidade,
            tipo != null ? tipo : "Não informado",
            valor
        );
    }
}