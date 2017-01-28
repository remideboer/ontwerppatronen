/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorfisme.output;

import java.io.PrintStream;

/**
 *
 * @author Remi
 */
public class OutputDecorator {

    private PrintStream stream;

    public OutputDecorator(PrintStream stream) {
        this.stream = stream;
    }

    public void divider(String string) {
        stream.println("--------------------- " + string + " ---------------------");
    }

}
