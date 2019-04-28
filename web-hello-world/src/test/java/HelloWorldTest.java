import org.junit.Test;
import static org.junit.Assert.*;
 
public class HelloWorldTest {
  @Test
  public void HelloWorldTest() {
      HelloWorld h = new HelloWorld();
      String str = "World";
      System.out.println("Test called" );
 
      assertEquals(str, h.Hello(str));
  }
}
