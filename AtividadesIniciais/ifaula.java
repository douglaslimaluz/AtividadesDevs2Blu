import java.util.Scanner;

public class ifaula {
	public static void main(String[] args) {
		int idade;
		idade = 15;

		Scanner tec = new Scanner(System.in);
		
		System.out.println("digite sua idade");
		
		idade = tec.nextInt();
		
		if (idade < 18) {
			System.out.println("menor de idade");
		} else if (idade > 18 && idade <= 40) {
			System.out.println("maior de idade");
		} else if (idade > 40 && idade < 60) {
			System.out.println("adulto medio");
			
		tec.close();
		}
	}
}