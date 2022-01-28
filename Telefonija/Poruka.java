package Telefonija;

public class Poruka extends Usluga {
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }


    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd.toString()).append(" -> ").append(brojKa.toString()).append(" ").append(tekstPoruke);

        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        double cena = 0;
        if (brojOd.equals(null) && brojKa.equals(null) && brojOd.equals(brojKa) && brojOd.isFiksni() == true && brojKa.isFiksni() == true){ //jbg 2 greske
            cena = 0;
        } else {
            cena = 3;
        }
        return cena;
    }
}
