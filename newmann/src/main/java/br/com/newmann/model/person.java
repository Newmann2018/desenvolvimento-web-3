package br.com.newmann.model;

public class person {
	
	private String name;
	private String Abilidade;
	private String classeSocial ;
	private String veiculo;
	
	public person(String name, String Abilidade, String classeSocial, String veiculo) {
		this.name = name;
		this.Abilidade = Abilidade;
		this.classeSocial = classeSocial;
		this.veiculo = veiculo;
	}

	public String getName() {
		return name;
	}

	public String getAbilidade() {
		return Abilidade;
	}

	public String getclasseSocial() {
		return classeSocial;
	}

	public String getveiculo() {
		return veiculo;
	}

	public void setveiculo(String veiculo) {
		this.veiculo = veiculo;
	}

}
