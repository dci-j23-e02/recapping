package methods.recursion;

public class Main {

  public static void main(String[] args) {
    /**
     * Factorial of a number:
     * f(5) '5!' = 120
     * 5 * '24'(5-1)!
     *    4 * '6'(4-1)!
     *        3 * '2' (3-1)!
     *            2 * '1' (2-1)!
     *                1
     * f(n) 'n!' = 1*.....*n
     * */

    // System.out.println(factorial(5));

    towerOfHanoi(4,"A","B","C");
  }

  public static int factorial(int n){
    if(n == 1){ // base case
      return 1;
    }else{
      return (n * factorial(n - 1));
      // Wrong: return  factorial(n);
    }
  }
/**
 * if(n>0){
 *   towerOfHanoi(n-1, A, C, B)
 *    System.out.println("Move a disc from %s to %s, A, C);
 *    towerOfHanoi(n-1, B, A, C)
 * }
 *
 * towerOfHanoi(3, "A", "B", "C"):
 *      towerOfHanoi(2, "A","C", "B"):
 *      "Move a disc from 'A' to 'C'"
 *      towerOfHanoi(2, "B", "A", "C"):
 *
 *
 *
 *
 * */


  public static void towerOfHanoi(int n, String A, String B, String C){
    /*
    if(n>0){
      towerOfHanoi(n-1, A, C, B);
      System.out.printf("Move a disc from %s to %s",A,C);
      towerOfHanoi(n-1, B, A, C);
    }else{
      System.out.println(" ");
      return;
    }
*/
    // towerOfHanoi(2, "A", "B", "C")
    if(n == 1){ // base case
      System.out.printf("Move a disc from %s to %s",A,C);
      return;
    }else{
      towerOfHanoi(n-1, A, C, B); //  towerOfHanoi(1, "A", "C", "B");

      System.out.printf("Move a disc from %s to %s",A,C);
      towerOfHanoi(n-1, B, A, C); //  towerOfHanoi(1, "B", "A", "C");
    }
  }
}
