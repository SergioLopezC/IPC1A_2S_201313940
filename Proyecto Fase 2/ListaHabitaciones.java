import javax.swing.JOptionPane;


public class ListaHabitaciones {
	String actual_numHabitacion;
	String actual_tipo;
	String actual_descripcion;
	String actual_precio;
	String actual_estado;
NodoHabitacion inicio=null;
public ListaHabitaciones(){
	
}
public void agregar(String numHabitacion,String tipo,String descripcion,String precio, String estado){
	
	if (inicio==null){
			inicio=new NodoHabitacion( numHabitacion, tipo, descripcion, precio,estado);
	}else{
		NodoHabitacion tmp=inicio;
		inicio=new NodoHabitacion(numHabitacion, tipo, descripcion, precio,estado);
		inicio.siguiente=tmp;
	}
}
public boolean remover(String numHabitacion){
	NodoHabitacion tmp=inicio;
	NodoHabitacion anterior=null;
	if(tmp==null){
		System.out.println("la lista esta vacia");
	}else{
		while(tmp!=null){
			if(tmp.numHabitacion.equals(numHabitacion)){
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
	JOptionPane.showMessageDialog(null, "Habitacin no establecida");
	return false;
}

public boolean mostrar(){
	NodoHabitacion tmp=inicio;
	if(tmp==null){
		System.out.println("la lista esta vacia");
		return false;
	}else{
		while(tmp!=null){
			System.out.println(tmp.numHabitacion+" "+ tmp.tipo+" "+ tmp.descripcion+" "+ tmp.precio+" "+ tmp.estado);
			tmp=tmp.siguiente;
		}
		return true;
	}
}
public String buscar(String numHabitacion){
	
	NodoHabitacion tmp=inicio;
	while(tmp!=null){
		if(tmp.numHabitacion.equals(numHabitacion)){
			System.out.println(tmp.numHabitacion+" "+ tmp.tipo+" "+ tmp.descripcion+" "+ tmp.precio+" "+ tmp.estado);
			 actual_numHabitacion=tmp.numHabitacion;
			 actual_tipo=tmp.tipo;
			 actual_descripcion=tmp.descripcion;
			 actual_precio=tmp.precio;
			 actual_estado=tmp.estado;
		return "";
			
		}else{
			tmp=tmp.siguiente;
		}
	}
	
	JOptionPane.showMessageDialog(null, "La habitacion no se encuentra establecida, Necesita establecerla primero");
	
	return "";
}
}
