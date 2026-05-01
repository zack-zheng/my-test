package initialization;//: initialization/AutoboxingVarargs.java

public class AutoboxingVarargs {
  public static void f(Integer... args) {
    for(Integer i : args)
      System.out.print(i + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    f(Integer.valueOf(1), Integer.valueOf(2));
    f(4, 5, 6, 7, 8, 9);
    f(10, Integer.valueOf(11), 12);
  }
} /* Output:
1 2
4 5 6 7 8 9
10 11 12
*///:~
