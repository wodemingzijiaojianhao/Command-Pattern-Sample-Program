public class LightOffCommand implements Command{

private Lights lights;

	
	public LightOffCommand(Lights lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.turnOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		lights.turnOn();
	}

	@Override
	public void printName() {
		System.out.print(" LightOffCommand");
	}

	
}
