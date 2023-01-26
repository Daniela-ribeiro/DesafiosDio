package Desafios;
/*
 * Desafio
Sua tia Gertrudes é uma leitora assídua. 
E ela gostaria de ter um aplicativo que 
dissesse para ela, de acordo com o número 
de páginas de um livro, quanto tempo ela 
levaria para ler lendo apenas 3 páginas 
por dia. Como você está aprendendo Java, 
você se disponibilizou para ajudá-la com 
esse desenvolvimento
 */

import java.util.Scanner;

public class DesafioLeitura {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double numeroPagina;
	double tempoLeitura;
	double paginaPorDia = 3;
	
	System.out.println("Quantas pagínas tem o livro que irá ler?");
	numeroPagina = leia.nextInt();
	
	tempoLeitura = numeroPagina / paginaPorDia;
	
	System.out.println("Você levará " + Math.ceil(tempoLeitura) + " dias para ler o livro completamente.");
	
	
}
}
