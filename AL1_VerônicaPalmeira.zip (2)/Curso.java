public class Curso {
    private String nome;
    private String codigo;
    private int duracao; // em anos
    private String nivel; // Graduação, Pós-Graduação, Mestrado, etc.

    public Curso(String nome, String codigo, int duracao, String nivel) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    //exibir os dados do curso
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Duração: " + duracao + " anos");
        System.out.println("Nível: " + nivel);
    }
}