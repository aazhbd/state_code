import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Statemachine {
  public String statemachineName;
  
  public List<Vertex> vertex = new ArrayList<Vertex>();
  
  public List<Transition> transitions = new ArrayList<Transition>();
  
  public List<Action> actions = new ArrayList<Action>();
  
  @Pure
  public String getStatemachineName() {
    return this.statemachineName;
  }
  
  public void setStatemachineName(final String statemachineName) {
    this.statemachineName = statemachineName;
  }
  
  @Pure
  public List<Vertex> getVertex() {
    return this.vertex;
  }
  
  public void setVertex(final List<Vertex> vertex) {
    this.vertex = vertex;
  }
  
  @Pure
  public List<Transition> getTransitions() {
    return this.transitions;
  }
  
  public void setTransitions(final List<Transition> transitions) {
    this.transitions = transitions;
  }
  
  @Pure
  public List<Action> getActions() {
    return this.actions;
  }
  
  public void setActions(final List<Action> actions) {
    this.actions = actions;
  }
}
