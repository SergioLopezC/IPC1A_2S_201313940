import javax.swing.JOptionPane;


public class ListaPromos {
NodoPromos inicio=null;
String actual_codigoPromo;
String actual_paisValides;
String actual_precioPromo;
String actual_diasPromo;
String actual_diaI;
String actual_mesI;
String actual_anoI;
String actual_diaF;
String actual_mesF;
String actual_anoF;
String actual_serviciosPromo;
public ListaPromos() {
	// TODO Auto-generated constructor stub
}

public void agregar(String codigoPromo,String paisValides,String precioPromo,String diasPromo,String diaI,String mesI,String anoI,
		String diaF,String mesF,String anoF,String serviciosPromo){
	
	if (inicio==null){
			inicio=new NodoPromos(codigoPromo, paisValides, precioPromo, diasPromo,  diaI,  mesI,  anoI, diaF, mesF,anoF,serviciosPromo);
	}else{
		NodoPromos tmp=inicio;
		inicio=new NodoPromos(codigoPromo, paisValides, precioPromo, diasPromo,  diaI,  mesI,  anoI, diaF, mesF,anoF,serviciosPromo);
		inicio.siguiente=tmp;
	}
}
public boolean mostrar(){
	NodoPromos tmp=inicio;
	if(tmp==null){
		System.out.println("la lista esta vacia");
		return false;
	}else{
		while(tmp!=null){
			System.out.println(tmp.codigoPromo+" "+tmp.paisValides+" "+tmp.precioPromo+" "+tmp.diasPromo+" "+tmp.diaI+" "+tmp.mesI+" "+ tmp.anoI+" "+tmp.diaF+" "+ tmp.mesF+" "+tmp.anoF+" "+tmp.serviciosPromo);
			tmp=tmp.siguiente;
		}
		return true;
	}
}
public boolean remover(String codigoPromo){
	NodoPromos tmp=inicio;
	NodoPromos anterior=null;
	if(tmp==null){
		System.out.println("la lista esta vacia");
	}else{
		while(tmp!=null){
			if(tmp.codigoPromo.equals(codigoPromo)){
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
	JOptionPane.showMessageDialog(null, "la promocion no existe");
	return false;
}
public boolean buscar(String codigoPromo){
	
	NodoPromos tmp=inicio;
	while(tmp!=null){
		if(tmp.codigoPromo.equals(codigoPromo)){
			
			System.out.println(tmp.codigoPromo+" "+tmp.paisValides+" "+tmp.precioPromo+" "+tmp.diasPromo+" "+tmp.diaI+" "+tmp.mesI+" "+ tmp.anoI+" "+tmp.diaF+" "+ tmp.mesF+" "+tmp.anoF+" "+tmp.serviciosPromo);
			
			 actual_codigoPromo=tmp.codigoPromo;
			actual_paisValides=tmp.paisValides;
			actual_precioPromo=tmp.precioPromo;
			actual_diasPromo=tmp.diasPromo;
			actual_diaI=tmp.diaI;
			actual_mesI=tmp.mesI;
			actual_anoI=tmp.anoI;
			actual_diaF=tmp.diaF;
			actual_mesF=tmp.mesF;
			actual_anoF=tmp.anoF;
			actual_serviciosPromo=tmp.serviciosPromo;
		return true;
		}else{
			tmp=tmp.siguiente;
		}
	}
	
	JOptionPane.showMessageDialog(null, "La promocion no existe");
	
	return false;
}
}
