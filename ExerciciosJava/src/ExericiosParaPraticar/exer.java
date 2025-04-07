package ExericiosParaPraticar;

import java.util.Scanner;

public class exer {
	
	public static void main(String[] args) {
		
		/*2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
		 * Fazer um algoritmo que calcule e escreva:
			a. a maior e a menor altura do grupo;
			b. média de altura dos homens;
			c. o número de mulheres. */
		
	Scanner input = new Scanner(System.in);
	int sexo;
	int altura =0  ,maior_altura = 0, menor_altura = 0, quant_mulher = 0;
	
	
	/* System.out.println("digite o sexo Homem(H) ou Mulher(M): ");
	sexo = input.next();
	input.close();
	//System.out.println(sexo);*/
		
	
	
	for (int i = 0 ;i != 10;i++) {
		
		System.out.println("digite o sexo Homem(2) ou Mulher(1): ");
		sexo = input.nextInt();
		input.nextLine();
		//input.close();
		
		if(sexo == 1) {
			//a. a maior e a menor altura do grupo	
			// digite a altura
			System.out.println("digite a altura: ");
			altura = input.nextInt();
			//c. o número de mulheres.
			quant_mulher++;
			// definir maior_altura e menor_altura 
					if (altura > maior_altura) {
						maior_altura = altura;
						}
					 if (altura < menor_altura) {
						 menor_altura = altura;
						 }
		
		else if(sexo == 2) {
			System.out.println("macxho escrto");
		}
					
		else  {
			i--;
		}
					 
		// limpar o valor da altura para não acumular 		 
		altura = 0; 
			}
		
		
		System.out.println(quant_mulher);
	}
	}

}
