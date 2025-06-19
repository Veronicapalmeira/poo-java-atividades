public class Pessoa {
    private String nome;
    private double salario;
    private int numeroDependentes;
    private int idade;

    public Pessoa(String nome, double salario, int numeroDependentes, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.numeroDependentes = numeroDependentes;
        this.idade = idade;
    }

    public double calculaImposto() {
        if (idade >= 65) {
            return 0;
        }

        double imposto = 0;

        if (salario <= 1787.77) {
            imposto = 0;
        } else if (salario >= 1787.78 && salario <= 2679.29) {
            imposto = salario * 0.075 - 134.08;
        } else if (salario >=2679.30 && salario <= 3572.43) {
            imposto = salario * 0.15 - 335.03;
        } else if (salario>=3572.44 && salario <= 4463.81) {
            imposto = salario * 0.225 - 602.96;
        } else {
            imposto = salario * 0.275 - 826.15;
        }

     
        double deducaoDependentes = numeroDependentes * 179.71;
        imposto -= deducaoDependentes;
        
        return Math.max(imposto, 0);
    }
}