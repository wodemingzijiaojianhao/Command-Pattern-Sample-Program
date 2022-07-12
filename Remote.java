public class Remote {

	private Command[] onCommands; 
	private Command[] offCommands; 
	private Command lastCommand;
	private Stack myStack = new Stack();
	private final int NUM_OF_BUTTONS = 5;

	public Remote() {
		onCommands = new Command[NUM_OF_BUTTONS];
		offCommands = new Command[NUM_OF_BUTTONS];
	}

	
	public void setCommand(int slot, Command on, Command off) {
		onCommands[slot] = on;
		offCommands[slot] = off;
	}
	
	public void pressButton(int slot, boolean on) {
		if(on) {
			onCommands[slot].execute();
			myStack.push(onCommands[slot]);
			myStack.print();
		}
		else {
			offCommands[slot].execute();
			myStack.push(offCommands[slot]);
			myStack.print();
		}
	}
	
	public void undoLast() {

		myStack.pop().undo();
		myStack.print();
	}
	
}
