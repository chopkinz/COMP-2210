import java.util.Iterator;

/**
* driver class.
* @author Chase Hopkins 
* @version 2021-06-29
*/
public class LinkedSetMain {
 
   public static void main(String[] args) {
   
      LinkedSet<Integer> set = new LinkedSet<Integer>();
      
      set.add(100);
      
      set.add(1);
      set.add(2);
      set.add(3);
      
      set.remove(1);
      
      Iterator<Set<Integer>> powerSet = set.powerSetIterator();
      
      while(powerSet.hasNext()) {
         System.out.print(powerSet.next());
      }
   }
}