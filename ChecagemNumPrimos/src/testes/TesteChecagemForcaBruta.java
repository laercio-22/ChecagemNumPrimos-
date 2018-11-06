package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import main.ChecagemForcaBruta;

@RunWith(Theories.class)
public class TesteChecagemForcaBruta {

	@DataPoints("v1")
	public static int[] primos() {
		return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
	}

	
	@Theory
	public void testarNumerosPrimos(@FromDataPoints("v1") int n) {	
		
		
		assertTrue(ChecagemForcaBruta.checar(n));
		
	}
	
	@DataPoints("v2")
	public static int[] naoprimos() {
		return new int[] {1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20};
	}
	
	@Theory
	public void testarNumerosNaoPrimos(@FromDataPoints("v2") int n) {	
		
		assertFalse(ChecagemForcaBruta.checar(n));
		
	}
	
	
	

}
