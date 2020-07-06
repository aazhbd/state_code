@SuppressWarnings("all")
public class WashingMachine {
  private State state;
  
  public WashingMachine() {
    Washing _washing = new Washing("Washing");
    this.state = _washing;
  }
  
  public State doTransition() {
    return this.state = this.state.doTransition();
  }
  
  public String getStatus() {
    return this.state.getName();
  }
}
