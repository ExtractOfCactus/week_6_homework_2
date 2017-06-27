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
    analogCamera1 = new AnalogCamera("Kodak, plastic and disposable");
    analogCamera2 = new AnalogCamera("Evian, red-eye removal, disposable");
    digitalCamera1 = new DigitalCamera("Nikon, sharp focus, high-end");
    digitalCamera2 = new DigitalCamera("Fukishima, shake-elimination, paneramic abilites");
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

}