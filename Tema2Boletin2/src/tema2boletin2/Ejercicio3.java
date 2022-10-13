package tema2boletin2;

import java.util.*; //Importamos el java.util que necesitamos

public class Ejercicio3 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias, serán int los dos números introducidos por el usuario, 
		//las operaciones de suma, resta, multiplicación y división y un string para la letra que ponga el usuario.
		int num1;
		int num2;
		int suma;
		
		int resta;
		int multiplicacion;
		int division;
		String opt;
		
		//Pongo el scanner
		
		Scanner all = new Scanner(System.in);
		
		//Pido al usuario un número
		
		System.out.println("Introduce un número, se pedirá la operación a continuación");
		
		//Lo que ponga el usuario será su valor
		
		num1 = all.nextInt();
		
		//Pido al usuario otro número
		
		System.out.println("Introduce el otro número");
		
		//Lo que ponga el usuario será su valor
		
		num2 = all.nextInt();
		
		//Pido al usuario que ponga a,b,c o d
		
		System.out.println("Introduzca a para sumar, b para restar, c para multiplicar o d para dividir");	
		
		//Lo que ponga el usuario será su valor
		
		opt = all.next();
		
		// Switch incoming
		
		switch (opt) {
				
		//Si el usuario puso a, entonces se hará una suma, y se pedirá al usuario su suma.
		case "a":
			System.out.println("Introduzca la suma de esos dos números");
			suma = all.nextInt();
			//La variable suma guardará ese valor
			
			//Si la suma es correcta o incorrecta, se le avisará al usuario.
				
				if(num1 + num2 == suma){
					System.out.println("Es correcto, la suma es " + suma);
				}
				else
					System.out.println("Es incorrecto, la suma es " + (num1 + num2));
			break;
		//Si el usuario puso b, entonces se hará una resta, y se pedirá al usuario su resta.
				
		case "b":
				
			//Pido al usuario lo que cree que es su resta
				
			System.out.println("Introduzca la resta de esos dos números");
			resta = all.nextInt();
				
			//La variable resta guardará ese valor
				
			//Se avisará al usuario si es correcto
			
				if(num1 - num2 == resta){
					System.out.println("Es correcto, la resta es " + resta);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 - num2));
			break;
				
		//Si el usuario puso c, entonces se hará una multiplicación, y se pedirá al usuario su resultado.
				
		case "c":
			
			//Se pide al usuario el resultado de la operación
				
			System.out.println("Introduzca la resta de esos dos números");
				
			//La variable multiplicación guardará ese número
				
			multiplicacion = all.nextInt();
			
				//Se avisará al usuario si es correcto o incorrecto
				
				if(num1 * num2 == multiplicacion){
					System.out.println("Es correcto, la multiplicaciçon es " + multiplicacion);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 * num2));
			break;
				
		//Si el usuario puso d, se hará una división, pedirá al usuario lo que cree que será su resultado
				
		case "d":
				
			System.out.println("Introduzca la división de esos dos números");
				
			//La variable division guardará su valor
			
			division = all.nextInt();
			
			//Se avisará al usuario si es correcto o incorrecto
				
				if(num1 / num2 == division){
					System.out.println("Es correcto, la multiplicaciçon es " + division);
				}
				else
					System.out.println("Es incorrecto, la resta es " + (num1 / num2));
			break;
			
			//Si el usuario puso otra letra, se le avisará de que sólo puede introducir a,b,c o d
			
		default:
			System.out.println("Introduzca sólo a,b,c o d");
		}

	//Cierro scanner
		
				all.close();
	}
	
}
