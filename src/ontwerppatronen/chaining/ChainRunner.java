/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.chaining;

/**
 *
 * @author Remi
 */
public class ChainRunner {

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.name("Remi").age(40).hobby("Play Guitar")
                .show(); // build
        chain.name("Joop")
                .show(); // build
    }
}
