
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Kula {
    
    double r;
    double pole;
    double v;

    public Kula(double r) {
        this.r = r;
    }
       
    public double obliczPole(double r) {
        pole =  4*Math.PI*this.r*this.r;
        return pole;
    }
        
    public double obliczObjetosc(double r) {
        v = (4/3)*Math.PI*this.r*this.r*this.r;
        return v;
    }

    public void daneKula() {
        System.out.println("KUla");
        System.out.println("pole: " + obliczPole(r));
        System.out.println("objetosc: " + obliczObjetosc(r));
    }
    
}
