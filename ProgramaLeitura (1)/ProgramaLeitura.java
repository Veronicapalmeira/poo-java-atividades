import java.io.*;

public class ProgramaLeitura {

    public static void main(String[] args) {
    	double totalF = 0;
        double totalM = 0;
        double totalGeral = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("funcionarios.txt"));
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario f = new Funcionario(nome, sexo, salario, dependentes);

                System.out.println(f.mostraFuncionario());

                double imposto = f.impostoRenda();

                if (sexo == 'F' || sexo == 'f') {
                    totalF += imposto;
                } else if (sexo == 'M' || sexo == 'm') {
                    totalM += imposto;
                }

                totalGeral += imposto;
            }

            br.close();

            System.out.printf("\nTotal de imposto pago por mulheres: %.2f\n" , totalF);
            System.out.printf("Total de imposto pago por homens: %.2f\n" , totalM);
            System.out.printf("Total geral de imposto pago: %.2f\n" , totalGeral);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
