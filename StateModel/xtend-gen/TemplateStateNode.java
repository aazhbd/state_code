import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemplateStateNode {
  public CharSequence generateHTML(final StateNode sn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>Template for State</title>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<p>Name: ");
    String _label = sn.getLabel();
    _builder.append(_label, "\t");
    _builder.append(" State.</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      StateMachine _machine = sn.getMachine();
      boolean _tripleNotEquals = (_machine != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("<p>It is a complex state containing: ");
        String _label_1 = sn.getMachine().getLabel();
        _builder.append(_label_1, "\t");
        _builder.append(".</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
