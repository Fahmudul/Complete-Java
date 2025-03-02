class Sample {
  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class Lesson_18_Encapsulation {
  public static void main(String args[]) {
    Sample s = new Sample();
    s.setAge(1);
    s.setName("Fahmudul");
    System.out.println(s.getAge());
    System.out.println(s.getName());
  }
}
