package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entitiesEnum.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		
		
		
					//CADASTRANDO INFORMAÇÕES SOBRE O CLIENTE
		System.out.println("Entre com os dados do Cliente: ");
		System.out.print("Nome: ");
		String clienteNome = sc.nextLine();
		System.out.print("Email: ");
		String clienteEmail = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date clienteDataNascimento = sdf.parse(sc.next());
		
		
					//PREENCHENDO O PEDIDO
		System.out.println("Entre com os dados do Pedido: ");
		System.out.print("Status: ");
		sc.nextLine();
		StatusPedido status = StatusPedido.valueOf(sc.nextLine());
		System.out.print("Quantos itens para esse pedido? ");
		byte numeroPedidos = sc.nextByte();
		
					// INSTACIA O CLIENTE
		Cliente cliente = new Cliente(clienteNome, clienteEmail, clienteDataNascimento);

					//CRIA UM NOVO PEDINDO COM AS INFORMACOES DIGITADAS
		Pedido pedido = new Pedido (new Date(), status, cliente);
		
					//CADASTRANDO O NUMERO SOLICITADO DE ITENS
		for (byte i = 0; i < numeroPedidos; i++) {
			System.out.println("Entre com os dados do #" + (i+1) + " item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeItem = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoItem = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeItem = sc.nextInt();
			
			Produto produto = new Produto (nomeItem, precoItem);
			ItemPedido itemPedido = new ItemPedido (quantidadeItem, precoItem, produto);
			pedido.addItem(itemPedido);	
		}
		
		System.out.println(pedido);
		
		sc.close();
			
		
	}
}
