import java.util.ArrayList;

public class Photographer {
  private ArrayList<Camera> cameras;

  public Photographer() {
    this.cameras = new ArrayList<Camera>();
  }

  public int camerasCount() {
    return cameras.size();
  }

  public void addCamera(Camera camera) {
    cameras.add(camera);
  }
}