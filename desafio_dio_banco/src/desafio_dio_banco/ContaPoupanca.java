package desafio_dio_banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.printf("=== Estrato Conta Poupança");
		super.imprimirInfoComuns();
		
	}
	
}
