package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio5 {
	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias
		String carne;
		
		Scanner all = new Scanner(System.in);

		System.out.println("Introduce el carné de conducir, se enseñará a que corresponde");
		
		carne = all.nextLine();
		
		switch(carne) {
			
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
