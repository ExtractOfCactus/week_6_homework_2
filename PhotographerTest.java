import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("Frank");
    camera = new Camera();
  }

  @Test
  public void hasName() {
    assertEquals("Frank", photographer.getName());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.camerasCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(camera);
    photographer.addCamera(camera);
    photographer.removeCamera();
    assertEquals(1, photographer.camerasCount());
  }

}