package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio3 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias
		int num1;
		int num2;
		int suma;
		
		int resta;
		int multiplicacion;
		int division;
		String opt;
		
		Scanner all = new Scanner(System.in);
		
		
		System.out.println("Introduce un número, se pedirá la operación a continuación");
		
		num1 = all.nextInt();
		
		System.out.println("Introduce el otro número");
		
		num2 = all.nextInt();
		
		System.out.println("Introduzca a para sumar, b para restar, c para multiplicar o d para dividir");	
		
		opt = all.next();
		

		switch (opt) {
		case "a":
			System.out.println("Introduzca la suma de esos dos números");
			suma = all.nextInt();
			
				if(num1 + num2 == suma){
					System.out.println("Es correcto, la suma es " + suma);
				}
				else
					System.out.println("Es incorrecto, la suma es " + (num1 + num2));
			break;
		case "b":
			System.out.println("Introduzca la resta de esos dos números");
			resta = all.nextInt();
			
				if(num1 - num2 == resta){
					System.out.println("Es correcto, la resta es " + resta);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 - num2));
			break;
		case "c":
			System.out.println("Introduzca la resta de esos dos números");
			multiplicacion = all.nextInt();
			
				if(num1 * num2 == multiplicacion){
					System.out.println("Es correcto, la multiplicaciçon es " + multiplicacion);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 * num2));
			break;
		case "d":
			System.out.println("Introduzca la división de esos dos números");
			division = all.nextInt();
			
				if(num1 / num2 == division){
					System.out.println("Es correcto, la multiplicaciçon es " + division);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 / num2));
			break;
		default:
			System.out.println("Introduzca sólo a,b,c o d");
		}

	//Cierro scanner
		
				all.close();
	}
	
}
