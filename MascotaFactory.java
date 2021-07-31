
public class MascotaFactory {
	public IMascota getMascota(String animalType) {
        
        if(animalType == null){
             return null;
          }     
          if(animalType.equalsIgnoreCase("Perro")){
             return new Perro();
              
          } else if(animalType.equalsIgnoreCase("Gato")){
             return new Gato();
              
          } else if(animalType.equalsIgnoreCase("Tortuga")){
             return new Tortuga();
          }
           
          return null;
         
    }
}


