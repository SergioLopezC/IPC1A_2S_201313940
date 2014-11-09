import javax.swing.JOptionPane;


public class ListaHospedaje {
NodoHospedaje inicio=null;
String actual_numHospedaje;
String actual_dpi;
String actual_nombre;
String actual_sexo;
String actual_telefono;
String actual_nacionalidad;
String actual_diaI;
String actual_mesI;
String actual_anoI;
String actual_diaF;
String actual_mesF;
String actual_anoF;
String actual_numHabitacion;
String actual_tipo;
String actual_descripcion;
String actual_precio;
String actual_estado;
String actual_numDias;
String actual_monto;



public ListaHospedaje() {
	// TODO Auto-generated constructor stub
}

public void agregar(String numHospedaje, String dpi, String nombre,
		String sexo, String telefono, String nacionalidad,
		String diaI, String mesI,String anoI,String diaF, String mesF, String anoF,
		String numHabitacion, String tipo, String descripcion,
		String precio, String estado,  String numDias,String monto){
	
	if (inicio==null){
			inicio=new NodoHospedaje( numHospedaje,  dpi, nombre,
					sexo, telefono, nacionalidad,
					diaI, mesI,anoI,
					diaF, mesF, anoF,
					 numHabitacion,  tipo,  descripcion,
					 precio,  estado,numDias,monto
					 
					 );
	}else{
		NodoHospedaje tmp=inicio;
		inicio=new NodoHospedaje(numHospedaje,  dpi, nombre,
				sexo, telefono, nacionalidad,
				diaI, mesI,anoI,
				diaF, mesF, anoF,
				 numHabitacion,  tipo,  descripcion,
				 precio,  estado,numDias,monto);
		inicio.siguiente=tmp;
	}
}
public boolean mostrar(){
	NodoHospedaje tmp=inicio;
	if(tmp==null){
		System.out.println("la lista esta vacia");
		return false;
	}else{
		while(tmp!=null){
			System.out.println(tmp.numHospedaje+" "+ tmp.dpi+" "+tmp.nombre+" "+
					tmp.sexo+" "+tmp.telefono+" "+tmp.nacionalidad+" "+
					 tmp.diaI+" "+ tmp.mesI+" "+
					 tmp.anoI+" "+ tmp.diaF+" "+ tmp.mesF+" "+ tmp.anoF+" "+
					 tmp.numHabitacion+" "+  tmp.tipo+" "+ tmp.descripcion+" "+
					 tmp.precio+" "+ tmp.estado+" "+tmp.numDias+" "+tmp.monto );
			tmp=tmp.siguiente;
		}
		return true;
	}
}

public boolean remover(String numHospedaje){
	NodoHospedaje tmp=inicio;
	NodoHospedaje anterior=null;
	if(tmp==null){
		System.out.println("la lista esta vacia");
	}else{
		while(tmp!=null){
			if(tmp.numHospedaje.equals(numHospedaje)){
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
	JOptionPane.showMessageDialog(null, "el registro no existe");
	return false;
}
public boolean buscar(String numHospedaje){
	
	NodoHospedaje tmp=inicio;
	while(tmp!=null){
		if(tmp.numHospedaje.equals(numHospedaje)){
			
			System.out.println(tmp.numHospedaje+" "+ tmp.dpi+" "+tmp.nombre+" "+
					tmp.sexo+" "+tmp.telefono+" "+tmp.nacionalidad+" "+
					 tmp.diaI+" "+ tmp.mesI+" "+
					 tmp.anoI+" "+ tmp.diaF+" "+ tmp.mesF+" "+ tmp.anoF+" "+
					 tmp.numHabitacion+" "+  tmp.tipo+" "+ tmp.descripcion+" "+
					 tmp.precio+" "+ tmp.estado+" "+tmp.numDias+" "+tmp.monto );
			actual_numHospedaje=tmp.numHospedaje;
			actual_dpi=tmp.dpi;
			actual_nombre=tmp.nombre;
			actual_sexo=tmp.sexo;
			actual_telefono=tmp.telefono;
			actual_nacionalidad=tmp.nacionalidad;
			actual_diaI=tmp.diaI;
			actual_mesI=tmp.mesI;
			actual_anoI=tmp.anoI;
			actual_diaF=tmp.diaF;
			actual_mesF=tmp.mesF;
			actual_anoF=tmp.anoF;
			actual_numHabitacion=tmp.numHabitacion;
			actual_tipo=tmp.tipo;
			actual_descripcion=tmp.descripcion;
			actual_precio=tmp.precio;
			 actual_estado=tmp.estado;
			actual_numDias=tmp.numDias;
			actual_monto=tmp.monto;
		return true;
		}else{
			tmp=tmp.siguiente;
		}
	}
	
	JOptionPane.showMessageDialog(null, "El hospedaje buscado no existe");
	
	return false;
}

}
