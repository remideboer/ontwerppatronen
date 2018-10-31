package ontwerppatronen.architectural.modelviewcontroller;

/**
 *
 * @author Remi
 */
public interface DAO<T> {
    void create(T t);
    T findById(int id) throws DataBaseNotFoundException, ModelNotFoundException;
}
