import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta (ou 0 para encerrar):"));
            if (numero == 0) {
                break;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            Cliente cliente = new Cliente(nome, telefone);

            int tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha o tipo de conta:\n1 - Conta Corrente\n2 - Conta Poupança\n3 - Conta Salário"
            ));

            Conta conta;

            if (tipo == 1) {
                conta = new ContaCorrente(numero, cliente);
            } else if (tipo == 2) {
                conta = new ContaPoupanca(numero, cliente);
            } else if (tipo == 3) {
                conta = new ContaSalario(numero, cliente);
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de conta inválido.");
                continue;
            }

            contas.add(conta);
        }

        StringBuilder resultado = new StringBuilder("Contas cadastradas:\n\n");
        for (Conta c : contas) {
            resultado.append(c.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
