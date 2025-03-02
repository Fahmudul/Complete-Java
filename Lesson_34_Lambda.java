@FunctionalInterface
interface FinalMethod {
  void doSomeThing();
}

@FunctionalInterface
interface AnotherFinalMethod {
  void doSomeThing(int t);
}

public class Lesson_34_Lambda {
  public static void main(String args[]) {
    /*
     * What is lambda expression?
     * before jump into that. Lets learn about annotation first.
     * Annotation is a form of syntactic metadata that can be added to Java source
     * code.
     * It is used by the compiler to provide additional information about the code.
     * Annotations are typically used to provide information about the code to the
     * compiler.
     * For example, the @Override annotation can be used to indicate that a method
     * is overriding
     * a parent class method. The @Deprecated annotation can be used to indicate
     * that a class or
     * method is no longer in use and should not be used.
     * Annotations can also be used to provide information about the code to the
     * JVM.
     * For example, the @SuppressWarnings annotation can be used to suppress certain
     * warnings
     * that the compiler might otherwise generate.
     * 
     * Example:
     * public class MyClass {
     * 
     * @Override
     * public String toString() {
     * // code
     * }
     * 
     * @Deprecated
     * public void myMethod() {
     * // code
     * }
     * }
     * 
     * We learned about interface. There are one annotation
     * called @FunctionalInterface.
     * this means an interface can only have one method. And we can use lambda only
     * in Functional
     * interface.
     * 
     */
    FinalMethod F = new FinalMethod() {
      public void doSomeThing() {
        System.out.println("Hello World do");
      }
    };
    F.doSomeThing();
    // Another way to do this

    AnotherFinalMethod F_2 = (t) -> System.out.println("Hello World do 2" + t);
    // Here -> is the lambda expression. we can take paramter as well
    // here we are reducing the code. we don't have to pass the variable name since
    // we are using lambda expression. if our code has multiple line then we have to
    // use curly braces and inside that we will use return keyword. since our code
    // just printing one line we just using -> which also a return statement
  }

}
