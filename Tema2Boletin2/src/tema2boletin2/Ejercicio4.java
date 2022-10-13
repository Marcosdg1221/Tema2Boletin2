package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio4 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias
		String uno;
		String dos;
		int u;
		int d;
		int suma;
		
		Scanner all = new Scanner(System.in);
		
		System.out.println("Introduce el número que sacó en la primera jugada");
		
		uno = all.nextLine();
		
		System.out.println("Introduce el número que sacó en la segunda jugada");
		
		dos = all.nextLine();
		
		switch (uno) {
		
		case "uno":
		u = 1;
		break;
		case "dos":
		u = 2;
		case "tres":
		u = 3;
		break;
		case "cuatro":
		u = 4;
		break;
		case "cinco":
		u = 5;
		break;
		case "seis":
		u = 6;
		break;
		default:
		u = 0;
		break;
		}
	
		switch (dos) {
		
		case "uno":
		d = 1;
		break;
		case "dos":
		d = 2;
		case "tres":
		d = 3;
		break;
		case "cuatro":
		d = 4;
		break;
		case "cinco":
		d = 5;
		break;
		case "seis":
		d = 6;
		break;
		default:
		d = 0;
		break;
		}
		
		suma= d + u;
		
		System.out.println("La suma de las jugadas es; " + suma);
		
		//Cierro scanner
		
		all.close();
	}
}