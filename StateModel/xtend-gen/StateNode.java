import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class StateNode {
  private StateMachine machine;
  
  private String label;
  
  public StateNode() {
    this.machine = null;
  }
  
  @Pure
  public StateMachine getMachine() {
    return this.machine;
  }
  
  public void setMachine(final StateMachine machine) {
    this.machine = machine;
  }
  
  @Pure
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(final String label) {
    this.label = label;
  }
}
