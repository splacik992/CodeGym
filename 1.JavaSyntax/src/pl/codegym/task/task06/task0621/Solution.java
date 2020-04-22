package pl.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Relacje między kotami
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String imieDziadek = scanner.nextLine();
        Kot dziadek = new Kot(imieDziadek);

        String imieBabcia = scanner.nextLine();
        Kot babcia = new Kot(imieBabcia);

        String imieOjca = scanner.nextLine();
        Kot kotOjciec = new Kot(imieOjca,dziadek);

        String imieMatki = scanner.nextLine();
        Kot kotMatka = new Kot(imieMatki,dziadek,babcia);

        String imieSyna = scanner.nextLine();
        Kot kotSyn = new Kot(imieSyna,kotMatka,kotOjciec);

        String imieCorki = scanner.nextLine();
        Kot kotCorka = new Kot(imieCorki, kotMatka,kotOjciec);


        System.out.println(dziadek);
        System.out.println(babcia);
        System.out.println(kotOjciec);
        System.out.println(kotMatka);
        System.out.println(kotSyn);
        System.out.println(kotCorka);
    }

    public static class Kot {
        private String imie;
        private Kot rodzic;
        private Kot rodzic2;

        Kot(String imie) {
            this.imie = imie;
        }


        Kot(String imie, Kot rodzic) {
            this.imie = imie;
            this.rodzic = rodzic;
        }
        Kot(String imie, Kot rodzic,Kot rodzic2) {
            this.imie = imie;
            this.rodzic = rodzic;
            this.rodzic2 = rodzic2;
        }

        @Override
        public String toString() {
            if (rodzic == null&&rodzic2==null){
                return "Imię kota to " + imie + ", brak matki, brak ojca";
            }
            else if (rodzic!=null&&rodzic2!=null){
                return "Imię kota to " + imie + ", " + rodzic.imie + " to matka " + rodzic2.imie + " to ojciec";
            }
            else if (rodzic!=null){
                return "Imię kota to " + imie + ", brak matki, " + rodzic.imie + " to ojciec";
            }
            else if (rodzic==null&&rodzic2==null){
                return "Imię kota to " + rodzic.imie + ", " + rodzic2.imie + " to matka, brak ojca";
            }
            else {
                return "Imię kota to " + imie + ", " + rodzic.imie + ", brak ojca";
            }
        }
    }
}