import javax.swing.JOptionPane;

public class projdesafio {
	public static void main(String[] args) {
// desenvolva programa em que o usuario informe ate 10 numeros,no final deverá informar qual é o nemor e o maior numero
       int numero ;
       int menor =0, maior=0;
       
      for ( int i =0; i <10; i++ ) {
    	
    		  numero = Integer.parseInt(JOptionPane.showInputDialog(" digite o numero "));
    		  
    		if (i == 0) {
    			menor = numero;
    			maior=numero;
    		}else {
    			if (numero > maior) {
    				maior = numero ;
    			}
    			if (numero < menor) {
    				menor = numero;
    			}
    		}
	}
      
      System.out.println("Menor"+maior);
      System.out.println("menor"+menor);
}
}