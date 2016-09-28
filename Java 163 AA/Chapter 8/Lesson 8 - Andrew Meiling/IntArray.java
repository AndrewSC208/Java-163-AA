/* Filename StudentIdArray.java */
/* Written by Andrew Meiling */
/* Written on April 16th, 2014 */
/* Chapter 8 */
/* Exercise # 1 */
/* Pg 376 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

public class IntArray {
  public static void main(String[]args) {
    //variables
    int x;
    int y;

    // array
    String[] familyName = {"Andrew", "Brittany", "Gary", "Gayle"};
    // start from beginning to end:
    for(x = 0; x < familyName.length; ++x) {
      System.out.println(familyName[x]);
    }

    // start from end to beginning:
    y = familyName.length;
    for(y = familyName.length  - 1; y > 0; --y) {
      System.out.println(familyName[y]);
    }
  }
}
