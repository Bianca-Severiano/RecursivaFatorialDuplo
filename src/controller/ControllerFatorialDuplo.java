package controller;

public class ControllerFatorialDuplo {

	public ControllerFatorialDuplo() {
		super ();
	}

	public int Fatorial(int numero) {
		if (numero == 0) { // PARADA
			return 1;
		} else {
			int resultado = Fatorial((numero-1));			
			if (numero % 2 != 0) {
				return resultado * numero; 
			} else {
				return resultado;
			}
			
		}
	}
}

/*f(5) = f(4) -> 5 é ímpar logo retorna 3x5 = 15
 * f(4) = f(3) -> retorna 3 pois 4 é par 
 * f(3)= f(2) -> 3 é ímpar logo retorna 3x1 = 3
 * f(2) = f(1) -> retorna 1 pois 2 é par 
 * f(1) = f(0) -> 1 é impar logo retorna 1x1 = 1 
 * f(0) = 1 
 * */

