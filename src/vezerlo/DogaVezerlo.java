
package vezerlo;

// Pfiffer Attila
import modell.DogaModell;
import nezet.DogaNezet;

public class DogaVezerlo {
    private DogaModell modell;
    private DogaNezet nezet;
    
    public DogaVezerlo(DogaModell modell, DogaNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        start();
        
    }
    
    public void start() {
        modell.nevBekeres();
        modell.korBekeres();
        modell.tanult();
    }

    

    
}
