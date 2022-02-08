package varejo;

public class Vendedores {
	private String nomeDoVendedor;
	private String numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;

	
	
	public String getNomeDoVendedor() {
		return nomeDoVendedor;
	}
	public String getNumero() {
		return numero;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override 
	public String toString() {
		return String.format("Nome: %s\tTelefone: %s\tEndereço: %s",
		this.nomeDoVendedor,this.numero,this.rua.toString()); }
	
}