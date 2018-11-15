package ejercicio1;

public class Ejercicio1 {
		public static void main(String[] args) {
			boolean b = true;
			int n = 10;
			char c = 'c';
			double d = 10.5;
			String totalString;
			
			//Convierte las variables a string y asigna su valor a un solo string.
			totalString = Boolean.toString(b) + Integer.toString(n)+ Character.toString(c) + Double.toString(d);
			
			System.out.println(totalString);
			
		}
}
