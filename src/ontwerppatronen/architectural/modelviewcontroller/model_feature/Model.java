package ontwerppatronen.architectural.modelviewcontroller.model_feature;

/**
 * The model class. Represents Business objects
 * @author Remi
 */
public class Model {
    private String naam;
    
    public Model(String naam){
        this.naam = naam;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }
    
    @Override
    public String toString() {
        return naam;
    }
    
}
