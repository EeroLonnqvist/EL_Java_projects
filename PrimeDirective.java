import java.util.ArrayList;
class PrimeDirective {
  public boolean isPrime(int number) {
    if (number==2) {
      return true;
    }
    else if (number<2) {
      return false;
    }
    for (int i=2; i<number; i++) {
      if (number%i==0) {
        return false;
      }
    }
    return true;
  }
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
  public ArrayList<Integer> evenOrOdd(int[] numbers, String choice) {
    ArrayList<Integer> evenorodd = new ArrayList<Integer>();
    for (int number : numbers){
      if (number%2==0 && choice=="Even") {
        evenorodd.add(number);
      }
      else if (number%2==1 && choice=="Odd") {
        evenorodd.add(number);
      }
    }
    return evenorodd;
  }
  public ArrayList<Integer> firstNPrimes(int[] numbers, int n) {
    ArrayList<Integer> firstnprimes = new ArrayList<Integer>();
    for (int number : numbers){
      if (isPrime(number) && firstnprimes.size()<n) {
        firstnprimes.add(number);
      }
    }
    return firstnprimes;
  }
  public ArrayList<Integer> firstNFibonacciNumbers(int n) {
    ArrayList<Integer> firstnfibonaccinumbers = new ArrayList<Integer>();
    firstnfibonaccinumbers.add(0);
    firstnfibonaccinumbers.add(1);
    if (n==1) {
      firstnfibonaccinumbers.remove(1);
      return firstnfibonaccinumbers;
    }
    else if (n==2) {
      return firstnfibonaccinumbers;
    }
    for (int i=3; i<=n; i++) {
      int nextelement = firstnfibonaccinumbers.get(firstnfibonaccinumbers.size()-1)+firstnfibonaccinumbers.get(firstnfibonaccinumbers.size()-2);
      firstnfibonaccinumbers.add(nextelement);
    }
    return firstnfibonaccinumbers;
  }

  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
		System.out.println(pd.firstNFibonacciNumbers(10));
  }  

}
