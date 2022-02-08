package varejo;

public class estoque {
	private String nomeDoProduto;
	private String quantidadeDoProduto;
	private String MarcaDoProduto;
	
	
	
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public String getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public String getMarcaDoProduto() {
		return MarcaDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public void setQuantidadeDoProduto(String quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	public void setMarcaDoProduto(String marcaDoProduto) {
		MarcaDoProduto = marcaDoProduto;
	}
	
	@Override 
	public String toString() {
		return String.format("CRM: %s\tNome: %s\tTelefone: %s\tEndereço: %s",this.nomeDoProduto,this.MarcaDoProduto,
				this.quantidadeDoProduto.toString()); }
	
}
