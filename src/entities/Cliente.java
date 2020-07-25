package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

					
	private static SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
	
	private String nome;
	private String email;
	private Date dataDeNascimento;
	
						// CONSTRUTORES
	public Cliente() {
		
	}
	public Cliente(String nome, String email, Date dataDeNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
	}
		
						// GETS && SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
						// DESCRIÇÃO DA CLASSE
	@Override
	public String toString() {
		return  nome + " " 
				+ sdf.format(getDataDeNascimento()) 
				+ " " 
				+ email;
	}
	
}
