import java.io.PrintWriter

class StateGenerator {
	def generateState(String name, String next) '''
		public class «name.toFirstUpper» extends State {
			public «name.toFirstUpper»(String n) {
				super(n);
			}
			
			@Override
			public State doTransition() {
				Transition _transition = new Transition("To«next.toFirstUpper»");
				this.outgoings.add(_transition);
				«IF next.toUpperCase != "END"»
					return new «next.toFirstUpper»("«next.toFirstUpper»");
				«ELSE»
					return new Pseudostate(PseudostateKind.Final);
				«ENDIF»
			}
		}
	'''

	def writeToFile(String stateName, String nextState) {
		try {
			var out = new PrintWriter("xtend-gen/" + stateName + ".java");
			out.print(generateState(stateName, nextState))
			out.close()

		} catch (Exception e) {
			println("error: " + e.message)
		}
	}

}
