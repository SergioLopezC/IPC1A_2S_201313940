
public class NodoHotel {
String codigoHotel;
String nombreHotel;
String paisHotel;
String numHabitaciones;
NodoHotel siguiente;
Hotel hotel;
public NodoHotel(String codigoHotel,String nombreHotel, String paisHotel, String numHabitaciones) {
	hotel=new Hotel();
	this.codigoHotel=codigoHotel;
	this.nombreHotel = nombreHotel;
	this.paisHotel = paisHotel;
	this.numHabitaciones = numHabitaciones;
	siguiente = null;
}

}
