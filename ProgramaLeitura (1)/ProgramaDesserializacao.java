import java.io.*;

public class ProgramaDesserializacao {

    public static void main(String[] args) {
        double totalF = 0;
        double totalM = 0;
        double totalGeral = 0;
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("funcionarios.dat"));

            while (true) {
                try {
                    Funcionario f = (Funcionario) ois.readObject();
                    System.out.println(f.mostraFuncionario());

                    double imposto = f.impostoRenda();

                    if (f.sexo == 'F' || f.sexo == 'f') {
                        totalF += imposto;
                    } else if (f.sexo == 'M' || f.sexo == 'm') {
                        totalM += imposto;
                    }
                    totalGeral += imposto;

                } catch (EOFException erro) {
                    break;
                }
            }

            ois.close();

            System.out.println("\nTotal de imposto pago por mulheres: " + totalF);
            System.out.println("Total de imposto pago por homens: " + totalM);
            System.out.println("Total geral de imposto pago: " + totalGeral);

        } catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
        catch (ClassNotFoundException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
