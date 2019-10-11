*/FizzBuzz program
  Prints numbers from 1 to 100 with the following exceptions:
   For multiples of 3, prints Fizz instead of the number
	 For multiples of 5, prints Buzz instead of the number
   For multiples of both 3 and 5, prints FizzBuzz instead of the number
*/
class FizzBuzz{
  public static void main(String[] args) {
    for (int i=1; i<=100; i++ ) {
      if (i%15==0) {
        System.out.println("FizzBuzz");
      }
      else if (i%5==0) {
        System.out.println("Buzz");
      }
      else if (i%3==0) {
        System.out.println("Fizz");
      }
      else {
        System.out.println(i);
      }
    }
  }
}
