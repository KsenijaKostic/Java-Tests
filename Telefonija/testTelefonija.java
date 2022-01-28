package Telefonija;

public class testTelefonija {
    public static void main(String[] args) {
        try{
            Broj b1 = new Broj("381", "65", "9866543", false);
            Broj b2 = new Broj("381", "65", "1234567", false);

            Korisnik k1 = new Korisnik("Zivko", "Zivkovic", b1);
            Korisnik k2 = new Korisnik("Ana", "Lilic", b2);

            k1.posaljiPoruku(b2, "Cao.");
            k1.posaljiPoruku(b2, "Druga poruka.");
            k1.posaljiPoruku(b2, ":)");

            k1.pozovi(b2, 121);
            k1.pozovi(b2, 54);

            k2.posaljiPoruku(b1,"Zavrsavas? ");
            k2.posaljiPoruku(b1,"Cao2");

            k2.pozovi(b1, 254);
            k2.pozovi(b1, 555);

            System.out.println(k1);
            System.out.println("Cena svih usluga korisnika je " + k1.cenaSvihUsluga() + "\n");
            System.out.println(k2);
            System.out.println("Cena svih usluga korisnika je " + k2.cenaSvihUsluga() + "\n");

        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
