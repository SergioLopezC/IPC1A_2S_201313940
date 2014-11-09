
public class NodoPromos {
String codigoPromo;
String paisValides;
String precioPromo;
String diasPromo;
String diaI,mesI,anoI;
String diaF,mesF,anoF;
String serviciosPromo;
NodoPromos siguiente;

public NodoPromos(String codigoPromo, String paisValides, String precioPromo,
		String diasPromo, String diaI, String mesI, String anoI, String diaF,
		String mesF, String anoF,String serviciosPromo) {
	
	this.codigoPromo = codigoPromo;
	this.paisValides = paisValides;
	this.precioPromo = precioPromo;
	this.diasPromo = diasPromo;
	this.diaI = diaI;
	this.mesI = mesI;
	this.anoI = anoI;
	this.diaF = diaF;
	this.mesF = mesF;
	this.anoF = anoF;
	this.serviciosPromo=serviciosPromo;
	siguiente=null;
}

}