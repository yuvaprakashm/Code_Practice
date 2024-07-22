package primeCheck;

public class PrimeCheck {
	public static void main(String[] args) {
		int num = 29;
		boolean isPrime = isPrime(num);
		System.out.println(num + " is prime: " + isPrime);
	}

	private static boolean isPrime(int num) {
		 if(num <= 2) {
			 return false;
		 }
		 for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		 
	}
}
