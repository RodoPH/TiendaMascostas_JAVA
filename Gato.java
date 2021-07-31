import javax.swing.JOptionPane;

public class Gato implements IMascota{
	private String especie;
	private int edad;
	int vacuna;
	
	public void vacuna(){
		
	 vacuna = (JOptionPane.showConfirmDialog(null,"¿Está vacunado?","Vacuna del perro",JOptionPane.YES_NO_OPTION));
	if (vacuna == JOptionPane.YES_OPTION){
		System.out.println("El perro está vacunado. \n \" Despreocupate. \" ");
	}
	else {
		System.out.println("Debes vacunarlo. ");
	}
	
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
}
