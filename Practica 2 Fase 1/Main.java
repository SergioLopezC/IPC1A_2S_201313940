import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner ingreso=new Scanner(System.in);
		Lista lista= new Lista();
		int opcion=0;
		System.out.println("\t\tPRIMERA FASE PRACTICA No, 2");
		System.out.println("MANIPULACION DE LOS PRINCIPALES METODOS DE UNA LISTA ENLAZADA");
		System.out.println();
		
		do{
			System.out.println("\t1. CREAR LISTA ");
			System.out.println("\t2. INSERTAR AL INICIO");
			System.out.println("\t3. INSERTAR AL FINAL");
			System.out.println("\t4. MOSTRAR TAMAÑO DE LA LISTA");
			System.out.println("\t5. INSERTAR ENTRE ELEMENTOS");
			System.out.println("\t6. MOSTRAR ELEMENTOS");
			System.out.println("\t7. ELIMINAR ELEMENTOS");
			System.out.println("\t8. BUSCAR ELEMENTOS");
			System.out.println("\t9. SALIR");
			System.out.print("ingrese una opcion :");
			opcion=ingreso.nextInt();
			
			switch(opcion){
				case 1: 
					lista.crearLista();
					break;
				case 2:
					lista.insertarInicio();
					break;
				
				case 3:
					lista.insertarFin();
					break;
				case 4:
					System.out.println("el tamaño de la lista es :"+lista.tamanoLista());
					break;
				case 5: 
					lista.insertarEntre();
					break;
				case 6:
					lista.mostrarLista();
					break;
				
	
				case 7: 
					lista.eliminarElemento();
					break;
				case 8: 
					lista.buscarElemento();
					break;
				
				}

			}while(opcion!=9);

		}
	}//fin de la clase Main