/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.behavioral.strategy;

/**
 *
 * @author Remi
 */
public class StratRunner {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.setStrategy(new DriveStrategy());
        veh.letsGo();
        veh.setStrategy(new FlyStrategy());
        veh.letsGo();
    }
}
