public class Random {

   public static Object min(Object[] a) {
      Object min = a[0];
      for (Object value: a) {
         if (value.compareTo(min) < 0) {
            min = value;
         }
      }
   
      return min;
   }
}