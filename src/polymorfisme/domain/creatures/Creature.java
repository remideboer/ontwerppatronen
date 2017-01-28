/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.domain.creatures;

import java.io.PrintStream;

/**
 *
 * @author Remi
 */
public abstract class Creature {
    protected PrintStream stream;

    // dwingt af dat er een PrintStream mee wordt gegeven door subklassen
    public Creature(PrintStream stream) {
        this.stream = stream;
    }
    
    public void breathe() {
        stream.println("Adem in, Adem uit");
    }
}
