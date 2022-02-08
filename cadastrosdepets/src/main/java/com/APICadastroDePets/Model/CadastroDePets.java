package com.APICadastroDePets.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastrodepets")
public class CadastroDePets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Nome;
	private String email;
	private String usuario;
	private String senha;
	private String telefone;
	private String cidade;
	private String estado;
	private String sexo;
	

	public CadastroDePets(int id, String Nome, String email, String usuario, String senha,String telefone,String cidade,String estado,String sexo){
		
		this.id = id;
		this.Nome = Nome;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
		this.cidade = cidade;
		this.estado = estado;
		this.sexo = sexo;
	}
	public CadastroDePets(){
		
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return Nome;
	}
	public String getEmail() {
		return email;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getSexo() {
		return sexo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Nome, cidade, email, estado, id, senha, sexo, telefone, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroDePets other = (CadastroDePets) obj;
		return Objects.equals(Nome, other.Nome) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado) && id == other.id
				&& Objects.equals(senha, other.senha) && Objects.equals(sexo, other.sexo)
				&& Objects.equals(telefone, other.telefone) && Objects.equals(usuario, other.usuario);
	}
	@Override
	public String toString() {
		return "CadastroDePets [id=" + id + ", Nome=" + Nome + ", email=" + email + ", usuario=" + usuario + ", senha="
				+ senha + ", telefone=" + telefone + ", cidade=" + cidade + ", estado=" + estado + ", sexo=" + sexo
				+ "]";
	}
	
}
