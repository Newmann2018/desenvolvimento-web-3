package varejo;

public class Transportadora {
	private String nomeDaTransportadora;
	private String numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cnpj;
	

	
	
	public String getNomeDaTransportadora() {
		return nomeDaTransportadora;
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
	public String getCnpj() {
		return cnpj;
	}
	public void setNomeDaTransportadora(String nomeDaTransportadora) {
		this.nomeDaTransportadora = nomeDaTransportadora;
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
	
	
    
}