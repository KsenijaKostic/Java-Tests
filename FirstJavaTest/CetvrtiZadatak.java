package javaTest;

import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {
        //NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
        //Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
        //1 evro je 0,0085 dinara 1200*0.0085
        //1 franak je 0,0093 dinara
        //1 dolar je 0,010 dinara
        //Ispise vrsiti iskljucivo iz main metode!


        Scanner sc = new Scanner(System.in);

        System.out.print("Molim vas unesite iznos u dinarima: ");
        double dinar = sc.nextDouble();

        System.out.print("Molim vas da unesete valutu u koju da konvertujemo dinare: ");
        String valuta = sc.next();

        double x = konverzija(dinar, valuta);

        if(x == 0){
            System.out.println("Niste uneli dobru valutu");
        } else {
            System.out.println(dinar + " dinara, kada se prebaci u " + valuta + " iznosi " + x + " u toj valuti.");
        }

    }
    public static double konverzija (double x, String y){  //dinar *
        double konverzijaa = 1;
            switch (y){
                case "evro":
                    konverzijaa = x * 0.0085;
                    break;
                case "franak":
                    konverzijaa = x * 0.0093;
                    break;
                case "dolar":
                    konverzijaa = x * 0.010;
                    break;
                default:
                    konverzijaa = x * 0;
            }
        return konverzijaa;
    }
}
