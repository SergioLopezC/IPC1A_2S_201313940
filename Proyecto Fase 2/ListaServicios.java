import javax.swing.JOptionPane;


public class ListaServicios {
	NodoServicios inicio=null;
	String actual_codigoServicio;
	String actual_nombre;
	String actual_capacidad;
	String actual_precio;
	String actual_horaInicio;
	String actual_horaFin;
	
	public ListaServicios(){
	
	}

	public void agregar(String codigoServicio,String nombre,String capacidad,String precio, String horaInicio,String horaFin){
	
		if (inicio==null){
				inicio=new NodoServicios(codigoServicio,nombre,capacidad,precio,horaInicio,horaFin);
		}else{
			NodoServicios tmp=inicio;
			inicio=new NodoServicios(codigoServicio,nombre,capacidad,precio,horaInicio,horaFin);
			inicio.siguiente=tmp;
		}
	}
	
	public boolean mostrar(){
		NodoServicios tmp=inicio;
		if(tmp==null){
			System.out.println("la lista esta vacia");
			return false;
		}else{
			while(tmp!=null){
				System.out.println(tmp.codigoServicio+" "+tmp.nombre+" "+tmp.capacidad+" "+tmp.precio+" "+tmp.horaInicio+" "+tmp.horaFin);
				tmp=tmp.siguiente;
			}
			return true;
		}
	}
	
	
	public boolean remover(String codigoServicio){
		NodoServicios tmp=inicio;
		NodoServicios anterior=null;
		if(tmp==null){
			System.out.println("la lista esta vacia");
		}else{
			while(tmp!=null){
				if(tmp.codigoServicio.equals(codigoServicio)){
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
		
		JOptionPane.showMessageDialog(null, "El servicio no ha sido establecido");
		return false;
	}
	
	public boolean buscar(String codigoServicio){
	
		NodoServicios tmp=inicio;
		while(tmp!=null){
			if(tmp.codigoServicio.equals(codigoServicio)){
			
				System.out.println(tmp.codigoServicio+" "+tmp.nombre+" "+tmp.capacidad+" "+tmp.precio+" "+tmp.horaInicio+" "+tmp.horaFin);
				actual_codigoServicio=tmp.codigoServicio;
				actual_nombre=tmp.nombre;
				actual_capacidad=tmp.capacidad;
				actual_precio=tmp.precio;
				actual_horaInicio=tmp.horaInicio;
				actual_horaFin=tmp.horaFin;
			return true;
			}else{
				tmp=tmp.siguiente;
			}
		}
	
		JOptionPane.showMessageDialog(null, "El servicio no se encuentra establecido");
	
		return false;
	}

	}
