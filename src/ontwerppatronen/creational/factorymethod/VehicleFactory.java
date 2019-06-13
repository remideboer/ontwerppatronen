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
public class VehicleFactory implements IVehicleFactory{
    private int setting = 0;

    public void setSetting(int setting) {
        this.setting = setting;
    }
     
    public Vehicle create(){
        if(setting == 0 ){
            return new Auto(); 
        }else if(setting == 1 ){
            return new Bike();
        }
        return new FlyerSaucer();
    }
}
