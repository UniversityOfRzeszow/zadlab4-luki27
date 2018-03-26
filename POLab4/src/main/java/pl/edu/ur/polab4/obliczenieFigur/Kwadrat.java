
package pl.edu.ur.polab4.obliczenieFigur;

/**
 *
 * @author Luki
 */
public class Kwadrat {
    double a;
    double pole;
    double obw;

    public Kwadrat(double a){
        this.a = a;
    }
    public double polekwadratu(double a){
        pole=a*a;
        return pole;
    }
    
    public double obwod(double a){
        obw=4*a;
        return obw;
    }
    
    public void daneKwadrat(){
        System.out.println("Kwadrat:");
        System.out.println("pole: "+ obwod(a));
        System.out.println("obwod: "+ polekwadratu(a));
    }
}
