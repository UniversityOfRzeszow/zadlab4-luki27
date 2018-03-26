package pl.edu.ur.polab4;
import pl.edu.ur.polab4.obliczenieFigur.*;
import java.util.Scanner;
import wprowadzDane.Student;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO zad 4, 5
    
        Scanner wybor = new Scanner(System.in);
        System.out.println("wybierz zadanie(1-2)");
        
        int zadanie;
        zadanie = wybor.nextInt();
        
        switch (zadanie) {
            case 1: {
                int menu = 1;
                while (menu != 0) {
                    System.out.println("Menu:");
                    System.out.println("0.zakoncz");
                    System.out.println("1.kwadrat");
                    System.out.println("2.prostokat");
                    System.out.println("3.kolo");
                    System.out.println("4.szescian");
                    System.out.println("5.prostopadloscian");
                    System.out.println("6.kula");
                    System.out.println("7.stozek");
                    System.out.println("dla jakiej figury chcesz obliczyc pole?");
                    

                    menu = wybor.nextInt();
                    switch (menu) {

                        case 1: {
                            System.out.println("podaj bok kwadratu");
                            Kwadrat nr1 = new Kwadrat(wybor.nextInt());
                            nr1.daneKwadrat();
                            break;
                        }
                        case 2: {
                            System.out.println("podaj boki prostokata");
                            Prostokat nr2 = new Prostokat(wybor.nextInt(), wybor.nextInt());
                            nr2.daneProstokata();
                            break;
                        }
                        case 3: {
                            System.out.println("podaj promier kola");
                            Kolo nr3 = new Kolo(wybor.nextInt());
                            nr3.daneKolo();
                            break;
                        }
                        case 4: {
                            System.out.println("podaj bok szescianu");
                            Szescian nr4 = new Szescian(wybor.nextInt());
                            nr4.daneSzescian();
                            break;
                        }
                        case 5: {
                            System.out.println("podaj bok prostopadloscianu");
                            Prostopadloscian nr5 = new Prostopadloscian(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            nr5.daneProspadloscian();
                            break;
                        }
                        case 6: {
                            System.out.println("podaj promien kuli");
                            Kula nr6 = new Kula(wybor.nextInt());
                            nr6.daneKula();
                            break;
                        }
                        case 7: {
                            System.out.println("podaj promien,tworzaca i wysokosc stozka");
                            Stozek nr7 = new Stozek(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            nr7.daneStozek();
                            break;
                        }
                        default:{
                            System.out.println("spróbuj jeszcze raz lub nacisnij 0");
                            break;
                        }
                    }

                }
                break;
            }
            case 2:{
                Student[] uczen = new Student[100];
                for (int i = 0; i < 100; i++) {
                    uczen[i]=new Student("imie"+i, "nazwisko"+i, i, i, "special"+i);
                  }
                
                int zad = 1;
                int j;
                
                while (zad != 0) {
                    System.out.println("co chcesz zrobic?");
                    System.out.println("1.wprowadzanie danych studenta pod wybrany index tablicy ");
                    System.out.println("2.edycje spod wybranego indeksu ");
                    System.out.println("3.usuniecie danych studenta");
                    System.out.println("4.wyswietlenie obiektu o danym indeksie");
                    System.out.println("5.wyswietlenie wszystkich obiektow");
                    System.out.println("6.wyswietlenie zakresu obiektów w podanym zakresie");
                    zad = wybor.nextInt();
                    switch (zad) {
                        case 1: {
                             System.out.println("podaj index dla ktorego wprowadzamy dane");
                            j = wybor.nextInt();
                            uczen[j].ustaw();
                            break;
                        }
                        case 2: {
                            System.out.println("podaj index dla ktorego edytujemy dane");
                            j=wybor.nextInt();
                            uczen[j].ustaw();
                            break;
                        }
                        case 3:{
                            System.out.println("Podaj indeks tablicy dla ktorego chcesz przypisac domyslne dane");
                            j=wybor.nextInt();
                            uczen[j].domyslny();
                            break;
                        }
                        case 4:{
                            System.out.println("dla jakiego studenta (index)");
                            j=wybor.nextInt();
                            uczen[j].info();
                            break;
                        }
                        case 5:{
                            for(int i=0;i<100;i++)
                            {
                                System.out.println("Student"+i);
                                uczen[i].info();
                            }
                            break;
                        }
                        case 6:{
                            System.out.println("podaj poczatek zakresu");
                            int x = wybor.nextInt();
                            System.out.println("podaj koniec zakresu");
                            int y = wybor.nextInt();
                            for (int i = x; i < y; i++) {
                                System.out.println("Student"+i);   
                                uczen[i].info();
                            }
                            break;
                        }
                        default: {
                            System.out.println("zle dzialanie");
                            break;
                        }
                    }
                }
                
            }
        }
      
    }
    
}
