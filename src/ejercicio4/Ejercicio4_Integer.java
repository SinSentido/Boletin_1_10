package ejercicio4;

public class Ejercicio4_Integer {
	public static void main(String[] args) {
		Integer x = 20, y = 10;
		String s = "2201";
		
		System.out.println(x.byteValue()); //Devuelve el valor expresado como byte
		System.out.println(Integer.compare(x, y)); //Compara cual de los números introducidos por parámetro es mayor.
		System.out.println(x.compareTo(y)); //Compara si el número introducio por parámetro es mayor o menor que el objeto.
		System.out.println(Integer.compareUnsigned(y, x)); //Compara cual de los números introducidos por parámetro es mayor ignorando los simbolos.
		System.out.println(Integer.divideUnsigned(x, y)); //Devuelve el cociente de los parametros ignorando los simbolos.
		System.out.println(x.doubleValue()); //Devuevle el valor del objeto expresado como double
		System.out.println(x.equals(y)); //Comprueba si el objeto es igual que el valor introducido como parametro
		System.out.println(x.intValue()); //Devuelve el valor del objeto
		System.out.println(Integer.max(x, y)); //Devuelve el mayor de los valores introducidos por parámetro.
		System.out.println(Integer.min(x, y)); //Devuelve el menor de los parametros introducidos por parámetro
		System.out.println(Integer.parseInt(s)); //Convierte el string a int
		System.out.println(Integer.sum(x, y)); //Suma los valores introducidos por parámetro
		System.out.println(Integer.valueOf(x)); //Devuelve el valor del parámetro introducido
		System.out.println(Integer.valueOf(s)); //Devuelve el valor del parámetro string introducido
		
	}
}
