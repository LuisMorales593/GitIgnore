import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.until.ArrayList;
import javax.swing.Timer;
import javax.swing.ImagenIcon;




public class animacion extends implements ActionListener{

	private ArrayList<Imagen> sprites = new ArrayList<>();//imagenes
	private int spriteActual=0;
	private Timer timer;
	
	public AnimacionSprites() {
		for (int i=1;i<=4;i++) {
			ImagenIcon icon =new ImagenIcon(getClass().getResource("/sprite"+i+".png"));
			sprites.add(icon.getImagen);
			
			
			
		}
		timer =new Timer(20,this);
		
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
