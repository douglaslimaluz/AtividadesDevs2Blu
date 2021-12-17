package Cadastro;

public class Cadastroo {

	public static void main(String[] args) {
		// array de numero
		int [] codigo = new int [10];
		
		
		
		//array de String
		String[] nome = new String [] {"joão", "Douglas","Pedro","Carlos","Tiago","Camila","Ana","gabi","lucas",
				"samy"};
		
		
		//estabelece os codigos
		for (int i = 0; i <10; i++) {
			codigo [i] = i+1 ;
		}
		
		// saida de dados
			for (int i = 0; i <10; i++) {
				System.out.println(codigo[i] + " .... " +nome[i]);
				
				
			}
			
			
			
		}
		
		

	}


