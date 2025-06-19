import java.io.*;

public class ProgramaSerializacao {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("funcionarios.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("funcionarios.dat"));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                Funcionario f = new Funcionario(
                        campos[0],
                        campos[1].charAt(0),
                        Double.parseDouble(campos[2]),
                        Integer.parseInt(campos[3])
                );
                oos.writeObject(f);
            }

            br.close();
            oos.close();
            System.out.println("Funcionários gravados com sucesso.");

        } catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
