/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

// Pfiffer Attila

public class DogaNezet {
    private String nev;
    private int kor;
    private boolean tanult;
    
    public DogaNezet(String nev, int kor, boolean tanult) {
        this.nev = nev;
        this.kor = kor;
        this.tanult = tanult;
    }

    public DogaNezet(String nev, int kor) {
        this(nev, kor, false);
    }

    public DogaNezet() {
    
    }
    
    
    public String getNev() {
        return nev;
    }
    
    public int getKor() {
        return kor;
    }
    
    public boolean getTanult() {
        return tanult;
    }
    
}
