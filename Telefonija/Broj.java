package Telefonija;

public class Broj {
    private String kodDrzave;
    private String pozivniBr;
    private String broj;
    private boolean fiksni;

    public Broj(String kodDrzave, String pozivniBr, String broj, boolean fiksni) throws ArithmeticException {
        if (proveriBroj(kodDrzave, pozivniBr, broj) == false) {
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        }
            this.kodDrzave = kodDrzave;
            this.pozivniBr = pozivniBr;
            this.broj = broj;

        this.fiksni = fiksni;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) throws ArithmeticException {
        if (kodDrzave.equals(null) || kodDrzave.length() != 3 || proveriDaLiStringSadrziSamoNumerike(kodDrzave) == false) {
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        } else {
            this.kodDrzave = kodDrzave;
        }
    }

    public String getPozivniBr() {
        return pozivniBr;
    }

    public void setPozivniBr(String pozivniBr) throws ArithmeticException {
        if (pozivniBr.equals(null) || pozivniBr.length() != 2 || proveriDaLiStringSadrziSamoNumerike(pozivniBr) == false) {
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        } else {
            this.pozivniBr = pozivniBr;
        }
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) throws ArithmeticException {
        if (broj.equals(null) || broj.length() > 8 || broj.length() < 7 || proveriDaLiStringSadrziSamoNumerike(broj) == false) {
            ArithmeticException ae = new ArithmeticException("Broj nije validan");
            throw ae;
        } else {
            this.broj = broj;
        }
    }

    public boolean isFiksni() {
        return fiksni;
    }

    public void setFiksni(boolean fiksni) {
        this.fiksni = fiksni;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(kodDrzave).append(" ").append(pozivniBr).append(" ").append(broj);
        return sb.toString();
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String x) {
        boolean proveriDaLiSuSveBrojevi = true;
        for (int i = 0; i < x.length(); i++) {
            char z = x.charAt(i);
            proveriDaLiSuSveBrojevi = Character.isDigit(z);
            if (proveriDaLiSuSveBrojevi == false) {
                break;
            }
        }

        return proveriDaLiSuSveBrojevi;
    }

    private static boolean proveriBroj(String kodDrzave, String pozivniBr, String broj) {
        boolean proveri = true;
        if (kodDrzave.equals(null) || kodDrzave.length() != 3 || proveriDaLiStringSadrziSamoNumerike(kodDrzave) == false) {
            proveri = false;
        } else if (pozivniBr.equals(null) || pozivniBr.length() != 2 || proveriDaLiStringSadrziSamoNumerike(pozivniBr) == false) {
            proveri = false;
        } else if (broj.equals(null) || broj.length() > 8 || broj.length() < 7 || proveriDaLiStringSadrziSamoNumerike(broj) == false) {
            proveri = false;
        }

        return proveri;
    }
}
