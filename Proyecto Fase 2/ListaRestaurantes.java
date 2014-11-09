import javax.swing.JOptionPane;


public class ListaRestaurantes {
NodoRestaurantes inicio=null;
String actual_codigoRestaurante;
String actual_nombre;
String actual_especialidad;
String actual_capacidad;
String actual_ubicacion;

public ListaRestaurantes(){
	
}
public void agregar(String codigoRestaurante,String nombre,String especialidad, String capacidad, String ubicacion){
	
	if (inicio==null){
			inicio=new NodoRestaurantes( codigoRestaurante,nombre, especialidad, capacidad, ubicacion);
	}else{
		NodoRestaurantes tmp=inicio;
		inicio=new NodoRestaurantes(codigoRestaurante,nombre, especialidad, capacidad, ubicacion);
		inicio.siguiente=tmp;
	}
}
public boolean mostrar(){
	NodoRestaurantes tmp=inicio;
	if(tmp==null){
		System.out.println("la lista esta vacia");
		return false;
	}else{
		while(tmp!=null){
			System.out.println(tmp.codigoRestaurante+" "+tmp.nombre+" "+ tmp.especialidad+" "+ tmp.capacidad+" "+ tmp.ubicacion);//solo para prueba
			tmp=tmp.siguiente;
		}
		return true;
	}
}
public boolean remover(String codigoRestaurante){
	NodoRestaurantes tmp=inicio;
	NodoRestaurantes anterior=null;
	if(tmp==null){
		System.out.println("la lista esta vacia");
	}else{
		while(tmp!=null){
			if(tmp.codigoRestaurante.equals(codigoRestaurante)){
				if(anterior==null)//en el caso que el elemento a eliminar este en el primer nodo
					inicio=inicio.siguiente;
					else
					anterior.siguiente=tmp.siguiente;//el nodo anterior al que se desea eliminar pasa a ser el nodo despues del elemento a eliminar
				JOptionPane.showMessageDialog(null, "el registro se ha eliminado con exito");	
				return 	true;		
			}else{
			anterior=tmp;
			tmp=tmp.siguiente;
		}
   
	}
}
	JOptionPane.showMessageDialog(null, "el restaurante no esta registrado");
	return false;
}
public boolean buscar(String codigoRestaurante){
	
	NodoRestaurantes tmp=inicio;
	while(tmp!=null){
		if(tmp.codigoRestaurante.equals(codigoRestaurante)){
			System.out.println(tmp.codigoRestaurante+" "+ tmp.nombre+" "+ tmp.especialidad+" "+ tmp.capacidad+" "+ tmp.ubicacion);
			actual_codigoRestaurante=tmp.codigoRestaurante;
			actual_nombre=tmp.nombre;
			actual_especialidad=tmp.especialidad;
			actual_capacidad=tmp.capacidad;
			actual_ubicacion=tmp.ubicacion;
		return true;
		}else{
			tmp=tmp.siguiente;
		}
	}
	
	JOptionPane.showMessageDialog(null, "El restaurante no esta registrado, Necesita registrarlo primero");
	return false;
}
}
