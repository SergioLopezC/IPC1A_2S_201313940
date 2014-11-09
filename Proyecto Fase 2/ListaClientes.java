import javax.swing.JOptionPane;


public class ListaClientes {
 
	NodoCliente inicio=null;
	String actual_dpi;
	String actual_nombre;
	String actual_sexo;
	String actual_telefono;
	String actual_nacionalidad;
	
	public ListaClientes(){
	
	}

	public void agregar(String dpi,String nombre,String sexo, String telefono,String nacionalidad){
	
	if (inicio==null){
			inicio=new NodoCliente(dpi, nombre,sexo, telefono, nacionalidad);
	}else{
		NodoCliente tmp=inicio;
		inicio=new NodoCliente(dpi, nombre, sexo, telefono, nacionalidad);
		inicio.siguiente=tmp;
		}
	}
	
	public boolean mostrar(){	
		NodoCliente tmp=inicio;
		if(tmp==null){
			System.out.println("la lista esta vacia");
			return false;
		}else{
			while(tmp!=null){
				System.out.println(tmp.dpi+" "+tmp.nombre+" "+tmp.sexo+" "+tmp.telefono+" "+tmp.nacionalidad);
				tmp=tmp.siguiente;
			}
			return true;
		}
	}
	
	public boolean remover(String dpi){
		NodoCliente tmp=inicio;
		NodoCliente anterior=null;
		if(tmp==null){
			System.out.println("la lista esta vacia");
		}else{
			while(tmp!=null){
				if(tmp.dpi.equals(dpi)){
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
		JOptionPane.showMessageDialog(null, "el cliente no se encuentra registrado");
		return false;
	}

	public boolean buscar(String dpi){
	
		NodoCliente tmp=inicio;
		while(tmp!=null){
			if(tmp.dpi.equals(dpi)){
			
			System.out.println(tmp.dpi+" "+tmp.nombre+" "+tmp.sexo+" "+tmp.telefono+" "+tmp.nacionalidad);
			actual_dpi=tmp.dpi;
			actual_nombre=tmp.nombre;
			actual_sexo=tmp.sexo;
			actual_telefono=tmp.telefono;
			actual_nacionalidad=tmp.nacionalidad;
			return true;
			}else{
			tmp=tmp.siguiente;
			}
		}
	
		JOptionPane.showMessageDialog(null, "El cliente no se encuentra en la base de datos, Necesita registrarlo primero");
	
		return false;
		}

	}
