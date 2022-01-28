package javaTest;

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        //Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0


        Scanner sc = new Scanner(System.in);
        System.out.println("U ovom programu unesite koliko god zelite brojeva, ali kada zelite da prestane unesite 0. Hvala");
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        int suma = broj;
        System.out.println("Trenutni zbir je  je " + suma);

        while(broj > 0){
            System.out.print("Unesite ponovo broj: ");
            broj = sc.nextInt();
            if (broj > 0){
                suma = suma + broj;
                System.out.println("Trenutni zbir je  je " + suma);
            } else {
                System.out.println("Uneli ste 0. Kraj programa.");
            }
        }


    }
}
