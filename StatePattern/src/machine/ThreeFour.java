package machine;

public abstract class ThreeFour extends State {

	public State b() {
		return new Zero();
	}
	
}
