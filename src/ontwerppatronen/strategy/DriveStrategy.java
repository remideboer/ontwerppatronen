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
class DriveStrategy implements MovementStrategy {

    public DriveStrategy() {
    }

    @Override
    public void move() {
        System.out.println("Driving");
    }
    
}
