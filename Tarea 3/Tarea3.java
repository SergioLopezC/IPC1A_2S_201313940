import java.util.Scanner; //importamos la clase Scanner
public class Tarea3 {
// Autor: carnet 201313940
	
	
	public static void main(String[] args) {
		Scanner entry=new Scanner(System.in);//creamos un objeto Scanner
		System.out.println("ingrese un numero entero");//indicador
		int numero=entry.nextInt();//ingreso del entero
		
			if (numero%2==0){//condicion que valida si el numero es par o impar
				
				System.out.println("el numero ingresado es par");//salida por pantalla
		}else{
				System.out.println("el numero ingresado es impar");//salida por pantalla
			}
		

	}//fin del main

}
