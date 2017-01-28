package polymorfisme.mover;

import java.util.List;
import polymorfisme.domain.Movable;
import polymorfisme.mover.strategy.ListMoveStrategy;

public class Mover {

    private List<Movable> movableList;
    // 1 Strategy holder
    private ListMoveStrategy strategy; 
    
    // Dependency Injection
    public Mover(List<Movable> movableList, ListMoveStrategy strategy) {
        this.movableList = movableList;
        this.strategy = strategy;
    }
    
    // 2 Strategy user
    public void moveObjectsInList() {
        strategy.moveInList(movableList);
    }
    
    // 3 Strategy setter
    public void setListMoveStategy(ListMoveStrategy strategy){
        this.strategy = strategy;
    }
}
