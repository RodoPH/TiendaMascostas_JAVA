import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Procesos arranca = new Procesos();
		String clave = "EquipoLPR";
		String pass = "";

		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Escribe la contraseña");
			if (clave.equals(pass) == false) {

				System.out.println("Contraseña inconrrecta");
			}
		else if (clave.equals(pass)== true){
		System.out.println("Contraseña correcta. Acceso permitido");
		arranca.inicio();
		
		

	}
		}
		
		
		JOptionPane.showMessageDialog(null,"Saliendo del programa","CERRANDO",1);

		
}
}