/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.domain.creatures;

import java.io.PrintStream;
import polymorfisme.domain.Movable;

/**
 *
 * @author Remi
 */
public class Dog extends Creature implements Movable {

    public Dog(PrintStream stream) {
        super(stream);
    }

    @Override
    public void move() {
        stream.println("Ren Ren Woef Woef");
    }
    
    public void chewBone(){
        stream.println("Knaag op bot");
    }
}
