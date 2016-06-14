
public class Cliente implements AccionesCliente {
	private int edad;
	private String Nombre, telefono, Direccion;

	// Set y Get para el atributo EDAD
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	///////////////////////////////////////////

	// Set y Get para el atributo NOMBRE
	public void setNombre(String nom) {
		this.Nombre = nom;
	}

	public String getNombre() {
		return Nombre;
	}
	///////////////////////////////////////////////

	// Set y Get para el atributo TELEFONO
	public void setTelefono(String tel) {
		this.telefono = tel;
	}

	public String getTelefono() {
		return telefono;
	}
	////////////////////////////////////////////////

	// Set y Get para el atributo DIRECCIÓN

	public void setDireccion(String dir) {
		this.Direccion = dir;
	}

	public String getDireccion() {
		return Direccion;
	}

	//////////////////
	// Sobreescribiendo los métodos implementados
	@Override
	public void comprar() {
		System.out.println("El cliente puede comprar");

	}
	@Override
	public void pagar(){
		System.out.println("El cliente debe pagar lo comprado");
	}


		
	
}
