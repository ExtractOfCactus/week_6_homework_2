import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  AnalogCamera analogCamera1;
  AnalogCamera analogCamera2;
  DigitalCamera digitalCamera1;
  DigitalCamera digitalCamera2;


  @Before
  public void before() {
    photographer = new Photographer("Frank");
    analogCamera1 = new AnalogCamera("Kodak, plastic and disposable.");
    analogCamera2 = new AnalogCamera("Evian, red-eye removal, disposable.");
    digitalCamera1 = new DigitalCamera("Nikon, sharp focus, high-end.");
    digitalCamera2 = new DigitalCamera("Fukishima, shake-elimination, paneramic abilites.");
    // journal1 = new HashMap<String, Integer>();
  }

  @Test
  public void hasName() {
    assertEquals("Frank", photographer.getName());
  }

  @Test 
  public void camerasIsEmpty() {
    assertEquals(0, photographer.camerasCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(analogCamera1);
    assertEquals(1, photographer.camerasCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(analogCamera2);
    photographer.addCamera(digitalCamera1);
    photographer.removeCamera();
    assertEquals(1, photographer.camerasCount());
  }

  @Test
  public void cameraHasDetails() {
    assertEquals("Nikon, sharp focus, high-end.", digitalCamera1.printDetails());
  }

  @Test
  public void canGetDetailsOfWholeCameraCollection() {
    photographer.addCamera(analogCamera1);
    photographer.addCamera(analogCamera2);
    photographer.addCamera(digitalCamera1);
    photographer.addCamera(digitalCamera2);
    String expected = "Kodak, plastic and disposable. Evian, red-eye removal, disposable. Nikon, sharp focus, high-end. Fukishima, shake-elimination, paneramic abilites. ";
    assertEquals(expected, photographer.cameraDetails());
  }

  @Test
  public void canAddKeyValuePairsToJournal() {
    photographer.addJournalEntry("Monday", 3);
    assertEquals(1, photographer.countJournalEntries());
  }

  @Test
  public void canGetNumberOfPhotos() {
    photographer.addJournalEntry("Monday", 3);
    photographer.addJournalEntry("Tuesday", 2);
    photographer.addJournalEntry("Wednesday", 6);
    assertEquals(11, photographer.numberOfPhotos());
  }

}