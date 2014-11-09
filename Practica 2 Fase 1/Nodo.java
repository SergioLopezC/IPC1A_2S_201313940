public class Nodo{
	int elemento;
	Nodo siguiente;

	public Nodo(int elemento){//contructor de la clase con un parametro
		this.elemento=elemento;
		siguiente=null; 
	}

	public Nodo(int elemento, Nodo nodo){//constructor de la clase con dos parametos
		this.elemento=elemento;
		siguiente=nodo;
	}
}//fin de la clase nodo
