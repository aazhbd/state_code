import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Machine {
  public static void main(final String[] args) {
    InputOutput.<String>println("Start Generation");
    StateGenerator sg = new StateGenerator();
    sg.writeToFile("Washing", "Rinsing");
    sg.writeToFile("Rinsing", "Spinning");
    sg.writeToFile("Spinning", "END");
    InputOutput.<String>println("Finished Generation");
  }
}
