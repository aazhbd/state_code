import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Pseudostate extends State {
  public PseudostateKind kind;
  
  public Pseudostate(final PseudostateKind k) {
    super(k.toString());
    this.kind = k;
  }
  
  @Pure
  public PseudostateKind getKind() {
    return this.kind;
  }
  
  public void setKind(final PseudostateKind kind) {
    this.kind = kind;
  }
}
