package view;
import controller.ControllerFatorialDuplo;

public class PrincipalFatorialDuplo {

	public static void main(String[] args) {
		int valor = 5;
		
		ControllerFatorialDuplo cf = new ControllerFatorialDuplo();
		int res = cf.Fatorial(valor);
		
		System.out.println(res);

	}

}


 