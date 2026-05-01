package initialization;//: initialization/ArrayInit.java
// Array initialization.
import java.util.*;

public class ArrayInit {
  public static void main(String[] args) {
    Integer[] a = {
      Integer.valueOf(1),
      Integer.valueOf(2),
      3, // Autoboxing
    };
    Integer[] b = new Integer[]{
      Integer.valueOf(1),
      Integer.valueOf(2),
      3, // Autoboxing
    };
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
} /* Output:
[1, 2, 3]
[1, 2, 3]
*///:~
