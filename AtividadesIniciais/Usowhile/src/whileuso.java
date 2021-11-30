import javax.swing.JOptionPane;

public class whileuso {

	public static void main(String[] args) {

				// Informar a qtde de notas , pedir as notas e calcular a média

				float nota =0, media = 0, somaNotas = 0;
				int qtdNotas, contaNotas;

				qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtde de notas"));

				contaNotas = 1;

				while (contaNotas <= qtdNotas) {
					nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota numero:" + contaNotas));
					contaNotas++;
		             media = media + (nota / qtdNotas);
		            
				}
				System.out.println("A média do aluno é : " + media);
			}

}
