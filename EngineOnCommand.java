package RaceEngineer;

public class EngineOnCommand implements Command {
	Engine engine;
	
	public EngineOnCommand(Engine engine) {
		this.engine = engine;
	}
	
	public void execute() {
		engine.on();
		//engine.setRevolutions(9000);
		
	}
	//public void undo() {
		//engine.setRevolutions(0);
		//engine.off();
	//}
	
	

}
