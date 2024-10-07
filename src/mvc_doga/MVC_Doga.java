
package mvc_doga;

// Pfiffer Attila
import vezerlo.DogaVezerlo;
import modell.DogaModell;
import nezet.DogaNezet;
public class MVC_Doga {

    public static void main(String[] args) {
        
        DogaModell modell = new DogaModell();
        DogaNezet nezet = new DogaNezet();
        new DogaVezerlo(modell, nezet);
        
    }
    
}
