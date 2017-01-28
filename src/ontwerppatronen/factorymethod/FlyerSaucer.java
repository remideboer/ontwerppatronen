/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.factorymethod;

/**
 *
 * @author Remi
 */
public class FlyerSaucer implements Vehicle{

    @Override
    public void move() {
        System.out.println("Het vliegt");
    }
    
}
