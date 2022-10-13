package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio4 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias, Strings para la tirada uno y dos, e Int para la suma y el uno o dos.
		String uno;
		String dos;
		int u;
		int d;
		int suma;
		
		//Pongo scanner
		
		Scanner all = new Scanner(System.in);
		
		//Pido al usuario lo que sacó en la primera jugada
		
		System.out.println("Introduce el número que sacó en la primera jugada");
		
		//Guardo el valor en la varible uno
		
		uno = all.nextLine();
		
		//Pido al usuario lo que sacó en la segunda jugada
		
		System.out.println("Introduce el número que sacó en la segunda jugada");
		
		//Guardo el valor en la varible dos
		
		dos = all.nextLine();
		
		//Swicth para la primera jugada o la variable uno
		
		switch (uno) {
		
		//Se pondrá en forma numérica el número que dijo el usuario en forma de letras del uno al seis,
		//Si pone otro número, saldrá 0.
				
		case "uno":
		u = 1;
		break;
		case "dos":
		u = 2;
		break;
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
	
		//Swicth para la segunda jugada o la variable dos
		switch (dos) {
				
		//Se pondrá en forma numérica el número que dijo el usuario en forma de letras del uno al seis,
		//Si pone otro número, saldrá 0.
		
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
		
		//La variable suma será la suma del valor de la primera jugada y la segunda
		
		suma= d + u;
		
		//Muestro el resultado
		
		System.out.println("La suma de las jugadas es; " + suma);
		
		//Cierro scanner
		
		all.close();
	}
}
