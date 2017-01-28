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
public abstract class Vehicle implements Movable{
    protected PrintStream stream;

    // dwingt af dat er een PrintStream mee wordt gegeven door subklassen
    public Vehicle(PrintStream stream) {
        this.stream = stream;
    }

}
