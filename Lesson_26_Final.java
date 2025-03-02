public class Lesson_26_Final {
  public static void main(String args[]) {
    /*
     * Final Keyword
     * The final keyword is used to declare a variable as final(constant), which
     * means it cannot be changed after initialization.
     * We can use final for vairable, class, methods.
     * lets see an example:
     * 
     */

    final int x = 10;
    // x = 20; // ! This is incorrect because x is a final variable.
    final class FinalClass {
      public void show() {
        System.out.println("hallo");
      }
    }

    // Inheritance -- Final keyword usage with clas
    class FinalChild extends FinalClass { // ! This is incorrect because FinalClass is a final class. In other words we
                                          // are peventing inheritance. Like we don't want to share my property to
                                          // anyone 😁

      public void show() {
        System.out.println("hallo siam");
      }
    }

    class newFinalClass {
      public void show() {
        System.out.println("hallo check");
      }

      public final void show1() {
        System.out.println("hallo check 2");
      }
    }

    class newFinalChild extends newFinalClass {
      // This is correct because we haven't use final keyword for the show method in
      // newFinalClass
      public void show() {
        System.out.println("hallo siam");
      }

      // ❌ this is incorrect because we have used final keyword for the show1 method
      // in newFinalClass
      public void show1() {
        System.out.println("hallo siam 2");
      }

    }
  }

}
