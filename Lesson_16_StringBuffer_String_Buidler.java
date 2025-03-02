public class Lesson_16_StringBuffer_String_Buidler {
  public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("Hello World");
    System.out.println(sb.capacity()); // capacity method returns the capacity of the string buffer. It gives us 16
                                       // character capacity. It also gives us additional space to store value. Because
                                       // string buffer is mutatble
                                       
  }

}
