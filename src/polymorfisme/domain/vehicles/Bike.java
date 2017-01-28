/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.domain.vehicles;

import java.io.PrintStream;
import polymorfisme.domain.Movable;

/**
 *
 * @author Remi
 */
public class Bike extends Vehicle implements Movable {

    public Bike(PrintStream stream) {
        super(stream);
    }

    @Override
    public void move() {
        stream.println("Lekker fietsen");
    }
    
    public void fixChain(){
        stream.println("Bah, ketting ligt eraf. Moet ik maken");
    }

    @Override
    public String toString() {
        return "Dit is een Fiets";
    }

}
