import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemplateStateMachine {
  public CharSequence generateHTML(final StateMachine sm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>Template for State Diagram</title>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<p>Name: ");
    String _label = sm.getLabel();
    _builder.append(_label, "\t");
    _builder.append(" StateMachine.</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
