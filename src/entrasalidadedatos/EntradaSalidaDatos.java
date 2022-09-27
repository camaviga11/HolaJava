package entrasalidadedatos;

import java.util.Scanner;

/**Leccion acerca de la entrada y salida de datos por consola
 * @author @camaviga11
 * @since 27/09/2022
 * */
public class EntradaSalidaDatos {

	public static void main(String[] args) {
		/** Guarda el nombre del usuario */
		String nombre="";
		/** Guarda edad del usuario */
		int edad=0;
		/** Guarda el resultado de la raiz cuadrada de la edad */
		double raizEdad = 0;
		/** Objero para la entrada de datos por consola */
		Scanner entradaDeDatos = new Scanner(System.in);
		
		//Salida de datos por consola
		System.out.print("Por favor ingrese su nombre: ");
		//entrada de datos por consola
		nombre = entradaDeDatos.nextLine();
		System.out.println("Bienvenido "+nombre+"!!!");
		System.out.print("Ingresa tu edad por favor: ");
		edad = entradaDeDatos.nextInt();
		entradaDeDatos.close();
		
		if(edad>=18) {
			System.out.println("Usted es mayor de edad.");
		}else {
			System.out.println("Usted es menor de edad.");
		}
		
		//Raiz cuadara de la edad.
		raizEdad = Math.sqrt(edad);
		System.out.printf("La raiz cuadrada de su esdad es: %1.5f",raizEdad);
	}
}
