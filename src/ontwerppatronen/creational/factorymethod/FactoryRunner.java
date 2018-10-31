/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontwerppatronen.creational.factorymethod;

/**
 *
 * @author Remi
 */
public class FactoryRunner {
    public static void main(String[] args) {
        VehicleFactory fac = new VehicleFactory();
        fac.setSetting(4);
        Vehicle veh = fac.create();
        veh.move();
    }
}
