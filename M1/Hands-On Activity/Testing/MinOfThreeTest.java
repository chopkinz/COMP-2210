import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinOfThreeTest {


   
   /** test for min1. **/
   @Test public void min1Test() {
      int expected = 1
      int actual = MinOfThree.min1(3, 1, 2);
      assertEquals(expected, actual);
   }
    
      /** A test for min2() method. **/
   @Test public void min2Test() {
      int expected = 1;
      int actual = MinOfThree.min2(3, 1, 2);
      assertEquals(expected, actual);
   }
      
}
