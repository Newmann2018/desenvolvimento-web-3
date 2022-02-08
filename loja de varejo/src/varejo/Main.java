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
	Clie1.nomeDoCliente = "Maria Jose";
	Clie1 .rua ="cristovao";
	Clie1.numero ="150";
	Clie1.bairro = "Ipiranga";
	Clie1.cidade = "novo Anburgo";
	Clie1.estado = "RS";
	Clie1.cep = "89369-525";
	//cadastro estoque
	est2.nomeDoProduto ="tv";
	est2.MarcaDoProduto = "LG";
	est2.quantidadeDoProduto ="600";
	// cadastro do fornecedor
	forn3.nomeDoFornecedores = "moveis S.A";
	forn3.numeroDoFornecedor = "51 999239018";
	forn3.ruaDoFornecedor = "sao fransico";
	forn3.cidadeDoFornecedor = "Porto Alegre";
	forn3.bairroDoFornecedor ="nao interesa";
	forn3.estadoDoFornecedor = "RS";
	// cadastro de produto
	pro1.nomeDoProduto = "violino";
	pro1.Marca = "cassio";
	pro1.Fabricante = "sansung";
	pro1.cidadeDoFabricante ="canoas";
	pro1.Cor = "vermelho";
	pro1.estadoDoFabricante = "RS";
	// cadastro da transportadora
	tra1.nomeDaTransportadora = "jornada nas estrelas";
	tra1.numero = "38";
	tra1.rua = "sem fim";
	tra1.bairro = "mau me quer";
	tra1.cidade ="Cuiaba";
	tra1.estado ="MT";
	tra1.cnpj = "201456852";
	//cadastro vededores
	ven2.nomeDoVendedor = "fernando rocha";
	ven2.numero = "52326598";
	ven2.rua="cristovao";
	ven2.bairro="moca";
	ven2.cidade ="Sao Paulo";
	ven2.estado = "SP";
	// cadastro de vendas
	ven1.nomeDoProduto = "telefone";
	ven1.numeroDoProduto ="1238521459";
	ven1.cidadeDoProduto ="sao paulo";
	
	
	System.out.printf(Clie1.nomeDoCliente,Clie1.cidade,Clie1.bairro,Clie1.rua,Clie1.numero,Clie1.cep);
	System.out.printf(est2.nomeDoProduto,est2.MarcaDoProduto,est2.quantidadeDoProduto);
	System.out.printf(forn3.nomeDoFornecedores,forn3.cidadeDoFornecedor,forn3.ruaDoFornecedor,forn3.bairroDoFornecedor,forn3.numeroDoFornecedor);
	System.out.printf(pro1.nomeDoProduto,pro1.Marca,pro1.Fabricante,pro1.estadoDoFabricante,pro1.Cor,pro1.cidadeDoFabricante);
	System.out.printf(tra1.nomeDaTransportadora,tra1.rua,tra1.bairro,tra1.cidade,tra1.estado,tra1.numero,tra1.cnpj);
	System.out.printf(ven1.nomeDoProduto,ven1.cidadeDoProduto,ven1.numeroDoProduto);
	System.out.printf(ven2.nomeDoVendedor,ven2.numero,ven2.rua,ven2.cidade,ven2.bairro,ven2.estado);
	
	
	
	}

}
