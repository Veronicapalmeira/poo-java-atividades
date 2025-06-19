
public class TestaConta {

	public static void main(String[] args) {
		Cliente dono1 = new Cliente("joao","62 99999-9999");
		Cliente dono2 = new Cliente("maria","62 98888-8888");
		
		Conta cc = new ContaCorrente(1,dono1);
		Conta cp = new ContaPoupanca(2,dono2);
		
		//testando depositar e sacar da conta corrente
		cc.depositar(200);
		System.out.println(cc);
		cc.sacar(100);
		System.out.println(cc);
		System.out.println();
		
		//testando depositar e sacar da conta poupança, sem taxa
		cp.depositar(200);
		System.out.println(cp);
		cp.sacar(100);
		System.out.println(cp);
		System.out.println();
		
		//casting
		((ContaPoupanca)cp).atualizaSaldo(20);
		System.out.println(cp);
		System.out.println();
		
		ContaCorrente cc2 = new ContaCorrente(3,dono1);
		ContaPoupanca cp2 = new ContaPoupanca(4,dono2);
		
		//depositei para conseguir testar as taxas de maneira mais eficientes
		cc2.depositar(300);
        cp2.depositar(300); 
        
		//testando transferência entre conta corrente e conta poupança 
		cc2.transferir(100,cp2);
		System.out.println("Dados da conta que transferiu: \n"+cc2);//com taxa 
		System.out.println("Dados da conta que recebeu: \n"+cp2);//sem taxa
		System.out.println();
		
		//testando depositar, sacar e tranferir em conta salário
		ContaSalario cs = new ContaSalario(5,dono1);
		ContaSalario cs1 = new ContaSalario(6,dono2);
		
		cs.depositar(200);
		System.out.println(cs);
		cs.sacar(100);
		System.out.println(cs);
		System.out.println();
		
		cs1.depositar(200);
		System.out.println(cs1);
		cs1.sacar(100);
		System.out.println(cs1);
		System.out.println();
		
		cs.transferir(100,cs1);
		System.out.println("Dados da conta que transferiu: \n"+cs);
		System.out.println("Dados da conta que recebeu: \n"+cs1);
		System.out.println();
		
		//testando transferência entre diferentes tipos de conta
		cc2.transferir(100,cs);
		System.out.println("Dados da conta que transferiu: \n"+cc2);
		System.out.println("Dados da conta que recebeu: \n"+cs);
		System.out.println();
		
		cp2.transferir(100,cs);
		System.out.println("Dados da conta que transferiu: \n"+cp2);
		System.out.println("Dados da conta que recebeu: \n"+cs);
		
	}

}
