import javax.swing.JOptionPane;


public class ListaHotel {
NodoHotel inicio=null;
String actual_codigoHotel;
String actual_nombreHotel;
String actual_paisHotel;
String actual_numHabitaciones;

public ListaHotel(){
	
}

public void agregar(String codigoHotel,String nombreHotel, String paisHotel, String numHabitaciones){
	
	if (inicio==null){
			inicio=new NodoHotel(codigoHotel,nombreHotel,  paisHotel, numHabitaciones);
			
	}else{
		NodoHotel tmp=inicio;
		inicio=new NodoHotel(codigoHotel,nombreHotel,  paisHotel, numHabitaciones);
		inicio.siguiente=tmp;
	}
}
public void mostrar(){
	NodoHotel tmp=inicio;
	if(tmp==null){
		System.out.println("la lista esta vacia");
		
	}else{
		while(tmp!=null){
			System.out.println(tmp.codigoHotel+" "+tmp.nombreHotel+" "+tmp.paisHotel+" "+ tmp.numHabitaciones+" ");
			System.out.println("INFORME HOSPEDAJES");
			System.out.println(tmp.hotel.hospedaje.listaHospedaje.mostrar());
			System.out.println("INFORME CLIENTES");
			System.out.println(tmp.hotel.hospedaje.clientes.listaClientes.mostrar());
			System.out.println("INFORME RESTAURANTES");
			System.out.println(tmp.hotel.hospedaje.res.listaRestaurantes.mostrar());
			System.out.println("INFORME HABITACIONES");
			System.out.println(tmp.hotel.hospedaje.habitaciones.listaHab.mostrar());
			System.out.println("INFORME PROMOCIONES");
			System.out.println(tmp.hotel.hospedaje.promos.listaPromos.mostrar());
			System.out.println("INFORME SERVICIOS");
			System.out.println(tmp.hotel.hospedaje.servicios.listaServicios.mostrar());
			
			tmp=tmp.siguiente;
		}
	}
}
public boolean remover(String codigoHotel){
	NodoHotel tmp=inicio;
	NodoHotel anterior=null;
	if(tmp==null){
		System.out.println("la lista esta vacia");
	}else{
		while(tmp!=null){
			if(tmp.codigoHotel.equals(codigoHotel)){
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
	JOptionPane.showMessageDialog(null, "el registro del hotel solicitado NO EXISTE");
	return false;
}
public boolean buscar(String codigoHotel){
	
	NodoHotel tmp=inicio;
	while(tmp!=null){
		if(tmp.codigoHotel.equals(codigoHotel)){
			System.out.println("DATOS PRINCIPALES");
			System.out.println(tmp.codigoHotel+" "+tmp.nombreHotel+" "+tmp.paisHotel+" "+ tmp.numHabitaciones);
			 actual_codigoHotel=tmp.codigoHotel;
			 actual_nombreHotel=tmp.nombreHotel;
			 actual_paisHotel=tmp.paisHotel;
			 actual_numHabitaciones=tmp.numHabitaciones;
		return true;
		}else{
			tmp=tmp.siguiente;
		}
	}
	
	JOptionPane.showMessageDialog(null, "el registro del hotel solicitado NO EXISTE");
	
	return false;
}

}
