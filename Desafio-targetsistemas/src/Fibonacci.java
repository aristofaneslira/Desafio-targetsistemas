
import java.util.Scanner;

public class Fibonacci {
	
	static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero a ser verificado: ");
		int num = sc.nextInt();
		boolean pertence = false;
		int teste = 0;
		
		
		
        for (int i = 0; i <= num; i++) {
        	teste = (int) Fibonacci.fibo(i);
        	if (teste > num) {
        		break;
			}
            if (teste == num) {
				pertence= true;
				break;
			}
        }
        
        if (pertence) {
        	System.out.println("o numero inserido pertence a sequencia");
        	
		} else {
			System.out.println("o numero inserido nao pertence a sequencia");
		}
	}

}
