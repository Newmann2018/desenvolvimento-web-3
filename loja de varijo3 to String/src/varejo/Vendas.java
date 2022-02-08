package varejo;

public class Vendas {
	private String nomeDoProduto;
	private String numeroDoProduto;
	private String cidadeDoProduto;
	
	
	
	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public String getNumeroDoProduto() {
		return numeroDoProduto;
	}
	public String getCidadeDoProduto() {
		return cidadeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public void setNumeroDoProduto(String numeroDoProduto) {
		this.numeroDoProduto = numeroDoProduto;
	}
	public void setCidadeDoProduto(String cidadeDoProduto) {
		this.cidadeDoProduto = cidadeDoProduto;
	}
	
	@Override 
	public String toString() {
		return String.format("Nome: %s\tnumero do produto: %s\tEndereço: %s",
		this.nomeDoProduto,this.numeroDoProduto,this.cidadeDoProduto.toString()); }
	
	}
	
	

	
	

