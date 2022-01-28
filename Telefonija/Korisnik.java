package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    private static int brojac = 1;
    private int id;
    private String ime;
    private String prezime;
    private Broj broj;
    private ArrayList<Usluga> istorijaUsluga;

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        istorijaUsluga = new ArrayList<>();
        this.id = brojac;
        brojac++;
    }

    public static int getBrojac() {
        return brojac;
    }

    public static void setBrojac(int brojac) {
        Korisnik.brojac = brojac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(ime).append(" ").append(prezime).append(" ").append(broj);
        sb.append("\nIstorija usluga: \n");
        for (Usluga u : istorijaUsluga) {
            sb.append(u).append("\n");
        }

        return sb.toString();
    }

    public void posaljiPoruku(Broj b, String tekst) {
        if (b.equals(null) || b.equals(null) || broj.equals(b) || broj.isFiksni() == true || b.isFiksni() == true) {

        } else {
            Poruka poruka = new Poruka(broj, b, tekst);
            istorijaUsluga.add(poruka);
        }
    }

    public void pozovi(Broj b, int duzinaPozivaUSekundama) {
        if (broj.equals(null) || b.equals(null) || broj.equals(b)) {

        } else {
            Poziv poziv = new Poziv(broj, b, duzinaPozivaUSekundama);
            istorijaUsluga.add(poziv);
        }
    }

    public double cenaSvihUsluga() {
        double ukupnaCena = 0;
        for (Usluga u : istorijaUsluga) {
            ukupnaCena = ukupnaCena + u.cenaUsluge();
        }
        return ukupnaCena;
    }
}
