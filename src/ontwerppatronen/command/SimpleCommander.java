package ontwerppatronen.command;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import ontwerppatronen.command.radio.Radio;
import ontwerppatronen.command.radio.RadioOn;
import ontwerppatronen.command.tv.TV;
import ontwerppatronen.command.tv.TvOn;

/**
* Launcher to demonstrate the GoF Command Pattern
 * Intent: 
 * Encapsulate a request as an object, thereby letting you parametrize clients with different requests
 * queue or log requests, and support undoable operations.
 * Promote "invocation of a method on an object" to full object status
 * An object-oriented callback
 * 
 * SimpleCommandLauncher fungeert nu als Invoker/Cient, TV en Radio zijn receivers,  
 * @author remideboer
 *
 */
public class SimpleCommander {
	// to store commands
	private List<Command> commandList = new ArrayList<Command>();
	// to keep track for undo
	private ArrayDeque<Command> stack = new ArrayDeque<>();
	// to keep track for redo
	private ArrayDeque<Command> redoStack = new ArrayDeque<>();

	private void run() {
		TV tv = new TV("Samsung");
		TV tv2 = new TV("Philips");
		TV tv3 = new TV("LG");
		Radio radio = new Radio();
		
		commandList.add(new TvOn(tv));
		commandList.add(new TvOn(tv2));
		commandList.add(new TvOn(tv3));
		commandList.add(new RadioOn(radio));
		
		doCommands();
		
		undoCommands();
		
		redoCommands();
		
	}

	private void doCommands() {
		System.out.println("Executing all commands");
		for (Command command : commandList) {
			command.execute();
			// push to stack for undo
			stack.push(command);
		}
	}
	
	private void undoCommands() {
		System.out.println("Undoing all commands");
		for (Command command : stack) {
			redoStack.push(stack.pop());
			command.undo();
		}
	}
	
	private void redoCommands() {
		System.out.println("Redoing all commands");
		for (Command command : redoStack) {
			stack.add(redoStack.pop());
			command.redo();
		}
	}

	private void printCollections() {
		System.out.println(String.format("commandList size:[%d] stack size:[%d], redoStack size:[%d]",
				commandList.size(), stack.size(), redoStack.size()));
	}

	public static void main(String[] args) {
		SimpleCommander instance = new SimpleCommander();
		instance.run();
	}

}
