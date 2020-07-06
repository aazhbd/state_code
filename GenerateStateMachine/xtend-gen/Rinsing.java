public class Rinsing extends State {
	public Rinsing(String n) {
		super(n);
	}
	
	@Override
	public State doTransition() {
		Transition _transition = new Transition("ToSpinning");
		this.outgoings.add(_transition);
		return new Spinning("Spinning");
	}
}
