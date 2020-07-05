package machine;

public abstract class ZeroOne extends State {
	
	public State b() {
		return new Two();
	}
	
}
