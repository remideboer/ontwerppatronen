package ontwerppatronen.command.simple;

public interface Command {

	void execute();

	 void undo();
	 
	 void redo();
}
