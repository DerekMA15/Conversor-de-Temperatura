package fundamentos;

public class variaveis {

	public static void main(String[] args) {
		
		//Tipo de variaveis primitivas 
		//começam com a primeira letra minuscula Ex.: char, boolean...
		int num = 10; 
		char letra = 'A';
		float pi = 3.1422143f; // sem o f ao final ele ira entender como double
		/*se voce adiconar um numero float com ponto flutuante "." 
		e nao colocar ao final o "f" o compilador vai interpretar como um double e
		vai dar erro*/
		double dez = 10.00d; // pode colocar com ou sem o "d" ao final, mas recomendo colocar.
		boolean certo = true; 
		
		//Tipo de variaveis Não Primitivas 
		//começam com a primeira letra maiuscula Ex.: Arrays, Class...
		String text = "slv fml"; 
		
		
	System.out.println(num);
	System.out.println(letra);
	System.out.println(pi);
	System.out.println(dez);
	System.out.println(certo);
	System.out.println(text);

	// conversao de um float para um int 
	float myfloat = 20.0f;
	int myint = (int) myfloat; 
	System.out.println("olha aq "+ myint);
	
	// conversao de um int para um float 
	int mynum = 20;
	float mychot= (float) mynum; 
	System.out.println("olha esse "+ mychot);
	
	//aprendi esse metodo mais pratico que n precisa incluir uma nova variavel e mudamos a ja existente
	int	a = 10;
	System.out.println((float) a + 50);
	
int A =1 ; 
int B = 3;
	System.out.println(A>=B);
	}

}
