package com.company;

public class KavosAparatas {

    private float cukrausKiekis = 10;
    private float kavosPupeliuKiekis = 20;
    private float vandensKiekis = 20;

    private int panaudojimuKiekis = 0;

    public static final int PANAUDOJIMU_RIBA = 10;

    public void vandensPildymas() {
        if (getVandensKiekis() <= 0) {
            setVandensKiekis();
        }
    }

    public void pupeliuPildymas() {
        if (getKavosPupeliuKiekis() <= 0) {
            setKavosPupeliuKiekis();
        }
    }

    public void cukrausPildymas() {
        if (getCukrausKiekis() <= 0) {
            setCukrausKiekis();
        }
    }

    public void gaminti(String gerimas) {
        if (gerimas.equals("juoda kava")){
            if (getPanaudojimuKiekis()>=10){
                System.out.println("Aparata reikia plauti.");
            } else if (getVandensKiekis()<3){
                System.out.println("Aparata reikia papildyti vandens.");
            } else if (getKavosPupeliuKiekis()<3){
                System.out.println("Aparata reikia papildyti kavos pupeliu.");
            } else {
                panaudojimuKiekis=getPanaudojimuKiekis()+1;
                vandensKiekis=getVandensKiekis()-3;
                kavosPupeliuKiekis=getKavosPupeliuKiekis()-3;
                produktoBusena(gerimas);
            }
        }


        if (gerimas.equals("kapucino")){
            if (getPanaudojimuKiekis()>=10){
                System.out.println("Aparata reikia plauti.");
            } else if (getVandensKiekis()<3){
                System.out.println("Aparata reikia papildyti vandens.");
            } else if (getKavosPupeliuKiekis()<3){
                System.out.println("Aparata reikia papildyti kavos pupeliu.");
            } else if (getCukrausKiekis()<3){
                System.out.println("Aparata reikia papildyti cukraus.");
            } else {
                panaudojimuKiekis=getPanaudojimuKiekis()+1;
                vandensKiekis=getVandensKiekis()-3;
                kavosPupeliuKiekis=getKavosPupeliuKiekis()-3;
                cukrausKiekis=getCukrausKiekis()-3;
                produktoBusena(gerimas);
            }
        }

        if (gerimas.equals("kakava")){
            if (getPanaudojimuKiekis()>=10){
                System.out.println("Aparata reikia plauti.");
            } else if (getVandensKiekis()<3){
                System.out.println("Aparata reikia papildyti vandens.");
            } else if (getKavosPupeliuKiekis()<3){
                System.out.println("Aparata reikia papildyti kavos pupeliu.");
            } else if (getCukrausKiekis()<3){
                System.out.println("Aparata reikia papildyti cukraus.");
            } else {
                panaudojimuKiekis=getPanaudojimuKiekis()+1;
                vandensKiekis=getVandensKiekis()-3;
                kavosPupeliuKiekis=getKavosPupeliuKiekis()-3;
                cukrausKiekis=getCukrausKiekis()-3;
                produktoBusena(gerimas);
            }
        }

        if (gerimas.equals("latte")){
            if (getPanaudojimuKiekis()>=10){
                System.out.println("Aparata reikia plauti.");
            } else if (getVandensKiekis()<3){
                System.out.println("Aparata reikia papildyti vandens.");
            } else if (getKavosPupeliuKiekis()<3){
                System.out.println("Aparata reikia papildyti kavos pupeliu.");
            } else if (getCukrausKiekis()<3){
                System.out.println("Aparata reikia papildyti cukraus.");
            } else {
                panaudojimuKiekis=getPanaudojimuKiekis()+1;
                vandensKiekis=getVandensKiekis()-3;
                kavosPupeliuKiekis=getKavosPupeliuKiekis()-3;
                cukrausKiekis=getCukrausKiekis()-3;
                produktoBusena(gerimas);
            }
        }

    }

    public void plauti() {
        setPanaudojimuKiekis();
    }

    public void arPasiruoses() {

    }

    public void produktoBusena(String gerimas) {
        System.out.println("Jusu " + gerimas + " gaminti baige.");
    }

    public void aparatoBusena() {
        System.out.println("Liko pupeliu: " + getKavosPupeliuKiekis());
        System.out.println("Liko cukraus: " + getCukrausKiekis());
        System.out.println("Liko vandens: " + getVandensKiekis());
        System.out.println("Liko panaudojimu iki plovimo: " + (PANAUDOJIMU_RIBA-getPanaudojimuKiekis()));
    }

    public float setCukrausKiekis() {
        cukrausKiekis += 10;
        return cukrausKiekis;
    }

    public float setKavosPupeliuKiekis() {
        kavosPupeliuKiekis += 10;
        return kavosPupeliuKiekis;
    }

    public float setVandensKiekis() {
        vandensKiekis += 10;
        return vandensKiekis;
    }

    public int setPanaudojimuKiekis() {
        panaudojimuKiekis=0;
        return panaudojimuKiekis;
    }

    public float getCukrausKiekis() {
        return cukrausKiekis;
    }

    public float getKavosPupeliuKiekis() {
        return kavosPupeliuKiekis;
    }

    public float getVandensKiekis() {
        return vandensKiekis;
    }

    public int getPanaudojimuKiekis() {
        return panaudojimuKiekis;
    }

}
