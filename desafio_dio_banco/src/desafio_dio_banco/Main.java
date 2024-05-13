package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente heitor = new Cliente();
		heitor.setNome("Heitor");
		
		Conta contaCorrente = new ContaCorrente(heitor);
		Conta contaPoupanca = new ContaPoupanca(heitor);
		
		//contaCorrente.depositar(100);
		//contaCorrente.trasferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		

	}

}
