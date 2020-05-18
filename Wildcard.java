package empat;

import java.util.Arrays;
import java.util.List;

public class Wildcard {
   public static void cetakSemua(List<?> list) {
      for (Object item : list)
         System.out.println(item + " ");
   }

   public static void main(String args[]) {
      List<Integer> integerList = Arrays.asList(1, 2, 3);
      cetakSemua(integerList);
      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
      cetakSemua(doubleList);
   }
}

