/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.strategy;

/**
 *
 * @author Remi
 */
class FlyStrategy implements MovementStrategy {

    public FlyStrategy() {
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }
    
}
