package com.company;

import java.util.Scanner;

public class Main {

    public static final String JUODA_KAVA = "juoda kava";
    public static final String KAPUCINO = "kapucino";
    public static final String KAKAVA = "kakava";
    public static final String LATTE = "latte";
    public static final String PILDYT_VANDENI = "pildyti vandeni";
    public static final String PILDYT_PUPELIU = "pildyti pupeles";
    public static final String PILDYT_CUKRAUS = "pildyti cukru";
    public static final String PLAUTI = "plauti";
    public static final String TIKRINTI_APARATO_BUSENA = "busena";
    public static final String BAIGTI = "0";

    public void Pasirinkimai() {
        System.out.println("================================================");
        System.out.println("Pasirinkite kava: ");
        System.out.println("kapucino ");
        System.out.println("juoda kava ");
        System.out.println("kakava ");
        System.out.println("latte ");
        System.out.println("busena ");
        System.out.println("pildyti vandeni ");
        System.out.println("pildyti pupeles ");
        System.out.println("pildyti cukru ");
        System.out.println("plauti ");
        System.out.println("jei nieko, iveskite skaiciu 0 ");
        System.out.println("================================================");

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.vykdytiProgramaBeGalo();
    }

    public void vykdytiProgramaBeGalo() {
        boolean kartoti = true;
        KavosAparatas kava = new KavosAparatas();
        Scanner sc = new Scanner(System.in);
        while (kartoti == true) {
            Pasirinkimai();
            String pasirinkimas = sc.nextLine();
            switch (pasirinkimas){
                case JUODA_KAVA:
                    kava.gaminti("juoda kava");
                    break;
                case KAPUCINO:
                    kava.gaminti("kapucino");
                    break;
                case KAKAVA:
                    kava.gaminti("kakava");
                    break;
                case LATTE:
                    kava.gaminti("latte");
                    break;
                case PILDYT_VANDENI:
                    kava.setVandensKiekis();
                    break;
                case PILDYT_PUPELIU:
                    kava.setKavosPupeliuKiekis();
                    break;
                case PILDYT_CUKRAUS:
                    kava.setCukrausKiekis();
                    break;
                case PLAUTI:
                    kava.plauti();
                    break;
                case TIKRINTI_APARATO_BUSENA:
                    kava.aparatoBusena();
                    break;
                case BAIGTI:
                    kartoti = false;
                    break;
            }
        }
    }
}
