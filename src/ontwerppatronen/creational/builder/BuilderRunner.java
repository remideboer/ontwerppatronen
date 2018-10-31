/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.creational.builder;

/**
 *
 * @author Remi
 */
public class BuilderRunner {

    public static void main(String[] args) {
        // gebruikmakend van de statische binnenklasse
        Klant klant01 = new Klant.KlantBuilder()
                .voornaam("klant01")
                .bsn("123456789")
                .geboorteDatum("23-03-1976")
                .build();
        Klant klant02 = new Klant.KlantBuilder()
                .build();
        
        // gebruikmakend van een 'externe' builder
        KlantBuilderExtern kbe = new KlantBuilderExtern();
        kbe.achternaam("De achternaam").voornaam("klant02");
        Klant klant03 = kbe.build();
       
        System.out.println(klant01);
        System.out.println(klant02);
        System.out.println(klant03);
    }

}
