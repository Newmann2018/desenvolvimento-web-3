package varejo;

public class Cliente {
	private String nomeDoCliente;
	private String numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
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
	public String getCep() {
		return cep;
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
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override 
	public String toString() {
		return String.format("CRM: %s\tNome: %s\tTelefone: %s\tEndereço: %s",
		this.nomeDoCliente,this.numero,this.rua.toString()); }
	
	
	}
	
}