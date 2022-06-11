package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class DadosProduto {
	public static void main(String[] args) {
		/*
		 * Neste programa, perguntaremos o valors dos dados de um produtos:
		 
		  - marca (String)
		  - descrição (String)
		  - categoria (String)
		  - ano de fabricação (Int)
		  - preço do produto (double)
		  - quantidade (double)
		  
		  e com esses dados, calcularemos
		  
		  - valor total (double)
		 
		 Escrever este programa, apresentando estes dados em uma caixa de mensagem como resposta. 
		 
		 */
		
		String marca = JOptionPane.showInputDialog("Informe a marca");
		String descricao = JOptionPane.showInputDialog("Informe a descrição");
		String categoria = JOptionPane.showInputDialog("Informe a categoria");
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação:"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço:"));
		double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade"));
		
		double total = preco * quantidade; 
	
		
		// Gerando a resposta
		
		String resposta = "Marca: " + marca + "\nDescrição: " + descricao + 
				"\nCategoria: " + categoria + "\nfabricação: " + ano +
				"\nPreço:" + preco + "\nQuantidade: " + quantidade + "\nValor Total: " + total;
		
		
		// Imprimindo a resposta 
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
	}
}
