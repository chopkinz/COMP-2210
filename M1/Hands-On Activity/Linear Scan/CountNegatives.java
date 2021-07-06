/**
 * Applies the linear scan strategy to counting the number of negative
 * values in an array.
 */
public class CountNegatives {
   /**
    * Returns the number of negative values in the given array.
    * @return returns amount of negative values in array. 
    * @param a represents the array.  
    */
   public static int countNegatives(int[]a) {
      
      int negativeCount = 0; // initializes counter to zero
      
      for (int i = 0; i < a.length; i++) // for each element in the array 
      {
         if (a[i] < 0) // if current element is less than zero 
         {
            negativeCount += 1; // adds one
         }
      }
      return negativeCount; // returns amount of negative values in the array
   }
}