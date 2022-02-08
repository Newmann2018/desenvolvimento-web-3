package varejo;

public class Produtos {
	private String nomeDoProduto;
	private String Marca;
	private String Cor;
	private String Fabricante;
	private String cidadeDoFabricante;
	private String estadoDoFabricante;
	

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public String getMarca() {
		return Marca;
	}
	public String getCor() {
		return Cor;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public String getCidadeDoFabricante() {
		return cidadeDoFabricante;
	}
	public String getEstadoDoFabricante() {
		return estadoDoFabricante;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public void setCidadeDoFabricante(String cidadeDoFabricante) {
		this.cidadeDoFabricante = cidadeDoFabricante;
	}
	public void setEstadoDoFabricante(String estadoDoFabricante) {
		this.estadoDoFabricante = estadoDoFabricante;
	}
	
	
}