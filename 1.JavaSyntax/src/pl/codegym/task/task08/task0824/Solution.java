package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Ludzie> dziecidziadek1 = new ArrayList<Ludzie>();
        ArrayList<Ludzie> dziecidziadek2 = new ArrayList<Ludzie>();

        ArrayList<Ludzie> dziecibabcia1 = new ArrayList<Ludzie>();
        ArrayList<Ludzie> dziecibabcia2 = new ArrayList<Ludzie>();

        ArrayList<Ludzie> dzieciojciec1 = new ArrayList<Ludzie>();
        ArrayList<Ludzie> dziecimatka1 = new ArrayList<Ludzie>();

        ArrayList<Ludzie> dziecidziecko1 = new ArrayList<Ludzie>();
        ArrayList<Ludzie> dziecidziecko2 = new ArrayList<Ludzie>();
        ArrayList<Ludzie> dziecidziecko3 = new ArrayList<Ludzie>();


        Ludzie dziadek1 = new Ludzie("Janusz", true, 55, dziecidziadek1);
        Ludzie dziadek2 = new Ludzie("Adof", true, 65, dziecidziadek2 );

        Ludzie babcia1 = new Ludzie("Ania", false, 34, dziecibabcia1);
        Ludzie babcia2 = new Ludzie("Olga", false, 76, dziecibabcia2);

        Ludzie ojciec1 = new Ludzie("Mirek", true, 34, dzieciojciec1);

        Ludzie matka1 = new Ludzie("Kasia", false, 45, dziecimatka1);

        Ludzie dziecko1 = new Ludzie("Kasia", false, 15, dziecidziecko1);
        Ludzie dziecko2 = new Ludzie("Basia", false, 12, dziecidziecko2);
        Ludzie dziecko3 = new Ludzie("Asia", false, 14, dziecidziecko3);

        System.out.println(dziadek1);
        System.out.println(dziadek2);

        System.out.println(babcia1);
        System.out.println(babcia2);

        System.out.println(ojciec1);

        System.out.println(matka1);

        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);

    }

    public static class Ludzie {
        //tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        ArrayList<Ludzie> dzieci;

        public Ludzie(String imie,boolean plec,int wiek,ArrayList<Ludzie> dzieci){
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.dzieci = dzieci;
        }


        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
