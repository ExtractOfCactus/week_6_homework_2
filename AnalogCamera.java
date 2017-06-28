class AnalogCamera implements Printable {
  private String details;

  public AnalogCamera(String details) {
    this.details = details;
  }

  public String printDetails() {
    return details;
  }

}