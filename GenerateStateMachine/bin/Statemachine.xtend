import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Statemachine {
	public String statemachineName

	public List<Vertex> vertex = new ArrayList<Vertex>()

	public List<Transition> transitions = new ArrayList<Transition>()

	public List<Action> actions = new ArrayList<Action>()
}

@Accessors
abstract class Vertex {
	public List<Transition> outgoings = new ArrayList<Transition>()
	public List<Transition> incomings = new ArrayList<Transition>()

}

@Accessors
class State extends Vertex {
	public String name

	new(String n) {
		this.name = n
	}

	def doTransition() {
		return this
	}

}

@Accessors
class Pseudostate extends State {
	public PseudostateKind kind

	new(PseudostateKind k) {
		super(k.toString())
		kind = k
	}

}

enum PseudostateKind {
	Initial,
	Final
}

@Accessors
class ComplexState extends State {
	public List<Vertex> subVertex = new ArrayList<Vertex>()

}

@Accessors
class Transition {
	String name

	new(String n) {
		name = n
	}
}

@Accessors
class LabelTransition extends Transition {
	public List<Action> action = new ArrayList<Action>()
}

@Accessors
class Action {
	public String trigger
}
