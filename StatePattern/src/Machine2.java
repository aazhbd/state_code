import machine.*;

public class Machine2 {
	
	private State state;
	
	public Machine2() {
		state = new Zero();
	}
		
	public void doTransition(int event) {
		
		if (event == 0)
			state = state.a();
		else if (event == 1)
			state = state.b();
	}
	
	public int getState() {
		
		if (state instanceof Zero)
			return 0;
		else if (state instanceof One)
			return 1;
		else if (state instanceof Two)
			return 2;
		else if (state instanceof Three)
			return 3;
		else if (state instanceof Four)
			return 4;
		
		return -1;
	}
	
	public static void main(String[] args) {
		 
		Machine2 myMachine = new Machine2();

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
