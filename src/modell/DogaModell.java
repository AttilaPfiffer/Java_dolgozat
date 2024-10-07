
package modell;

// Pfiffer Attila
import java.util.Scanner;


public class DogaModell {
    public static final Scanner sc = new Scanner(System.in);
    
    public DogaModell() {
        
    }
    
    public String nevBekeres() {
        System.out.println("Adja meg a nevét: ");
        String nev = sc.nextLine();
        return nev;
    }
    
    public int korBekeres() {
        System.out.println("Adja meg a korát: ");
        int kor = sc.nextInt();
        int szuletesnap = 0;
        if (kor == szuletesnap) {
            szuletesnap ++;
        }
        return kor;
    }
    
    public boolean tanult() {
        System.out.println("Tanult-e esetleg nyelvet? (True/False)");
        boolean tanult = sc.nextBoolean();
        if(tanult) {
            return true;
        } else {
            return false;
        }
    }
}
