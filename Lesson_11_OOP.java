
class Sample {
  private int a = 10;
  public int b = 20;

  public static int add(int a, int b) {
    // System.out.println(a + b);
    return a + b;
  }
}

public class Lesson_11_OOP {
  public static void main(String[] args) {
    Sample s = new Sample();

    System.out.println(s.add(3, 5));
  }
}
