package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Szescian {
    double a;
    double pole;
    double objetosc;
        
    public Szescian(double a) {
        this.a = a;
    }
    
    public double obliczPole(double a) {
        this.pole =  6 * this.a * this.a;
        return pole;
    }
        
    public double obliczObjetosc(double a) {
        this.objetosc = this.a * this.a * this.a;
        return objetosc;
    }

    public void daneSzescian() {
        System.out.println("Szczescian");
        System.out.println("pole: " + obliczPole(a));
        System.out.println("objetosc: " + obliczObjetosc(a));
    }
}
