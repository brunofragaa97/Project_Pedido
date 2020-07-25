package entities;

public class ItemPedido {

	private Integer quantidade;
	private Double preco;
	
					// ASSOCIAÇÃO
	private Produto produto; // UM PARA UM
	
					// CONSTRUTORES
	private ItemPedido() {
	}
	
	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
					// GETS & SETS
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
					// MÉTODOS
	public double subTotal() {
		return produto.getPreco() * quantidade;
	}
	
					// DESCRIÇÃO DA CLASSE
	public String toString() {
		return
		produto
		+ ", Quantidade: " + quantidade
		+ String.format(", SubTotal: R$%.2f", subTotal());
	}
}
