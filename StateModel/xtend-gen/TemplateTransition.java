import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemplateTransition {
  public CharSequence generateHTML(final Transition tn) {
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
    String _label = tn.getLabel();
    _builder.append(_label, "\t");
    _builder.append(" Transition connecting ");
    String _label_1 = tn.getStart().getLabel();
    _builder.append(_label_1, "\t");
    _builder.append(" state to ");
    String _label_2 = tn.getEnd().getLabel();
    _builder.append(_label_2, "\t");
    _builder.append(" state.</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
