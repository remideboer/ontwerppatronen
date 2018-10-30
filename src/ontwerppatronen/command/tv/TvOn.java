package ontwerppatronen.command.tv;

import ontwerppatronen.command.Command;

public class TvOn implements Command {

	private TV tv;

	public TvOn(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

	@Override
	public void undo() {
		tv.turnOff();
		
	}

	@Override
	public void redo() {
		tv.turnOn();	
	}

}
