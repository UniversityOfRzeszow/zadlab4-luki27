
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Prostopadloscian {
    
    public double a;
    public double b;
    public double c;
    public double pole;
    public double objetosc;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        
    public double obliczPole(double a, double b, double c) {
        this.pole =  2* (this.a*this.b) + 2*(this.a*this.c) + 2*(this.b*this.c);
        return pole;
    }
        
    public double obliczObjetosc(double a, double b, double c) {
        this.objetosc = this.a * this.b * this.c;
        return objetosc;
    }
    
    public void daneProspadloscian() {
        System.out.println("Prostopadloscian");
        System.out.println("pole: " + obliczPole(a, b, c));
        System.out.println("objetosc: " + obliczObjetosc(a, b, c));
    }
    
}
