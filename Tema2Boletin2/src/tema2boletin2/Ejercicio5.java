package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio5 {
	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias, en este caso solo un string
		
		String carne;
		
		//Abro el scanner
		
		Scanner all = new Scanner(System.in);
		
		//Pido al usuario el carné

		System.out.println("Introduce el carné de conducir, se enseñará a que corresponde");
		
		//Guardo el valor
		
		carne = all.nextLine();
		
		//Switch para el carné
		
		switch(carne) {
			
		//Si puso E, carne será remolques, si es D, autobuses, de C1 a C5, camiones, A será motocicletas, B1 o B2
		//es automóviles, y en otro caso carne tomará el valor "no".
				
		case "E":
		carne = "remolques";
		break;
		case "D":
		carne = "autobuses";
		case "C1":
		carne = "camiones";
		break;
		case "C2":
		carne = "camiones";
		break;
		case "C3":
		carne = "camiones";
		break;
		case "C4":
		carne = "camiones";
		break;
		case "C5":
		carne = "camiones";
		break;
		case "A":
		carne = "motocicletas";
		break;
		case "B1":
		carne = "automóviles";
		break;
		case "B2":
		carne = "automóviles";
		break;
		default:
		carne = "no";
		break;
		}
		
		//Si carne es "no", muestro categoría no contemplada al usuario, en caso contrario mostrará la categoría
		
		if (carne == "no") {
			System.out.println("Categoría no contemplada");
			
		}
		else {
			System.out.println("La categoría de ese carné es " + carne);
		}
		//Cierro scanner
		
				all.close();
	}
}
