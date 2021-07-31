import java.util.ArrayList;
import java.util.Iterator;

public class Mascota implements Acciones, Iterable<Mascota> {

	private String especie;
	public ArrayList<Mascota> mascotas;
	
	@Override
	public Iterator<Mascota> iterator() {
		// TODO Auto-generated method stub
		return new MascotaIterator();
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
		System.out.println("Tu mascota es de la especie " + especie);
	}

	public String getEspecie() {
		return especie;
	}

	@Override
	public void Alimentarse() {
		System.out.println("El animal de especie " + getEspecie() + " está alimentandose");

	}
	
	@Override 
	public void Dormir(){
		System.out.println("El animal de especie " + getEspecie() + " está dumiendo");
		
	}
	
	@Override
	public void Caminar(){
		System.out.println("El animal de especie " + getEspecie() + " le gusta caminar");
	}

	
}
