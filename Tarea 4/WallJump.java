import java.awt.Color;
import java.awt.Graphics;

/*autor: Sergio Lopez
 * carnet: 201313940
 * introduccion a la programacion y computacion 1
 */

public class WallJump extends Circle {

	Color color;//variable de instancia
	
	public WallJump(){//constructor de la clase
		size = 100;
		acceleration = 0.7f;
		color = Color.RED;
	}
	
	public void detectEdge(){//metodo que cambia de direccion al circulo al detectar el borde
	
		if(positionX+size == 600)
		{
			acceleration = -0.5f;
			changeColor1();
			System.out.println("se detecto el borde derecho");
			
		}else if(positionX+size == 95)
			
		{
			acceleration=0.5f;
			changeColor2();
			System.out.println("se detecto el borde izquierdo");
	  }
		
	}//fin del metodo detectEdge
	
	
	public void appliedAcceleration(){//metodo que le aplica una aceleracion
		velocityX += acceleration;
		
	}//fin del metodo appliedAcceleration
	
	public void changeColor1()//metodo que cambia el color de la esfera al detectar el borde
	{
		color = Color.red;
	}//fin del metodo changeColor1
	
	public void changeColor2(){//metodo que cambia el color de la esfera al detectar el borde
		color=Color.blue;
	}//fin del metodo changecolor2
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}
	
	public void Update(){
		ActualizarPosicion();//metodo heredado de circulo
		appliedAcceleration();
		detectEdge();
		
	}//fin del metodo update
	
}
