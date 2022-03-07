package com.abstractDemo;

public class Main {

    public static void main(String[] args){

       TarımKrediManager tarımKrediManager = new TarımKrediManager();
       tarımKrediManager.degerlendir();
       tarımKrediManager.save();

       AskerKrediManager askerKrediManager = new AskerKrediManager();
       askerKrediManager.degerlendir();
       askerKrediManager.save();
    }

}
