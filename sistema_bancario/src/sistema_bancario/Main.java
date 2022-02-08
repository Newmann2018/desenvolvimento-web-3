package sistema_bancario;

public class Main {

	public static void main(String[] args) {
		ListaDeContas banco = new ListaDeContas();

		Conta conta1 = new Conta(1, 200);
		Conta conta2 = new Conta(2, 1000);

		Conta contaEditada = new Conta(1, 500);

		// Cadastrar as contas
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);

		// Listar contas
		System.out.println(banco.listar());

		banco.editar(contaEditada);

		// Listar contas
		System.out.println(banco.listar());
	}

}
