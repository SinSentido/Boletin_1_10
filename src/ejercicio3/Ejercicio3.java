package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		char c = 'u', c2 = 'a';
		String s = "Hola", s2 = "mundo", s3 = "nuevo";
		
		System.out.println(s.charAt(0)); //Devulve el caracter en la posicion indicada en el parametro
		System.out.println(s2.length()); //Devuelve la longitud del string
		System.out.println(s.equals(s2)); //Compara las cadenas y devuelve un valor booleano
		System.out.println(s.equals(s2) && s2.equals(s3)); //Compara las cadenas y devuelve un valor booleano
		System.out.println(s2.codePointAt(2)); //Devuelve el valor numérico del caracter en la posición indicada en el paramtro
		System.out.println(s.compareTo(s2)); //Compara el valor numérico de las cadenas
		System.out.println(s.compareToIgnoreCase(s2)); //Compara el valor numérico de las cadenas ignorando mayúsculas o minúsculas 
		System.out.println(s.concat(s2)); //Concatena las cadenas
		System.out.println(s.endsWith(s2)); //Comprueba si la cadena acaba con el sufijo introducido
		System.out.println(s.equals(s2)); //Compara cadenas
		System.out.println(s.equalsIgnoreCase(s2)); //Compara cadenas ignarando mayúsculas o minúsculas
		System.out.println(s.indexOf(c2)); //Devuelve la posicion del caracter introducido como parametro
		System.out.println(s2.indexOf(c, 2)); //Devuelve la posicion del caracter introducido como parametro desde la posicion introducida como parametro
		System.out.println(s.replace('o', 'u')); //Sustituye un caracter por otro dentro de la cadena
		System.out.println(s.toUpperCase()); //Pasa la cadena a mayusculas
		System.out.println(s.trim()); //Devuelve el valor del string sin espacios en blanco
		
	}

}
