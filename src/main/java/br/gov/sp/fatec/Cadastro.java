package br.gov.sp.fatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cadastro {
	
	@Autowired
	@Qualifier("usuario3")
	private Usuario user;
	
	public Cadastro() {
	}
	
	public String ler() {
		return user.getNome();
	}
	
	public void setNome(Usuario user) {
		this.user = user;
	}
}
