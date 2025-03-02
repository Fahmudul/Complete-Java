
public class Lesson_16_String {
  public static void main(String args[]) {
    // Strings in Java. Strings are immutable. When you try to mutate(change) the
    // original value of a string variable. It doesn't change the value rather a new
    // string is created in side the heap memory. 
    /*
     * |   siam  | 101
     * |   hallo | 102
     * |   hallo siam  | 103
     * |   siam  | 101
     * |         | 
     * |         |
     * |         |
     * 
     * here I'm creating a string variable.
     * String var1 = "siam"; which has memory address of 101 (heap)
     * String var2 = "hallo"; which has memory address of 102 (heap)
     * String var3 = "hallo siam"; which has memory address of 103 (heap)
     * --- Now if we try to change the value of var1 to "hallo" then it will not change the value of var1 rather it will just point to the memory address of 102 (heap). why this memory address because at this memory "hallo" is already present. Here java saving the usages of additional memory. If "hallo" wasn't asssigned to any location. Then a new memory will be created for "hallo" and var1 will point to it. 101 will not be the memory address of var1 any more. And in upcoming time location 101 will be removed. ---
     * 
     */
  }
}
