package javaTest;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        //Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
        //niz je tipa int


        int[] niz = {6, 10, 12, -11, -100, 99, 155, 71, 11, 46};
        int max = niz[0];
        System.out.println("Najveci clan niza je: ");
        for (int i = 0; i < niz.length; i++){
            if (niz[i] > max){
                max = niz[i];
            }
        }
        System.out.print(max);


    }
}
