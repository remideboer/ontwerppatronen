package ontwerppatronen.behavioral.command.simple.radio;

import ontwerppatronen.behavioral.command.simple.Command;

public class RadioOn implements Command {

	private Radio radio;

	public RadioOn(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		this.radio.radioOn();
	}

	@Override
	public void undo() {
		this.radio.radioOff();	
	}

	@Override
	public void redo() {
		this.radio.radioOn();
	}

}
