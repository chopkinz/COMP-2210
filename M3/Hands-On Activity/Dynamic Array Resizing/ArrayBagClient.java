/**
 * ArrayBagClient.java
 * Provides a sample client of Bag behavior from
 * the ArrayBag class.
 *
 * @author Chase Hopkins (ceh0136@auburn.edu)
 * @version 2021-06-16
 *
 */
public class ArrayBagClient {
   /** Drives execution. */
   public static void main(String[] args) {
      Bag<Integer> bag = new ArrayBag<>();
      for (int i = 0; i < 18; i++) {
         bag.add(i);
      }
      for (int i = 0; i < 15; i++) {
         bag.remove(i);
      }
   
      System.out.println("Re-sized array --> " + bag);
   }
}