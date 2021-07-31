import javax.swing.*;

public class Tortuga implements IMascota{
	
	private String nombre;
	private String especie;
	private int edad;

	public Tortuga() {
		
	}
	
	public Tortuga(String nombre, String especie, int edad) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return this.especie;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
		
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}

	public Tortuga(String nom, int ed){
		nombre = nom;
		edad = ed;
	}
	public void datosTortuga (){
		JOptionPane.showMessageDialog(null,"Su nombre es: " + nombre + " tiene: " + edad + " año.","Datos de la tortuga",1);
	}

}

