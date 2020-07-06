import com.google.common.base.Objects;
import java.io.PrintWriter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class StateGenerator {
  public CharSequence generateState(final String name, final String next) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(name);
    _builder.append(_firstUpper);
    _builder.append(" extends State {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(name);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(String n) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(n);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State doTransition() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Transition _transition = new Transition(\"To");
    String _firstUpper_2 = StringExtensions.toFirstUpper(next);
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.outgoings.add(_transition);");
    _builder.newLine();
    {
      String _upperCase = next.toUpperCase();
      boolean _notEquals = (!Objects.equal(_upperCase, "END"));
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("return new ");
        String _firstUpper_3 = StringExtensions.toFirstUpper(next);
        _builder.append(_firstUpper_3, "\t\t");
        _builder.append("(\"");
        String _firstUpper_4 = StringExtensions.toFirstUpper(next);
        _builder.append(_firstUpper_4, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t");
        _builder.append("return new Pseudostate(PseudostateKind.Final);");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String writeToFile(final String stateName, final String nextState) {
    String _xtrycatchfinallyexpression = null;
    try {
      PrintWriter out = new PrintWriter((("xtend-gen/" + stateName) + ".java"));
      out.print(this.generateState(stateName, nextState));
      out.close();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        String _plus = ("error: " + _message);
        _xtrycatchfinallyexpression = InputOutput.<String>println(_plus);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
