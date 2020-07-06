import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class LabelTransition extends Transition {
  public List<Action> action = new ArrayList<Action>();
  
  public LabelTransition(final String n) {
    super(n);
  }
  
  @Pure
  public List<Action> getAction() {
    return this.action;
  }
  
  public void setAction(final List<Action> action) {
    this.action = action;
  }
}
