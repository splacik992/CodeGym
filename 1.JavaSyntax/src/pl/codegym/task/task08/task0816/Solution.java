package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));
        mapa.put("Rafal", df.parse("GRUDZIEŃ 1 1980"));
        mapa.put("Magda", df.parse("MAJ 1 1980"));
        mapa.put("Piotrek", df.parse("LIPIEC 1 1980"));
        mapa.put("Wojtek", df.parse("LIPIEC 1 1980"));
        mapa.put("Krzysiek", df.parse("MARZEC 1 1980"));
        mapa.put("Marta", df.parse("WRZESIEŃ 1 1980"));
        mapa.put("Mama", df.parse("CZERWIEC 1 1980"));
        mapa.put("Tata", df.parse("SIERPIEŃ 1 1980"));
        mapa.put("Brat", df.parse("LISTOPAD 1 1980"));

        //tutaj wpisz swój kod
        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        //tutaj wpisz swój kod

        Iterator<Map.Entry<String,Date>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> para = iterator.next();
            if(para.getValue().getMonth() > 4 && para.getValue().getMonth() < 8){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
    }
}
