package tema2boletin2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio2 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias

		Scanner all = new Scanner(System.in);

		//Meto las variable necesaria, que será un Int

		int dia;

		//Pido al usuario el dia

		System.out.println("Introduzca un número de día de la semana");

		//Lo que introduzca será su valor en numérico

		dia = all.nextInt();
		
		//Introduzco un switch; en caso de que el día sea 1, saldrá que es lunes.
		//Si es 2, martes, 3 es miércoles, si es 4, será jueves, 5 es viernes, 6 sábado y 7 domingo
		
		switch (dia) {
		
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
			break;
		case 3:
			System.out.println("Es miércoles");
			break;
		case 4:
			System.out.println("Es jueves");
			break;
		case 5:
			System.out.println("Es viernes");
			break;
		case 6:
			System.out.println("Es sábado");
			break;
		case 7:
			System.out.println("Es domingo");
			break;
		}
		
		//Cierro scanner
		
		all.close();
	}
}
