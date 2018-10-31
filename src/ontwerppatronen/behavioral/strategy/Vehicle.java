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
public class Vehicle {
    // 1. Strategy Holder
    private MovementStrategy strat; // delegeert 
    
    // om het probleem van de afwezige strategie af te dwingen/ inzichtelijk te maken
    // kun je deze als argument in een constructor vereisen
//    public Vehicle(MovementStragegy strat){
//        this.strat = strat;
//    }
    
    // 2. Strategy use
    public void letsGo(){
        // check voor wel/niet aanwezig zijn van strategie en indien niet aanwezig, gooi Exception op. Dit is duidelijker dan
        // tijdens draainen programme ineens tegen een NullpointerException aanlopen
//        if(strat == null){
//            throw new IllegalStateException("Nog geen strategie toegewezen"); // IllegalStateException denkt de lading precies
//        }
        strat.move();
    }
    
    // 3. Strategy setter
    public void setStrategy(MovementStrategy strat){
        this.strat = strat;
    }
}
