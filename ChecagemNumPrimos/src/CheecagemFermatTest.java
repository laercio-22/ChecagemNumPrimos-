import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CheecagemFermatTest {
	
	Scanner ler = new Scanner(System.in);

	@Test
	void listarNumeros() {
		int j=0,k = 0;
		for(int i =0;i<10000;i++) {
			if(ChecagemFermat.ePrimo(i)) {
				j++;
				System.out.print(i +", ");
				k++;
				if(k%15==0) {
					System.out.println("\t \n");
				}
			}
			
		}
		System.out.println("\n \n São: "+j);
	}

	
	@Test
	void conferir() {
		System.out.println("\n Inform um número:");
		double num = ler.nextDouble();
		assertTrue(ChecagemFermat.ePrimo(num));
	}
}
