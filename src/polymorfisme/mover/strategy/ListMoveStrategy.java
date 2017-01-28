/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.mover.strategy;

import java.util.List;
import polymorfisme.domain.Movable;

/**
 *
 * @author Remi
 */
public interface ListMoveStrategy {
    
    void moveInList(List<Movable> list);
}
