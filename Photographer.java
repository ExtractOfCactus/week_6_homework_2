import java.util.ArrayList;
import java.util.HashMap;

public class Photographer {
  private String name;
  private ArrayList<Printable> cameras;
  private HashMap<String, Integer> journal;


  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
  }

  public String getName() {
    return this.name;
  }

  public int camerasCount() {
    return cameras.size();
  }

  public void addCamera(Printable camera) {
    cameras.add(camera);
  }

  public void removeCamera() {
    if (camerasCount() > 0) {
      cameras.remove(0);
    }
  }

  public String cameraDetails() {
    String allDetails = "";
    for (Printable camera : this.cameras) {
      allDetails += camera.printDetails() + " ";
    }
    return allDetails;
  }

  public void addJournalEntry(String string, Integer num) {
    journal.put(string, num);
  }

  public int countJournalEntries() {
    return journal.size();
  }

  public int numberOfPhotos() {
    int totalPhotos = 0;
    for (int values : this.journal.values()) {
      totalPhotos += values;
    }
    return totalPhotos;
  }
}