package ejercicio4;

public class Ejercicio4_Double {
	public static void main(String[] args) {
		Double d = 100.75, b = 50.20;
		String s = "501113";
		
		System.out.println(Double.compare(d, b)); //Compara si los parámetros son iguales o diferentes
		System.out.println(d.compareTo(b)); //Compara si el valor del parámetro es igual o diferente que el objeto
		System.out.println(d.doubleValue()); //Devuelve el valor del objeto como un double
		System.out.println(d.equals(b)); //Comprueba si el parámetros es igual que el objeto.
		System.out.println(d.floatValue()); //Devuelve el valor del objeto como un float
		System.out.println(d.intValue()); //Devuelve el valor del objeto como un int
		System.out.println(d.isInfinite()); //Comprueba si el valor del objeto es infinito o no
		System.out.println(Double.isInfinite(d)); //Comprueba si el valor del parámetro es infinito o no 
		System.out.println(d.isNaN()); //Comprueba si el objeto tiene un valor de NaN(Not a Number)
		System.out.println(Double.isNaN(d)); //Comprueba si el parámetro es NaN
		System.out.println(Double.max(d, b)); //Devuelve el mayor de los dos valores introducidos por parámetro
		System.out.println(Double.min(d, b)); //Devuelve el menor de los dos valores introducidos por parámetro
		System.out.println(Double.parseDouble(s)); //Transforma un string a double
		System.out.println(Double.sum(d, b)); //Suma los dos valores introducidos por parámetro
		System.out.println(Double.valueOf(d)); //Devuelve el valor del parámetro
		System.out.println(Double.valueOf(s)); //Devuelve el valor del parámetro string.
		
		
	}

}
