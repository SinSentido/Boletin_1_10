package ejercicio4;

public class Ejercicio4_Character {
	public static void main(String[] args) {
		char c = 'a' , ch = 'b';
		Character c1 = 'r', c2 = 'R';
		
		System.out.println(c1.charValue()); //Devuelve el valor del objeto
		System.out.println(Character.compare(c, ch)); //Compara los caracteres introducidos por parametro
		System.out.println(c1.equals(c2)); //Compara si son iguales los caracteres introducidos por parámetro
		System.out.println(Character.isDigit(c)); //Comprueba si es digito o no
		System.out.println(Character.isLetter(ch)); //Comprueba si es letra o no
		System.out.println(Character.isLowerCase(ch)); //Comprueba si es una letra minúscula
		System.out.println(Character.isSpaceChar(c)); //Comprueba si es un espacio
		System.out.println(Character.isUpperCase(c)); //Comprueba si es una letra mayúscula
		System.out.println(Character.toLowerCase(c2)); //Pasa el caracter introducido por parametro a minúscula
		System.out.println(Character.toUpperCase(c1)); //Pasa el caracter introducido por parametro a mayúscula
		System.out.println(Character.valueOf(c)); //Devuelve el valor del parámetro
		
	}
}
