public class Spinning extends State {
	public Spinning(String n) {
		super(n);
	}
	
	@Override
	public State doTransition() {
		Transition _transition = new Transition("ToEND");
		this.outgoings.add(_transition);
		return new Pseudostate(PseudostateKind.Final);
	}
}
