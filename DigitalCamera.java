class DigitalCamera implements Printable {
  private String details;

  public DigitalCamera(String details) {
    this.details = details;
  }

  public String printDetails() {
    return details;
  }

}