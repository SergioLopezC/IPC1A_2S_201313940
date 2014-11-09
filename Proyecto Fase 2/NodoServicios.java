
public class NodoServicios {
String codigoServicio;
String nombre;
String capacidad;
String precio;
String horaInicio;
String horaFin;
NodoServicios siguiente;

public NodoServicios(String codigoServicio, String nombre,String capacidad,String precio,String horaInicio,String horaFin){
	this.codigoServicio=codigoServicio;
	this.nombre=nombre;
	this.capacidad=capacidad;
	this.precio=precio;
	this.horaInicio=horaInicio;
	this.horaFin=horaFin;
	siguiente=null;
	
}
}
