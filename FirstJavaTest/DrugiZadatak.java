package javaTest;

import java.util.Scanner;
//tacan
public class DrugiZadatak {
    public static void main(String[] args) {
        //Napisati program koji racuna potrosnju goriva
        //Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
        //Motor trosi 5 litara goriva na 100 kilometara, 0,05
        //Automobil trosi 7 litara na 100 kilometara, 0,07

        //Kombi trosi 11 litara na 100km, 0.11

        //Kamion trosi 15 litara na 100km 0.15
        //Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch



        Scanner sc = new Scanner(System.in);

        System.out.print("Molim vas unesite zeljenu distancu u kilometrima: ");
        double distanca = sc.nextDouble();

        System.out.print("Molim vas unesite zeljeni tip vozila: ");
        String vozilo = sc.next();

        double potrosnja;
        switch (vozilo){
            case "Motor":
                potrosnja = 0.05 * distanca;
                System.out.println(vozilo + " na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "Automobil":
                potrosnja = 0.07 * distanca;
                System.out.println(vozilo + " na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "Kombi":
                potrosnja = 0.11 * distanca;
                System.out.println(vozilo + " na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "kamion":
                potrosnja = 0.15 * distanca;
                System.out.println(vozilo + " na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }





    }
}
