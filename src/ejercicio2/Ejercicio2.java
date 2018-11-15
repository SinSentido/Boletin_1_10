package ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		float f = 5.5f;
		int x = 10, y = 20;
		double d = 2.5, b = 7.3;
		
		System.out.println(Math.abs(f)); //Devuelve el valor absoluto del parametro
		System.out.println(Math.addExact(x, y)); //Devuelve el resultado de la suma de los parametros.
		System.out.println(Math.ceil(d)); //Redondea hacia arriba el parametro introducido.
		System.out.println(Math.decrementExact(x)); //Reduce en uno el valor del parametro.
		System.out.println(Math.floor(d)); //Redondea hacia abajo el parametro.
	
		//Devuelve el cociente entre los 2 parametros redondeado hacia abajo.
		System.out.println(Math.floorDiv(y, x));
		System.out.println(Math.floorDiv(-y, -x));
		System.out.println(Math.floorDiv(y, -x));
		System.out.println(Math.floorDiv(-y, x));
		
		System.out.println(Math.incrementExact(x)); //Incrementa el parametro en 1
		System.out.println(Math.max(d, b)); //Devuelve el mayor de los parametros
		System.out.println(Math.multiplyExact(x,y)); //Multiplica los parametros
		System.out.println(Math.negateExact(x)); //Devuelve el parametro con signo negativo
		
	}
}
