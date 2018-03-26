
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Prostokat {

    double a;
    double b;
    double pole, obw;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = a;
    }
        
    public double obliczPole(double a, double b) {
        pole = this.a * this.b;
        return pole;
    }
    public double obliczObw(double a, double b) {
        obw = 2*this.a + 2*this.b;
        return obw;
    }
    public void daneProstokata() {
        System.out.println("Prostokat");
        System.out.println("pole: " + obliczPole(a, b));
        System.out.println("obwod: " + obliczObw(a, b));
    }

}
