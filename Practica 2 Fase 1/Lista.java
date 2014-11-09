import java.util.Scanner;

/*practica No. 2
 * primera fase
 * manipulacion de metodos de una lista enlazada
 */

public class Lista{
	
	Scanner ingreso=new Scanner(System.in);
	Nodo inicio;
	
	public Lista(){//contructor de la clase
		inicio=null;
	}
	
	public void crearLista(){//metodo que crea una lista con un valor inicial
		
		if(inicio==null){
			System.out.print("ingrese un elemento con el que desea crear la lista:");
			int numero=ingreso.nextInt();
			inicio= new Nodo(numero, inicio);
		
		}
		
	}//fin del metodo crear lista
	
	public int tamanoLista(){//metodo que muestra el tamaño de la lista
		int cont=0;
		Nodo tmp=inicio;
		
		while(tmp !=null){
			cont++;
			tmp=tmp.siguiente;
			}
			return cont;
			
	}//fin del metodo tamanoLista
	
	public void insertarInicio(){//metodo para insertar un elemento al principio de la lista
		Nodo tmp=inicio;
		if(tmp==null){
			System.out.println("la lista esta vacia");
			
		}else{
			System.out.print("ingrese el nuevo elemento: ");
			int num=ingreso.nextInt();
			Nodo nuevo=new Nodo(num);
			nuevo.siguiente=tmp;
			inicio=nuevo;
			
			}
		
	}//fin del metodo insertaInicio
	
	public void insertarFin(){//metodo para insertar un elemento al final de la lista
		Nodo tmp=inicio;
		Nodo ultimo=null; 
		if(tmp==null){
			System.out.println("la lista esta vacia");}
		else{
			while(tmp!=null){
				ultimo=tmp;
				tmp=tmp.siguiente;}
			System.out.print("ingrese el nuevo elemento :");
			int num=ingreso.nextInt();
			ultimo.siguiente=new Nodo(num);
			}
	}//fin del metodo insertarFin
	
	public void mostrarLista(){//metodo que muestra todos los elemento que contienen la lista
		Nodo tmp;
		tmp=inicio;
		if(tmp==null){
			System.out.println("la lista esta vacia");
			
			}else{
			
				while(tmp!=null){
					System.out.println(tmp.elemento);
					tmp=tmp.siguiente;
				}
			}
	}//fin del metodo mostrarLista
	
	public void eliminarElemento(){//metodo para eliminar elementos de la lista
	
		Nodo tmp=inicio;
		Nodo anterior=null;
		if(tmp==null){
			System.out.println("la lista esta vacia");
		}else{
			System.out.print("Eliminar elemento: ");
			Scanner ingreso=new Scanner(System.in);
			int elemento=ingreso.nextInt();
			while(tmp!=null){
				if(tmp.elemento==elemento){
					if(anterior==null){
						tmp=tmp.siguiente;
						
					}else{
						anterior.siguiente=tmp.siguiente;
						System.out.println("elemento eliminado");
					}
				}
			}
		}
	}//fin del metodo eliminarElemento
	
	public void insertarEntre(){//metodo para inserta un nuevo elemento en medio de otros elementos de la lista
		Nodo tmp=inicio;
		Nodo tmp2=null;
		boolean estado=false;
		Scanner ingreso=new Scanner(System.in);
		if(tmp==null){
			System.out.println("la lista esta vacia");
			}
		else{
			System.out.print("Insertar un elemento despues de :");
			int numero=ingreso.nextInt();
			
			while(tmp!=null){
				if(numero==tmp.elemento){
					tmp2=tmp;
					estado=true;
					}
				tmp=tmp.siguiente;
				}
			if(estado==true){
				System.out.print("ingrese el nuevo elemento :");
				int num=ingreso.nextInt();
				Nodo nuevo=new Nodo(num);
				nuevo.siguiente=tmp2.siguiente;
				tmp2.siguiente=nuevo;
				
			}else{
				System.out.println("Elemento no Existe");
			}
		}
	}//fin del metodo insertarEntre
	
	public void buscarElemento(){//metodo para buscar elementos detro de la lista
		Nodo tmp=inicio;
		boolean estado=false;
		if(tmp==null){
			System.out.println("la lista esta vacia");
			}
		else{
			System.out.print("ingrese el valor que desea buscar :");
			int numero=ingreso.nextInt();
			
			while(tmp!=null){
				if(numero==tmp.elemento){
					System.out.println("el elemento :"+numero+" fue encontrado en la posicion :"+tmp);
					estado=true;
					}
				tmp=tmp.siguiente;
				}
			if(estado==false){
				System.out.println("el elemento :"+numero+" no existe");}}
	}//fin del metodo buscarElemento
	
}//fin de la clase Lista

