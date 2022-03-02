package Test;

import Getraenkeparadies.Apfelsaft;
import Getraenkeparadies.Kiwisaft;
import Getraenkeparadies.Tequilla;
import Getraenkeparadies.Wodka;

public class Main {
    public static void main(String[] args) {

        Apfelsaft apfelsaft1 = new Apfelsaft(500,true,"Ja");
        System.out.println(apfelsaft1.toString());
        apfelsaft1.geschuettelt();

        Kiwisaft kiwisaft1 = new Kiwisaft(333, true);
        System.out.println(kiwisaft1.toString());
        kiwisaft1.geschuettelt();

        Wodka wodka1 = new Wodka(750, 40,"Mint");
        System.out.println(wodka1.toString());
        wodka1.geschuettelt();

        Tequilla tequilla1 = new Tequilla(750, 400, true, false);
        System.out.println(tequilla1.toString());



    }
}
