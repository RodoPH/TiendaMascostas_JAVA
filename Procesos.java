import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class Procesos {
	
	Cliente clien = new Cliente();
	MascotaFactory mFactory = new MascotaFactory();
	Tortuga tor1 = (Tortuga) mFactory.getMascota("Tortuga");
	Perro aniPer = (Perro) mFactory.getMascota("Perro");
	Mascota mas = new Mascota();

	public void inicio() {
		
		ArrayList<Mascota> mascotas = new ArrayList<>();
		for(Iterator<Mascota> iterator = mascotas.iterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		clien.setNombre(JOptionPane.showInputDialog(null, "�cu�l es su nombre?", "Datos Cliente", 1));
		clien.setTelefono(
				JOptionPane.showInputDialog(null, "Escribe tu n�mero de telefono, por favor", "Datos del Cliente", 1));
		clien.setDireccion(
				JOptionPane.showInputDialog(null, "Escribe tu direcci�n, por favor", "Datos del cliente", 1));
		clien.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu edad", "Datos del cliente", 1)));
		clien.comprar();
		clien.pagar();

		System.out.println("\nDatos del cliente");
		System.out.println("Nombre: " + clien.getNombre() + "\nEdad: " + clien.getEdad() + "\nTelefono: "+ clien.getTelefono() + "\nDirecci�n: " + clien.getDireccion());
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "�Cu�nas mascotas comprar�s?", "Informaci�n", 3));
		Mascota canM[] = new Mascota[num];

		if (num >= 1) {

			for (int i = 0; i < canM.length; i++) {

				Object[] listaMascotas = { "Perro", "Tortuga", "Le�n", "Pez" };

				Object elijeMascota = JOptionPane.showInputDialog(null, "�Qu� mascota quieres?", 
						"MASCOTA", 3, null,listaMascotas, listaMascotas[0]);
				if (elijeMascota == listaMascotas[0]) {
					aniPer.vacuna();
				}
				if (elijeMascota == listaMascotas[1]) {
					tor1.datosTortuga();
				}
				if (elijeMascota == listaMascotas[2]) {
				System.out.println("Has elejido un Le�n");
					mas.setEspecie("Le�n");
					mas.Alimentarse();
					int catLeon = 3;
					catLeon--;
					System.out.println("En la tienda nos quedan " +catLeon + " leones");
					}
				if (elijeMascota == listaMascotas[3]){
					Object[] listaPez ={"Beta", "Payaso","Globo"};
					
					Object elijePez = JOptionPane.showInputDialog(null,"�Qu� especie de pez quieres?",
							"Especie pez",1,null,listaPez,listaPez[0]);
						System.out.println("Excelente elecci�n, felicidades por tu nuevo pez " +elijePez);
					}
				}
			}
		clien.getNombre();
		clien.getEdad();
		clien.getDireccion();
		clien.getTelefono();
		
		
		
	}
}


