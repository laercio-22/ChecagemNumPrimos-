/*
 * Seguindo o teorema de Fermat, que o modulo de um
 * é igual ao modulo de um número primo elevado a 
 * outro número primo, com base nisso conseguimos
 * checar quais os números primos até o 1021.  
 *  
 */
public class ChecagemFermat {
	public static boolean ePrimo(double num) {
		if(num>=2) {
			if(num == 2) {
				return true;
			}	
			if((Math.pow(2, num-1))%num==1%num) {
				return true; 
			}
		}
		return false;
	}

}
