class WashingMachine {
	State state

	new() {
		state = new Washing("Washing")
	}

	def doTransition() {
		state = state.doTransition();
	}

	def String getStatus() {
		return this.state.getName
	}
}

class Machine {
	def static void main(String[] args) {
		println("Start Generation")
		var sg = new StateGenerator()

		sg.writeToFile("Washing", "Rinsing")
		sg.writeToFile("Rinsing", "Spinning")
		sg.writeToFile("Spinning", "END")

		println("Finished Generation")
	}
}
