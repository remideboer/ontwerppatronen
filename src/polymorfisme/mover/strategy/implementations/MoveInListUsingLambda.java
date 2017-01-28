package polymorfisme.mover.strategy.implementations;

import java.util.List;
import polymorfisme.domain.Movable;
import polymorfisme.mover.strategy.ListMoveStrategy;
import polymorfisme.mover.strategy.ListMoveStrategy;

/**
 * Deze klasse gebruikt een lambda ipv een for loop. 
 * @author Remi
 */
public class MoveInListUsingLambda implements ListMoveStrategy {

    @Override
    public void moveInList(List<Movable> list) {
        list.stream().forEach((movable) -> {
            movable.move();
        });
    }

}
