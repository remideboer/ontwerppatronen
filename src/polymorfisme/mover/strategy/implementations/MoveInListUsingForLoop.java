/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.mover.strategy.implementations;

import java.util.List;
import polymorfisme.domain.Movable;
import polymorfisme.mover.strategy.ListMoveStrategy;
import polymorfisme.mover.strategy.ListMoveStrategy;

/**
 *
 * @author Remi
 */
public class MoveInListUsingForLoop implements ListMoveStrategy{

    @Override
    public void moveInList(List<Movable> list) {
        for (Movable movable : list) {
            movable.move();
        }
    }
    
}
