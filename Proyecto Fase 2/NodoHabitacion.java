
public class NodoHabitacion {
String numHabitacion;
String tipo;
String descripcion;
String precio;
String estado;
NodoHabitacion siguiente;
public NodoHabitacion(String numHabitacion,String tipo,String descripcion,String precio,String estado){
	this.numHabitacion=numHabitacion;
	this.tipo=tipo;
	this.descripcion=descripcion;
	this.precio=precio;
	this.estado=estado;
	siguiente=null;
}

}
