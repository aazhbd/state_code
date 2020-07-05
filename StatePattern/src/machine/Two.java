package machine;

public class Two extends State {
	
	public State b() {
		return new Three();
	}

}
