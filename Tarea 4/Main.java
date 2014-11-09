import javax.swing.JFrame;

public class Main {
			
	public Main(){
				
	}
	//metodo main ejecuta la plicacion
	
	public static void main(String args[]){

		JFrame jframe=new JFrame();
		jframe.setTitle("CIRCULO QUE REBOTA");
		jframe.setSize(600, 600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Canvas can = new Canvas();
		jframe.add(can);
		jframe.setVisible(true);
		
			}//fin del metodo main
			
	}//fin de la clase Main

	


