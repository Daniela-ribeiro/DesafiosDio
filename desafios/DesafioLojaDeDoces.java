package Desafios;

import java.util.Scanner;

/*
 * Desafio
Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. 
Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, 
principalmente as crianças que estão muito acostumadas com a tecnologia, 
poderiam colocar suas moedas e receber dois doces aleatórios. 
Cada 1 real irá render 2 doces aleatórios.
 */
public class DesafioLojaDeDoces {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int moeda;
		int doce;
		
		System.out.println("Quantas moedas deseja colocar?");
		moeda = leia.nextInt();
		
		doce = moeda * 2;
		
		System.out.println("Você pode retirar " + doce + " doces.");
		
	}

}
