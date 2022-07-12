import java.util.ArrayList;

public class Stack {

	private ArrayList<Command> stack = new ArrayList<Command>();
	
	public Stack() {}
	
	public void push(Command command) {
		stack.add(command);
	}
	
	public Command pop() {
		Command command = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return command;
	}

	public void print() {
		System.out.print("Stack:");
		for (int i = 0; i < stack.size(); i++) {
			stack.get(i).printName();
		}
		System.out.print("\n");
	}
	
}
