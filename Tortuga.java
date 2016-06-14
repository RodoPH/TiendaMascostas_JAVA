import javax.swing.*;
public class Tortuga extends Mascota{
	String nombre;
	int edad;

	public Tortuga(String nom, int ed){
		nombre = nom;
		edad = ed;
	}
	public void datosTortuga (){
		JOptionPane.showMessageDialog(null,"Su nombre es: " + nombre + " tiene: " + edad + " año.","Datos de la tortuga",1);
	}

}
