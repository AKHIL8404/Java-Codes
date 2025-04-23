package practice;
public class PrimeNumberRange{
  public static void main(String[] args){
    int range = 20;
    for(int i =2; i<=range; i++){
      if(isPrime(i)){
        System.out.print(i+" ");
      }
    }
  }
  public static boolean isPrime(int n){
    for(int i = 2; i <=Math.sqrt(n); i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
