package ArrayAula;

public class MeuArray {
	public static void main(String[] args) {
		
		// declarando o array
		int [] listarNumeros = new int [100];
		// entrada de dados
		for (int i = 0; i < 100; i++) {
			listarNumeros[i] = i;
			if(i == 8) {
				listarNumeros [i] = 99;
			}
		}
		// saida de dados
		for (int i = 0; i <100; i++) {
			if (listarNumeros[i] == 98){
				continue;
				
			}
			
			System.out.println(listarNumeros[i]);
			
		}
		
		//como saber o tamanho do meu array
		System.out.println("....O tamanho total do meu array é... " +listarNumeros.length);
		for (int numeros : listarNumeros) {
			System.out.println(numeros);
		}
	}
	

}
