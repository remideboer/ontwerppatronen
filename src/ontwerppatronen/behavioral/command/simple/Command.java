package ontwerppatronen.behavioral.command.simple;

public interface Command {

	void execute();

	 void undo();
	 
	 void redo();
}
