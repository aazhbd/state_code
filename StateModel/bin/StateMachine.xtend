import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class StateMachine {
	String label
	
	new(String name) {
		this.label = name
	}

}

@Accessors
class StateNode {
	StateMachine machine
	String label
	
	new() {
		this.machine = null
	}
}

@Accessors
class Transition {
	String label
	StateNode start
	StateNode end
}

