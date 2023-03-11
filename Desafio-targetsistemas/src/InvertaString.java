import java.util.Scanner;

public class InvertaString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra a ser invertida: ");
		String palavra = sc.next();
		String inverso = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			inverso += palavra.charAt(i);
		}
		System.out.println(inverso);
		
	}

}
