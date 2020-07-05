
public class Machine1 {
	
	private int state;
	
	private int numStates;
	private int numEvents;

	private int[][] transitions; 

	public Machine1(int numS, int numE) {
		state = 0;
		numStates = numS;
		numEvents = numE;	
		transitions = new int[numStates][numEvents];
		
		// initially all transitions point to state itself
		for (int i=0; i<numStates; i++) {
			for (int j=0; j<numEvents; j++) {
				transitions[i][j] = i;
			}
		}
	}
	
	public void setTransition(int state, int event, int nextState) {
		transitions[state][event] = nextState;
	}
	
	public void doTransition(int event) {
		state = transitions[state][event];
	}
	
	public int getState() {
		return state;
	}
	
	public static void main(String[] args) {
		 
		Machine1 myMachine = new Machine1(5,2);
		
		myMachine.setTransition(0, 0, 1);
		myMachine.setTransition(0, 1, 2);
		myMachine.setTransition(1, 0, 0);
		myMachine.setTransition(1, 1, 2);
		myMachine.setTransition(2, 1, 3);
		myMachine.setTransition(3, 0, 4);
		myMachine.setTransition(3, 1, 0);
		myMachine.setTransition(4, 0, 2);
		myMachine.setTransition(4, 1, 0);

		System.out.println(myMachine.getState());
		myMachine.doTransition(0);
		System.out.println(myMachine.getState());
		myMachine.doTransition(1);
		System.out.println(myMachine.getState());
		myMachine.doTransition(0);
		System.out.println(myMachine.getState());
		myMachine.doTransition(1);
		System.out.println(myMachine.getState());
		myMachine.doTransition(0);
		System.out.println(myMachine.getState());
		myMachine.doTransition(1);
		
		System.out.println(myMachine.getState());
	}
	
}
