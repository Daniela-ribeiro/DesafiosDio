package Desafios;
/*
 * A prefeitura de uma cidade A instalou uma câmera para verificar quem estava 
 * acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é 
 * uma cidade extremamente movimentada e a prefeitura não deu conta de enviar 
 * as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.

O seu papel será o de criar um programa que verifique os dados recebidos da 
câmera e envie uma mensagem dizendo se o motorista será multado ou não.
 */

import java.util.Scanner;

public class DesafioMultas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int velocidade;
		
		System.out.println("Qual a velocidade do veículo?");
		velocidade = leia.nextInt();
		
		if (velocidade > 60) {
			System.out.println("você foi multado pois ultrapassou 60 km/h");
		}else {
			System.out.println("Sem multa!");
		}		
	}
}
