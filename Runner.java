public class Runner {

	public static void main(String[] args) {
		Remote remote = new Remote();
		Lights lights = new Lights(); 
		Speaker speakers = new Speaker();
		remote.setCommand(0, new LightOnCommand(lights), new LightOffCommand(lights));
		remote.pressButton(0, true);
		remote.setCommand(1, new SpeakerUpCommand(speakers), new SpeakerDownCommand(speakers));	
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.pressButton(1, true);
		remote.undoLast();
		remote.pressButton(0, true);
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		remote.undoLast();
		
		
	}
	
}
