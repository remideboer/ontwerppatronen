package ontwerppatronen.modelviewcontroller.model_feature;

import ontwerppatronen.modelviewcontroller.ModelNotFoundException;
import ontwerppatronen.modelviewcontroller.DataBaseNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ontwerppatronen.modelviewcontroller.Application;
import ontwerppatronen.modelviewcontroller.DAO;

/**
 *
 * @author Remi
 */
public class ModelDAO implements DAO<Model>{

    @Override
    public void create(Model model) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File(Application.dbFile), true))) {
            pw.println(model);
            pw.flush();// flush om de buffer te legen en daadwerkelijk te printen
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // find by Line Number om findBy Id te simuleren startend bij 1 net zoals in
    // DB
    @Override
    public Model findById(int id) throws DataBaseNotFoundException, ModelNotFoundException {
        Model model = null;
        File db = new File(Application.dbFile);

        try (Scanner scanner = new Scanner(db)) {
            String str = null;
            int cursor = 0; // simuleer cursor
            while (scanner.hasNextLine()) {
                str = scanner.nextLine(); //
                if (++cursor == id) { // als regelnummer overeenkomt met id fetch
                    model = new Model(str);
                    break;
                }
            }
            // als we hier zijn en er is nog geen model uitgekomen dan Exception opgegooien
            if (model == null) {
                throw new ModelNotFoundException();
            }
        } catch (FileNotFoundException ex) {
            throw new DataBaseNotFoundException();
        }

        return model;
    }

}
