package tipodedatos;

public class CalculosNumericos {

	public static void main(String[] args) {
		/**Imprime en consola el resultado de la raiz cuadrada de un numero */
		raizCuadrada(10);
		/**Redondea un numero de tipo double*/
		redondear(15.892);
		/**Potencia de dos numeros */
		potencia(2, 8);
	}
	
	public static void raizCuadrada(double numero) {
		double raiz=Math.sqrt(numero);
		System.out.println("El resultado de la raiz es: "+raiz);
	}
	
	public static void redondear(double numero) {
		long numeroRedondeado=Math.round(numero);
		System.out.println("El numero redondeado es: "+numeroRedondeado);
	}
	
	public static void potencia(double base, double exponete) {
		double resultado=Math.pow(base, exponete);
		System.out.println(base+" elevado a "+exponete+" es igual a: "+resultado);
	}

}
