//codigo correspondente ao exercicio 1- da atividade
package exer2;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    // construtores
    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    // metodos
    public String vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            return "Quantidade inválida para venda!";
        }
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            double total = quantidadeVendida * valor;
            return "Venda realizada! Total: R$ " + String.format("%.2f", total);
        } else {
            return "Estoque insuficiente! Quantidade disponível: " + quantidade;
        }
    }

    public void comprar(int quantidadeComprada, double novoValor) {
        if (quantidadeComprada > 0) {
            quantidade += quantidadeComprada;
            valor = novoValor;
        }
    }

    public void comprar(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            quantidade += quantidadeComprada;
        }
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outroProduto) {
        if (outroProduto == null) return false;
        boolean nomesIguais = this.nome != null && 
                             outroProduto.nome != null && 
                             this.nome.equalsIgnoreCase(outroProduto.nome);
        boolean tiposIguais = this.tipo != null && 
                             outroProduto.tipo != null && 
                             this.tipo.equalsIgnoreCase(outroProduto.tipo);
        return nomesIguais && tiposIguais;
    }

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