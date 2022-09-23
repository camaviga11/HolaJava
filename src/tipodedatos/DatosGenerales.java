package tipodedatos;

public class DatosGenerales {
	
	public static void main(String args[]) {
		varibles();
		constantes();
	}
	
	/** Son tipos de datos que pueden variar durante la ejecusion de un programa. */
	public static void varibles() {
		int numero1=0;
		int numero2=0;
		int resultado;
		numero1=11;
		numero2=33;
		resultado=numero1+numero2;
		System.out.print("El valor es: "+resultado);
	}
	
	/** Son datos que np pueden ser modificados durante la ejecusion de un programa. */
	public static void constantes() {
		
	}

}
