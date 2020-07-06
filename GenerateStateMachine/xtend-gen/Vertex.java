import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class Vertex {
  public List<Transition> outgoings = new ArrayList<Transition>();
  
  public List<Transition> incomings = new ArrayList<Transition>();
  
  @Pure
  public List<Transition> getOutgoings() {
    return this.outgoings;
  }
  
  public void setOutgoings(final List<Transition> outgoings) {
    this.outgoings = outgoings;
  }
  
  @Pure
  public List<Transition> getIncomings() {
    return this.incomings;
  }
  
  public void setIncomings(final List<Transition> incomings) {
    this.incomings = incomings;
  }
}
