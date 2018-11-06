package main;

public class ChecagemForcaBruta {
	
	public static boolean checar(int n) {
		int div = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) div++;
		}
		
		return div == 2;
	}
}
