
public class Empresa {
	private String cnpj;
	private String razao;
	private Endereco endereco;
	
	public Empresa(String cnpj,String razao,Endereco endereco) {
		this.cnpj = cnpj;
		this.razao = razao;
		this.endereco = endereco;
	}
	
	public String toString() {
		return "\nCNPJ: "+ cnpj + "\nRazão social: "+ razao +"\n\n== Informações de endereço da empresa: =="+ endereco;
	}
}
