import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Action {
  public String trigger;
  
  @Pure
  public String getTrigger() {
    return this.trigger;
  }
  
  public void setTrigger(final String trigger) {
    this.trigger = trigger;
  }
}
