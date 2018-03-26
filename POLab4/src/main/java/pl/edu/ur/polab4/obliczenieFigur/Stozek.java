
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Stozek {
    
    double r;
    double l;
    double h;
    double pole;
    double objetosc;

        public Stozek(double r, double h, double l) {
            this.r = r;
            this.h = h;
            this.l = l;

        }
        
        public double obliczPole(double r, double l) {
            pole =  this.r*this.r*Math.PI + Math.PI*this.l*this.r;
            return pole;
        }
        
        public double obliczObjetosc(double h, double r) {
            objetosc = (1/3)*(Math.PI*this.r*this.r*this.h);
            return objetosc;
        }

        public void daneStozek() {
            System.out.println("Stozek");
            System.out.println("pole: " + obliczPole(r, l));
            System.out.println("objetosc: " + obliczObjetosc(h, r));
        }
    
}
