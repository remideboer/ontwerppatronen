package polymorfisme.mover.strategy;

import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import polymorfisme.Polymorfing;
import polymorfisme.mover.strategy.implementations.MoveInListUsingForLoop;
import polymorfisme.mover.strategy.implementations.MoveInListUsingLambda;

/**
 * De klasse moet op basis van een instelling in seteinde juiste implementatie
 * teruggeven van een MoveInListStrategy implementeert Simple Singleton
 *
 * @author Remi
 */
public class MoveInListStrategyFactory {

    // 1 static variable instance holder
    private static final MoveInListStrategyFactory INSTANCE = new MoveInListStrategyFactory();

    // 2 private constructor
    private MoveInListStrategyFactory() {
    }

    // 3 static instance getter
    public static MoveInListStrategyFactory getInstance() {
        return INSTANCE;
    }

    // create an MoveInListStrategy based what is in polymorfing.properties file
    // if no settng is found or file is not found or gives IOException use default(foreach)
    public ListMoveStrategy create() {
        ListMoveStrategy strategy = null;
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get("", "polymorfing.properties").toAbsolutePath())) {
            // get the line that contains list_move_strategy
            Optional<String> listMoveStrategy = stream.filter(s -> s.contains("list_move_strategy")).findFirst();
            // if the Optional has a value
            if (listMoveStrategy.isPresent()) {
                // get the content of the Optional, this is a String containing a line in teh textfile
                String stratLine = listMoveStrategy.get();
                String setting = stratLine.substring(stratLine.lastIndexOf("=") + 1);
                // the index 1 contains the requested setting
                if(setting.equalsIgnoreCase("lambda")){
                    Logger.getLogger(MoveInListStrategyFactory.class.getName()).log(Level.INFO, "Using Lambda as strategy");
                    strategy = new MoveInListUsingLambda();
                }else{
                    Logger.getLogger(MoveInListStrategyFactory.class.getName()).log(Level.INFO, "Using foreach as strategy");
                    strategy = new MoveInListUsingForLoop();
                }
                
            }else{
               Logger.getLogger(MoveInListStrategyFactory.class.getName()).log(Level.INFO, "Setting not found, using foreach as strategy");
               strategy = new MoveInListUsingForLoop();
            }

        } catch (IOException e) {
            Logger.getLogger(MoveInListStrategyFactory.class.getName()).log(Level.SEVERE, "Couldn open properties file, Using default foreach as strategy");
            return new MoveInListUsingForLoop();
        }

        return strategy;
    }
}
