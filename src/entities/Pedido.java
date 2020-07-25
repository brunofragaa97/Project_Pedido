package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
					// ASSOCIAÇÃO DOS OBJETOS
	
	private List<ItemPedido> itens = new ArrayList<>(); //UM PARA VARIOS
	private Cliente cliente;  // UM PARA UM
	
	
					// CONSTRUTORES
	public Pedido() {
		
		
	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
					// GETS && SETS
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
					// MMÉTODOS
	public void addItem (ItemPedido item) {
		itens.add(item);
	}
	public void removerItem (ItemPedido item) {
		itens.remove(item);
	}
	public double total() {
		double total = 0;
		for (ItemPedido c : itens) {
			total += c.subTotal();
		}
		return total;
	}
	
					// DESCRIÇÃO DAS CLASSES
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nINFORMAÇÕES DO PEDIDO: \nMomento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(getStatus() + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\nITENS PEDIDOS:\n");
		for (ItemPedido item : itens ) {
			sb.append(item.toString()
					  +"\n");
		}
		sb.append("Valor total do pedido: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
}
