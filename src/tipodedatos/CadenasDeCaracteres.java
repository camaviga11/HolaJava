package tipodedatos;

public class CadenasDeCaracteres {

	public static void main(String[] args) {
		String nombre="Carlos Mario Villamizar Garavito";
		/**Imprime la cadena enviada*/
		procesarCadena(nombre);
		/**Cuenta los caracteres de la cadena*/
		contarCaracteres(nombre);
		/**Devuelve la letra especificada en el indice*/
		devueveLetra(7, nombre);
		/**Parte la cadena enviada segun los indices especificados*/
		partirCanena(0, 7, nombre);
		/**compara dos palabras*/
		comparaPalabra("hola", "Hola");
	}
	
	/**Imprime la cadena recibida
	 * @author @camaviga11
	 * @param cadena Cadena de caracteres de tipo {@link String}
	 * @since 23/09/2022
	 * */
	public static void procesarCadena(String cadena) {
		System.out.println("La cadena es: "+cadena);
	}
	/**Cuenta los caracteres de una cadena
	 * @author @camaviga11
	 * @param cadena cadena de caracteres de tipo {@link String}
	 * @since 23/09/2022
	 * */
	public static void contarCaracteres(String cadena) {
		System.out.println("La cadena tiene "+cadena.length()+" caracteres");
	}
	/**Devuelve una letra especificada en el indice
	 * @author @camaviga11
	 * @param indice Posicion de la cadena que quiere encontrar
	 * @param cadena Cadena de caracteres {@link Strin}
	 * @since 23/09/2022
	 * */
	public static void devueveLetra(int indice,String cadena) {
		if(indice>=0 && indice<cadena.length()) {
			System.out.println("La letra en la posicion "+indice+" es: "+cadena.charAt(indice));
		}else {
			System.out.println("No existe letra en la posicion especificada, el numero debe estar en el rango [0-"+(cadena.length()-1)+"]");
		}
	}
	/**Parte una cadena de caracteres desde un punto inicial hasta un punto final
	 * @author @camaviga11
	 * @param valorInicial Posicion inicial en la cadena
	 * @param valorFinal Posicion final en la cadena
	 * @since 23/09/2022
	 * */
	public static void partirCanena(int valorInicial,int valorFinal,String cadena) {
		if(valorInicial>=0 && valorFinal>=0 && valorInicial<cadena.length() && valorFinal<cadena.length() && valorInicial<valorFinal) {
			System.out.println("La subcadena es: "+cadena.substring(valorInicial, valorFinal+1));
		}else {
			System.out.println("Ha ocurrido un error, por favor revise los valores ingresados. Rango valido [0-"+(cadena.length()-1)+"]");
		}
	}
	/**Permite comparar dos cadenas de caracteres ignorando mayusculas y minusculas
	 * @author @camaviga11
	 * @param palabra1 Palabra que se desea comparar
	 * @param palabra2 Palabra que desea comparar
	 * @since 23/09/2022
	 * */
	public static void comparaPalabra(String palabra1,String palabra2) {
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras son diferentes");
		}
	}
	
}
