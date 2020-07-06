public class Washing extends State {
	public Washing(String n) {
		super(n);
	}
	
	@Override
	public State doTransition() {
		Transition _transition = new Transition("ToRinsing");
		this.outgoings.add(_transition);
		return new Rinsing("Rinsing");
	}
}
