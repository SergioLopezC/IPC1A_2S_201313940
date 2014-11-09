
public class NodoRestaurantes {
String codigoRestaurante;
String nombre;
String especialidad;
String capacidad;
String ubicacion;
NodoRestaurantes siguiente;
public NodoRestaurantes(String codigoRestaurante,String nombre,String especialidad, String capacidad, String ubicacion){
	this.codigoRestaurante=codigoRestaurante;
	this.nombre=nombre;
	this.especialidad=especialidad;
	this.capacidad=capacidad;
	this.ubicacion=ubicacion;
	siguiente=null;
	
	
}
}
