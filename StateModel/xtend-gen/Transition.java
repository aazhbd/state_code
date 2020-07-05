import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Transition {
  private String label;
  
  private StateNode start;
  
  private StateNode end;
  
  @Pure
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(final String label) {
    this.label = label;
  }
  
  @Pure
  public StateNode getStart() {
    return this.start;
  }
  
  public void setStart(final StateNode start) {
    this.start = start;
  }
  
  @Pure
  public StateNode getEnd() {
    return this.end;
  }
  
  public void setEnd(final StateNode end) {
    this.end = end;
  }
}
