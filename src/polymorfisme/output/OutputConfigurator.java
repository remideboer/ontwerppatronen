package polymorfisme.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import polymorfisme.Polymorfing;

/**
 * Klasse om de Output in te kunnen stellen op CONSOLE ERROR of tekst
 * implemeneteert een Simple Singleton pattern
 */
public class OutputConfigurator {
    // 1 - private static zodat er maar 1 kan zijn 
    private static final OutputConfigurator INSTANCE= new OutputConfigurator();
    // 2 - constructor private zodat er geen instantie van gemaakt kan worden
    // behalve door zichzelf
    private OutputConfigurator() {
    }
    // 3 - de getter om de enige instantie te bemachten
    public static OutputConfigurator getInstance() {
       return INSTANCE;
    }

    /**
     * Centrale plek om de printstream implementatie toe te wijzen Mogelijke
     * standaard klassen System.out en System.err OutputStream naar tekst is een
     * mogelijkheid
     *
     * @param type of output
     * @return PrintStream object
     */
    private PrintStream setOut(OutputType type, FileName fileName) {
        PrintStream stream;
        if (type == OutputType.CONSOLE) {
            Logger.getLogger(Polymorfing.class.getName()).log(Level.INFO, "Using the Console as output");
            stream = System.out;
        } else if (type == OutputType.ERROR) {
            Logger.getLogger(Polymorfing.class.getName()).log(Level.INFO, "Using the Console Error as output");
            stream = System.err;
        } else {
            Logger.getLogger(Polymorfing.class.getName()).log(Level.INFO, "Trying to use text file as output with name: " + fileName.getFileName());
            try {
                OutputStream output = new FileOutputStream(fileName.getFileName());
                PrintStream printOut = new PrintStream(output);
                stream = printOut;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Polymorfing.class.getName()).log(Level.SEVERE, "File not found", ex);
                // defaulting to Sytem.out
                stream = System.out;
            }
        }

        return stream;
    }

    // Voorbeelden van overloading
    // Convenience method for SetOut to also set output fileName and using a file
    // as output
    public PrintStream setOut(FileName fileName) {
        return setOut(OutputType.TEXT, fileName);
    }

    // Convenience method for SetOut to use default textname as output or console
    public PrintStream setOut(OutputType type) {
        return setOut(type, new FileName("system.out.txt"));
    }

}
