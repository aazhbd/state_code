import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class ComplexState extends State {
  public List<Vertex> subVertex = new ArrayList<Vertex>();
  
  public ComplexState(final String n) {
    super(n);
  }
  
  @Pure
  public List<Vertex> getSubVertex() {
    return this.subVertex;
  }
  
  public void setSubVertex(final List<Vertex> subVertex) {
    this.subVertex = subVertex;
  }
}
