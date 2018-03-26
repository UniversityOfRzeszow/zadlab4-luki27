
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Kolo {
    
    double r;
    
    public Kolo(double r) {
        this.r = r;
    }
        
    public double obliczPole(double r) {
        double pole;
        pole = 4 * Math.PI * this.r * this.r;
        return pole;
    }
    
    public double obliczObw(double r){
        double obw;
        obw=(int) (2*Math.PI*r); 
        return obw;
    }

    public void daneKolo() {
        System.out.println("Kolo");
        System.out.println("pole: " + obliczPole(this.r));
        System.out.println("obwod: " + obliczObw(this.r));
    }
    
}
