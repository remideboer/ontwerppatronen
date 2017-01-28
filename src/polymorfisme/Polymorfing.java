/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme;

import polymorfisme.domain.Movable;
import polymorfisme.domain.creatures.Dog;
import polymorfisme.domain.vehicles.Startable;
import polymorfisme.domain.vehicles.Bike;
import polymorfisme.domain.vehicles.Vehicle;
import polymorfisme.domain.vehicles.Car;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import polymorfisme.mover.Mover;
import polymorfisme.mover.strategy.MoveInListStrategyFactory;
import polymorfisme.output.OutputConfigurator;
import polymorfisme.output.OutputDecorator;
import polymorfisme.output.OutputType;

/**
 *
 * @author Remi
 */
public class Polymorfing {

    public static void main(String[] args) {
        // infrastructuur opzetten
        OutputConfigurator outputConfigurator = OutputConfigurator.getInstance();
        PrintStream stream = outputConfigurator.setOut(OutputType.ERROR);
        OutputDecorator outputDecorator = new OutputDecorator(stream);
        
        // Klassen die in ieder geval movable implementeren
        Vehicle vehicle = new Bike(stream); // Dependency Injection van een PrintStream
        Car car = new Car(stream);
        Dog dog = new Dog(stream);

        // Movables kunnen allemaal in een lijst, maar de compiler kent alleen
        // de methoden die bij Movable horen, in dit geval move()
        // @runtime kent de JVM wel alle methoden van het actuele object
        List<Movable> movableList = new ArrayList<>();
        movableList.add(vehicle);
        movableList.add(car);
        movableList.add(dog);

        outputDecorator.divider("Print lijst Movables");

        // create a Mover object injecting a MoveInListStrategy using a factory
        // the factory will read the setting from file
        MoveInListStrategyFactory factory = MoveInListStrategyFactory.getInstance();
        Mover mover = new Mover(movableList, factory.create());
//        mover.setListMoveStategy(new MoveInListUsingForLoop());
        mover.moveObjectsInList();
        
        outputDecorator.divider("Polymorfisme in actie");
        
        // Verschillende manieren op hetzelfde object te benaderen door polymorfisme
        Car oCar = new Car(stream);
        Object o = oCar;
        Movable m = oCar;
        Startable s = oCar;
        Vehicle v = oCar;
        
        stream.println(o);
        s.start();
        m.move();
        v.move();
        car.fillUpTank();

        outputDecorator.divider("Casten naar bekend type");
        Vehicle veh = new Car(stream);
        veh.move(); // enige bekende methode
        Startable start = (Startable)veh; 
        start.start();
//        veh = new Bike(stream);
        // ter plekke casten
        if(veh instanceof Car){
            ((Car) veh).fillUpTank();
        }else{
            stream.println("Geen Car");
        }

    }

    // Hieronder staan wat helper methods voor printen en output

}
