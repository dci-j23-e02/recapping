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

    System.out.println(factorial(5));
  }

  public static int factorial(int n){
    if(n == 1){
      return 1;
    }else{
      return (n * factorial(n - 1));
      // Wrong: return  factorial(n);
    }
  }
}
