class OuterCLass {
  int age;

  public void showOuter() {
    System.out.println("inside outerclass show");
  }

  class InnerClass {
    public void showInner() {
      System.out.println("inside innerclass show");
    }
  }

  static class InnerClass_more {
    public void showInner() {
      System.out.println("inside innerclass show");
    }
  }
}

public class Lesson_30_InnerClass {

  public static void main(String[] args) {
    /*
     * Points to remember.
     * We can only use static keyword for inner class (Not outer class).
     */
    OuterCLass O = new OuterCLass();
    O.showOuter();
    // Now we want to call inner class method
    OuterCLass.InnerClass I = O.new InnerClass(); // This will throw an error. Because the InnerClass is inside
                                                  // OuterClass in other word it is nested. To access that we
                                                  // can use OuterClass.InnerClass .
    I.showInner();
    OuterCLass.InnerClass_more I_more = new OuterCLass.InnerClass_more(); // This is only work when the inner class is static. We don't have to create an instance of the innerClassMore.
  }

}
