package Telefonija;

public class Poziv extends Usluga {
    private int trajanjeUsekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUsekundama) {
        super(brojOd, brojKa);
        this.trajanjeUsekundama = trajanjeUsekundama;
    }

    public int getTrajanjeUsekundama() {
        return trajanjeUsekundama;
    }

    public void setTrajanjeUsekundama(int trajanjeUsekundama) {
        this.trajanjeUsekundama = trajanjeUsekundama;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd.toString()).append(" ---> ").append(brojKa.toString());
        sb.append(" ").append(trajanjeUsekundama / 60).append(":").append(trajanjeUsekundama % 60);

        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        double cena = 0;
        int minuti = trajanjeUsekundama / 60;
        if (brojOd.equals(null) || brojKa.equals(null) || brojOd.equals(brojKa)) {
            cena = 0;
        } else {
            if (trajanjeUsekundama % 60 == 0) {
                cena = minuti * 10;
            } else {
                cena = (minuti * 10) + 10;
            }
        }
        return cena;
    }
}
