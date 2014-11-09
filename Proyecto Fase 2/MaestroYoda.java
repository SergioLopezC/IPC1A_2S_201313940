import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MaestroYoda extends JFrame{//inicio de la clase que hereda sus atributos de JFrame
	 
	private static final long serialVersionUID = 1L;
	
	static String path;
	//String linea;
	int pLinea;
	int cont;
	
	//main encargado de ejecutar la aplicacion
	 public static void main(String arg[]) {
		MaestroYoda mYoda = new MaestroYoda();
		mYoda.abrirArchivo();
		mYoda.leerTxt(path);
	 }//fin del metodo main
	
	 public void abrirArchivo(){//metodo que muestra la ventana para buscar el archivo txt utilizado
		 JFileChooser sr=new JFileChooser();
		 sr.setDialogTitle("");
		 FileNameExtensionFilter filtro=new FileNameExtensionFilter("txt","txt");//filtro para texto.txt
		 sr.setFileFilter(filtro);
		 int rest=sr.showOpenDialog(this);
		 if(rest==JFileChooser.APPROVE_OPTION){
		    path= sr.getSelectedFile().getAbsolutePath();
		 }   
	}
	 
	public void leerTxt(String path){ //metodo para para leer y crear el archivo txt en la direccion especificada
		 String linea;
		 cont=0;
		 String tmp[]=null;//matriz temporal que guarda las palabras despues de cada separacion
		 FileWriter fichero = null;
         PrintWriter pW = null;
				try {	
				File archivo = new File(path);
				FileReader fr = new FileReader(archivo);
	            BufferedReader bufer = new BufferedReader(fr);
	            fichero=new FileWriter("C:\\Users\\Sergio Lopez\\Documents\\GitHub\\ExamenFinal_IPC1A\\Output_MaestroYoda2_201313940.txt");//direccion en la quw se creara el nuevo archivo txt
	            pW = new PrintWriter(fichero);
	            
	            while((linea = bufer.readLine())!= null){
	            	tmp=linea.split(" ");
	            	 if(cont==0){
	            		 pLinea= Integer.parseInt(linea);
	            	 }else{
	            		 pW.print("caso#"+cont+": ");
	            		 for(int i=tmp.length-1; i >= 0; i-- ){//devuelve las palabras en orden inverso de lo que fueron leidas
	            	           pW.print(tmp[i]+" ");  
	            	       } pW.println(" ");
	            	 } cont++;
	            	 
	            }
	            fr.close();
	            bufer.close();
	            fichero.close();
	            pW.close();
	            System.out.println("archivo correcto");
	        }catch(Exception e){ 
	           	System.exit(0);
	           	System.out.println("error en el archivo");
				}
	}
	
}//fin de la clase
