package bucles;

import java.util.Scanner;

/**Leccion acerca del uso de bucles
 * @author @camaviga11
 * @since 27/09/2022
 * */
public class UsoDeBucles {

	public static void main(String[] args) {
		/**Objeto para la entrada de datos*/
		Scanner entradaDeDatos = new Scanner(System.in);
		//Adivina la contraseña
		//desbloquear(entradaDeDatos);
		//Adivina un numero
		//adivinaNumero(entradaDeDatos);
		//Inprime cadena
		imprimirNumeros();

	}
	
	/**No deja pasar hasta que no adivine la contraseña
	 * @author @camaviga11
	 * @param entradaDeDatos objeto para capturar entrada de consola
	 * @since 27/09/2022
	 * */
	public static void desbloquear(Scanner entradaDeDatos) {
		String contrasena="";
		while(contrasena.equals("1234")==false) {
			System.out.println("BLOQUEADO");
			System.out.print("CONTRASEÑA: ");
			contrasena = entradaDeDatos.nextLine();
		}
		System.out.println("DESBLOQUEADO");
	}
	
	/**Adivina un numero entre 0 y 100
	 * @author @camaviga11
	 * @param entradaDeDatos objeto para capturar entrada de consola
	 * @since 27/09/2022
	 * */
	public static void adivinaNumero(Scanner entradaDeDatos) {
		/**Guarda el numero de intentos empleados*/
		int intentos = 0;
		/**Guarda el numero ingresado por el usuario*/
		int numero=0;
		/**Numero aleatorio entre 0 y 100*/
		int aleatorio = (int)(Math.random()*100);
		
		do {
			System.out.print("Ingrese un numero: ");
			numero = entradaDeDatos.nextInt();
			if(numero>aleatorio) {
				System.out.println("El numero es menor");
			}else if(numero<aleatorio){
				System.out.println("El numero es mayor");
			}
			intentos++;
		}while(numero!=aleatorio);
		
		System.out.println("Has adivinado, el numero es: "+aleatorio);
		System.out.println("Numero de intentos: "+intentos);
		
	}
	
	/**Imprime los números básicos
	 * @author @camaviga11
	 * @since 29/09/2022
	 * */
	public static void imprimirNumeros() {
			System.out.println("Numeros del sistema decimal:");
			for(int i=0;i<=9;i++) {
				System.out.println(i);
			}
			System.out.println("Numeros pares:");
			for(int i=0;i<=9;i+=2) {
				System.out.println(i);
			}
			System.out.println("Numeros impares:");
			for(int i=1;i<=9;i+=2) {
				System.out.println(i);
			}
	}
	
}
