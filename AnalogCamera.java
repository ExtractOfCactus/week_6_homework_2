class AnalogCamera extends Camera implements Printable {
  private String details;

  public AnalogCamera(String details) {
    this.details = details;
  }
  
  public String printDetails() {
    return this.details;
  }
}