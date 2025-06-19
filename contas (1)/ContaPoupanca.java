
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, Cliente dono) {
		super(numero, dono);
	}

	public void atualizaSaldo(double percentual) {
		double atualizacao = this.getSaldo() * (percentual/100);
		this.depositar(atualizacao);
	}

	@Override
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
}
