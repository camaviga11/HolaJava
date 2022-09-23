package tipodedatos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosPrimitivos {
	
	public static Logger logger = Logger.getLogger(DatosPrimitivos.class.getName());
	
	public static void main(String args[]) {
		
		
		
		System.out.println("DATOS PRIMITIVOS");
		
		enteros();
		flotantes();
		caracter();
		booleano();
		
	}
	
	/**Datos enteros en java en Java*/
	public static void enteros() {
		int numero1;
		int numero2=2;
		long numero3;
		long numero4=4L;
		short numero5;
		short numero6=6;
		byte numero7;
		byte numero8=8;
		
		numero1=1;
		numero3=3L;
		numero5=5;
		numero7=7;
		
		logger.log(Level.INFO,"Numero enteros ininicializados -> "
				+ "Numero1: "+numero1
				+" Numero2: "+numero2
				+" Numero3: "+numero3
				+" Numero4: "+numero4
				+" Numero5: "+numero5
				+" Numero6: "+numero6
				+" Numero7: "+numero7
				+" Numero8: "+numero8);
		
		
		/**
		 * long 8 bytes
		 * int 4 bytes 
		 * short 2 bytes
		 * byte 1 byte
		 * */
	}
	
	/**Datos con numeros decimales o coma flotante*/
	public static void flotantes() {
		System.out.println("Flotantes");
		
		/**
		 * float 4 bytes
		 * Double 8 bytes
		 * */
	}
	
	/**Datos para guardar caracteres unicode*/
	public static void caracter() {
		System.out.println("Caracter");
		/**
		 * Deben estar entre comillas simple 'a', 'b', 'c'
		 * char 2 bytes
		 * */
	}
	
	/**Datos enteros en java en Java*/
	public static void booleano() {
		System.out.println("Booleano");
		/**
		 * Pueden tener valores de null y true
		 * */
	}
	

}
