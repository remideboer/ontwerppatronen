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
public class Vehicle {
    private MovementStragegy strat;
    
    public void letsGo(){
        strat.move();
    }
    
    public void setStrategy(MovementStragegy strat){
        this.strat = strat;
    }
}
