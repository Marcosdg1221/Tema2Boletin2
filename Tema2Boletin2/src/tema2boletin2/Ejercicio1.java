package tema2boletin2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio1 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias

		Scanner all = new Scanner(System.in);

		//Meto las variable necesaria, que será un Int

		int nota;

		//Pido al usuario la nota

		System.out.println("Introduzca la nota que sacó el alumno");

		//Lo que introduzca será su valor

		nota = all.nextInt();
		
		switch (nota) {
		
		case 1,2,3,4:
			System.out.print("La nota es insuficiente");
		break;
		case 5:
			System.out.print("La nota es suficiente");
		break;
		case 6:
			System.out.print("La nota es bien");
		break;
		case 7,8:
			System.out.print("La nota es notable");
		break;
		case 9,10:
			System.out.print("La nota es sobresaliente");
		break;
		}
		
		//Cerramos scanner
		
	all.close();
	}
}