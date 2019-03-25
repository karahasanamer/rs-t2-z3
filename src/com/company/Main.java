package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ulaz= new Scanner(System.in);
        String recenica;

        recenica=ulaz.nextLine();
        String najduza="";

        for(String rijec : recenica.split(" ") ){

            if(rijec.length() > najduza.length())

                najduza = rijec;
        }
            String novi;
            novi=recenica.replaceAll(najduza,(najduza.toUpperCase()));

        System.out.println(novi);




    }
}
