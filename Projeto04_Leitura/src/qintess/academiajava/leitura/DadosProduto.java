package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class DadosProduto {
	public static void main(String[] args) {
		/*
		 * Neste programa, perguntaremos o valors dos dados de um produtos:
		 
		  - marca (String)
		  - descri��o (String)
		  - categoria (String)
		  - ano de fabrica��o (Int)
		  - pre�o do produto (double)
		  - quantidade (double)
		  
		  e com esses dados, calcularemos
		  
		  - valor total (double)
		 
		 Escrever este programa, apresentando estes dados em uma caixa de mensagem como resposta. 
		 
		 */
		
		String marca = JOptionPane.showInputDialog("Informe a marca");
		String descricao = JOptionPane.showInputDialog("Informe a descri��o");
		String categoria = JOptionPane.showInputDialog("Informe a categoria");
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabrica��o:"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o:"));
		double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade"));
		
		double total = preco * quantidade; 
	
		
		// Gerando a resposta
		
		String resposta = "Marca: " + marca + "\nDescri��o: " + descricao + 
				"\nCategoria: " + categoria + "\nfabrica��o: " + ano +
				"\nPre�o:" + preco + "\nQuantidade: " + quantidade + "\nValor Total: " + total;
		
		
		// Imprimindo a resposta 
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
	}
}
