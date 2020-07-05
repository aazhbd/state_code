import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    final StateMachine sm = new StateMachine("Washing Machine");
    InputOutput.<String>println("State Diagram Editor");
  }
}
