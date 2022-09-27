package condicionales;

import java.util.Scanner;

/**Leccion acerca del uso de condicionales
 * @author @camaviga11
 * @since 27/09/2022
 * */
public class UsoDeCondicionales {

	public static void main(String[] args) {
		/** Objeto par ala entrada de datos */
		Scanner entradDeDatos = new Scanner(System.in);
		
		//Evaluar edad
		evaluarEdad(entradDeDatos);
		//Calcular areas
		calcularAreas(entradDeDatos);
		entradDeDatos.close();

	}
	
	/**Para estudiar el uso del if else
	 * @param entradaDeDatos objeto para capturar entrada de teclado
	 * @since 27/09/2022
	 * */
	public static void evaluarEdad(Scanner entradDeDatos) {
		/** Guarda la edad del usuario*/
		int edad=0;
		System.out.print("Ingresa tu edad: ");
		edad = entradDeDatos.nextInt();
		if(edad>=18 && edad<=40) {
			System.out.println("Es mayor de edad.");
		}else if(edad>40) {
			System.out.println("Es un adulto.");
		}else {
			System.out.println("Es menor de edad.");
		}
	}
	
	/**Permite calcular el area de diferentes figuras geometricas
	 * @param entradaDeDatos objeto para capturar entrada de teclado
	 * @since 27/09/2022
	 * */
	public static void calcularAreas(Scanner entradaDeDatos) {
		int eleccion = 0;
		System.out.print("Elije una opcion: \n1 -> Cuadrado \n2 -> Rectangulo \n3 -> Triangulo \n4 -> Circulo\n");
		eleccion = entradaDeDatos.nextInt();
		float dato1=0;
		float dato2=0;
		float dato3=0;
		
		switch(eleccion){
			case 1:
				System.out.print("Introduce el lado: ");
				dato1 = entradaDeDatos.nextFloat();
				dato3 = (float) Math.pow(dato1, 2);
				System.out.printf("El area del cuadrado es: %1.3f",dato3);
				break;
			case 2:
				System.out.print("Introduce el lado 1: ");
				dato1 = entradaDeDatos.nextFloat();
				System.out.print("Introduce el lado 2: ");
				dato2 = entradaDeDatos.nextFloat();
				dato3 = dato1 * dato2;
				System.out.printf("El area del rectangulo es: %1.3f",dato3);
				break;
			case 3:
				System.out.print("Ingrese la base del triangulo: ");
				dato1 = entradaDeDatos.nextFloat();
				System.out.print("Ingrese la altura del triangulo: ");
				dato2 = entradaDeDatos.nextFloat();
				dato3 = (dato1 * dato2)/2;
				System.out.printf("El area del cuadrado es: %1.3f",dato3);
				break;
			case 4:
				System.out.print("Ingrese el radio del circulo: ");
				dato1 = entradaDeDatos.nextFloat();
				dato3 = (float) Math.PI*(float)Math.pow(dato1, 2);
				System.out.printf("El area del circulo es: %1.3f",dato3);
				break;
			default:
				System.out.print("Ingrese un valor valido.");
				break;
		}
		
	}
}
