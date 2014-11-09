



public class NodoCliente {
String dpi;
String nombre;
String sexo;
String telefono;
String nacionalidad;
NodoCliente siguiente;


public NodoCliente(String dpi,String nombre,String sexo, String telefono,String nacionalidad ){
	this.dpi=dpi;
	this.nombre=nombre;
	this.sexo=sexo;
	this.telefono=telefono;
	this.nacionalidad=nacionalidad;
	siguiente=null;
}

}
