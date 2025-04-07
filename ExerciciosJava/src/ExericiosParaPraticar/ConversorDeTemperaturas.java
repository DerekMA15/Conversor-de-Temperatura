package ExericiosParaPraticar;

import java.util.Scanner;
public class ConversorDeTemperaturas {
	
	public static void main(String[] args) {
		
	double C, F, Re, Ra, K ; 	
	Scanner  input = new Scanner(System.in);
	/*1. Escreva um programa que, com base em uma temperatura em graus celsius, 
	 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
	 * seguindo as fórmulas: 
	 * F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
	 */
	
	System.out.println("Digite a temperatura em Graus Celsius: ");
	C = input.nextFloat();
	input.close();

	// apenas para mexer um pouco com constantes "Final" 
	final double x = 1.8;
	final int y = 32; 
	F = C * x + y; 
	K = C * 273.15;  
	Re = C * 0.8; 
	Ra = F + 459.67;
	
	
	System.out.println("Temperatura em graus Celsius:"+C+"\nTemperatura em Fahrenheit: "+F+""
			+ "\nTemperatura em Kelvin: "+K+"\nTemperatura em Réaumur: "+Re+"\nTemperatura em Rankine: "+Ra);
	
		/* 
		 forma feita pelo professor: a grande diferença é que eu usei o scanner para capturar qualquer valor(n olhei até terminar o codg)
	  java
package exercicios;
public class Temperatura {

	public static void main(String[] args) {
		        double C, K, F, Re, Ra;
		        C = 2.43;
		
		        F = C * 1.8 + 32;
		        K = C + 273.15;
		        Ra = C * 1.8 + 32 + 459.67;
		        Re = C * 0.8;
		
		        System.out.println("A temperatura em Fahrenheit é: " + F);
		        System.out.println("A temperatura em Kelvin é: " + K);
		        System.out.println("A temperatura em Reaumur é: " + Ra);
		        System.out.println("A temperatura em Rankine é: " + Re);
		    }
		}*/
		
		
	}

}
