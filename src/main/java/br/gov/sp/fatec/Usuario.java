package br.gov.sp.fatec;

public class Usuario implements UsuarioInterface{

	private String nome;
	private int cpf;
	private int idade;
	private String time;

	public Usuario(){
		
	}

	@Override
	public String getNome() {
		return "\n Usuario \n \n"
				+ "    NOME: " + nome 
				+ "\n     CPF: " + cpf
				+ "\n   IDADE: " + idade
				+ "\n    TIME: " + time + "\n";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public String getTime() {
		return time;
	}

}
