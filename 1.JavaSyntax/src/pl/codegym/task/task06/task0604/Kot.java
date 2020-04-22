package pl.codegym.task.task06.task0604;

/* 
Licznik kotów
*/

public class Kot {
    public static int licznikKotow = 0;


    public Kot(){
        licznikKotow++;
    }
    //tutaj wpisz swój kod
    public void finalize()throws Throwable{
        licznikKotow--;
    }

    public static void main(String[] args) {

    }
}