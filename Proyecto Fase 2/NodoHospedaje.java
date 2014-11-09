
public class NodoHospedaje {
	String numHospedaje;
	String dpi;
	String nombre;
	String sexo;
	String telefono;
	String nacionalidad;
	String diaI,mesI,anoI;
	String diaF,mesF,anoF;
	String numHabitacion;
	String tipo;
	String descripcion;
	String precio;
	String estado;
	String numDias;
	String monto;
	NodoHospedaje siguiente;
	public NodoHospedaje(String numHospedaje, String dpi, String nombre,
			String sexo, String telefono, String nacionalidad, String diaI,
			String mesI, String anoI, String diaF, String mesF, String anoF,
			String numHabitacion, String tipo, String descripcion,
			String precio, String estado, String numDias, String monto) {
		
		this.numHospedaje = numHospedaje;
		this.dpi = dpi;
		this.nombre = nombre;
		this.sexo = sexo;
		this.telefono = telefono;
		this.nacionalidad = nacionalidad;
		this.diaI = diaI;
		this.mesI = mesI;
		this.anoI = anoI;
		this.diaF = diaF;
		this.mesF = mesF;
		this.anoF = anoF;
		this.numHabitacion = numHabitacion;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estado = estado;
		this.numDias = numDias;
		this.monto = monto;
		this.siguiente = null;
	}
 
	
}
