package entities;

public class Produto {
	
	private String nome;
	private Double preco;

					// CONSTRUTORES
	public Produto() {
		
	}
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
					// GETS & SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
					// DESCRIÇÃO DA CLASSE/OBJETO
	@Override
	public String toString() {
		return nome 
			   + String.format(", R$%.2f" ,preco);
	}
}