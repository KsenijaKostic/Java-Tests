package javaTest;

import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        //NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
        //Proizvoljno napravite niz od 10 brojeva
        //korisnik unosi broj koji zeli da prebroji u nizu
        //niz je tipa int



        Scanner sc = new Scanner(System.in);
        int [] niz1 = {4, 120, 4, 211, 2, 4, 12, 4, 22, -2};
        System.out.print("Unesite broj koji zelite da prebrojimo u nizu brojeva: ");
        int broj = sc.nextInt();

        int a = prebrojavanje(niz1, broj);
        if (a > 0) {
            System.out.println("Broj " + broj + " se pojavljuje " + a + " puta u nasem nizu brojeva.");
        } else {
            System.out.println("Broj " + broj + " se ne pojavljuje u nasem nizu.");
        }
    }
        public static int prebrojavanje (int [] lala, int x){
        int brojac = 0;
        for (int i = 0; i < lala.length; i++){
            if (lala[i] == x){
                brojac++;
            }
        }

        return brojac;
        }

}
