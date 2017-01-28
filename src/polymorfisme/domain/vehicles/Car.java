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
public class Car extends Vehicle implements Movable, Startable {

    public Car(PrintStream stream) {
        super(stream);
    }

    public void fillUpTank() {
        stream.println("Even tanken");
    }

    @Override
    public void move() {
        stream.println("Vroem vroem");
    }

    @Override
    public void start() {
        stream.println("Starten maar");
    }

    @Override
    public String toString() {
        return "Dit is een Auto";
    }
}
