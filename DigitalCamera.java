class DigitalCamera extends Camera implements Printable {
  private String details;

  public DigitalCamera(String details) {
    this.details = details;
  }

  public String printDetails() {
    return this.details;
  }

}