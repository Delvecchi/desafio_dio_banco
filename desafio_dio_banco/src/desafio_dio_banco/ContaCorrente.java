package desafio_dio_banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.printf("=== Extrato Conta Corrente");
		super.imprimirInfoComuns();
		
	}
	
}
