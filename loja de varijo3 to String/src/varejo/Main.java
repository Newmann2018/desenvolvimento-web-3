package varejo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cliente Clie1 = new Cliente();
	estoque est2 = new estoque(); 
	Fornecedores forn3 = new Fornecedores();
	Produtos pro1 = new Produtos();
	Transportadora tra1 = new Transportadora();
	Vendas ven1 = new Vendas();
	Vendedores ven2 = new Vendedores();
	//cadastro do cliente
	
	Clie1.getNomeDoCliente();
	Clie1.getCidade() ;
	Clie1.getNumero() ;
	Clie1.getBairro()  ;
	Clie1.getCidade() ;
	Clie1.getEstado();
	Clie1.getCep();
	
	//cadastro estoque
	est2.getNomeDoProduto();
	est2.getMarcaDoProduto();
	est2.getQuantidadeDoProduto();
	// cadastro do fornecedor
	forn3.getNomeDoFornecedores() ;
	forn3.getNumeroDoFornecedor();
	forn3.getRuaDoFornecedor() ;
	forn3.getCidadeDoFornecedor()  ;
	forn3.getBairroDoFornecedor();
	forn3.getEstadoDoFornecedor() ;
	// cadastro de produto
	pro1.getNomeDoProduto()  ;
	pro1.getMarca() ;
	pro1.getFabricante();
	pro1.getCidadeDoFabricante();
	pro1.getCor() ;
	pro1.getEstadoDoFabricante();
	// cadastro da transportadora
	tra1.getNomeDaTransportadora();
	tra1.getNumero();
	tra1.getRua();
	tra1.getBairro() ;
	tra1.getCidade();
	tra1.getEstado();
	tra1.getCnpj();
	//cadastro vededores
	ven2.getNomeDoVendedor() ;
	ven2.getNumero() ;
	ven2.getRua();
	ven2.getBairro();
	ven2.getCidade();
	ven2.getEstado() ;
	// cadastro de vendas
	ven1.getNomeDoProduto() ;
	ven1.getNumeroDoProduto();
	ven1.getCidadeDoProduto();
	
	
	System.out.printf(Clie1.getNomeDoCliente(),Clie1.getCidade(),Clie1.getBairro(),Clie1.getRua(),Clie1.getNumero(),Clie1.getCep());
	System.out.printf(est2.getNomeDoProduto(),est2.getMarcaDoProduto(),est2.getQuantidadeDoProduto());
	System.out.printf(forn3.getNomeDoFornecedores(),forn3.getCidadeDoFornecedor(),forn3.getRuaDoFornecedor(),forn3.getBairroDoFornecedor(),forn3.getNumeroDoFornecedor());
	System.out.printf(pro1.getNomeDoProduto(),pro1.getMarca(),pro1.getFabricante(),pro1.getEstadoDoFabricante(),pro1.getCor(),pro1.getCidadeDoFabricante());
	System.out.printf(tra1.getNomeDaTransportadora(),tra1.getRua(),tra1.getBairro(),tra1.getCidade(),tra1.getEstado(),tra1.getNumero(),tra1.getCnpj());
	System.out.printf(ven1.getNomeDoProduto(),ven1.getCidadeDoProduto(),ven1.getNumeroDoProduto());
	System.out.printf(ven2.getNomeDoVendedor(),ven2.getCidade(),ven2.getRua(),ven2.getBairro(),ven2.getEstado(),ven2.getNumero());
	
	@Override 
	public String toString() {
		return String.format("Dados do cliente:\n%s\nDados do vendedor:\n%s\nData do produto: %s\n"
		+ "Observações:\n%s", this.Clie1.toString(),this.ven1.toString(),this.formatarData(this.dataInternacao),
		this.formatarData(this.dataAlta),this.observacoes); 
			}
   }

}
