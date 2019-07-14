package math;
// 204
public class countPrime {
	public int countPrimes(int n) {
		int count = 0;
		boolean[] notPrime = new boolean[n];
		
		for(int i = 2; i < n; i++) {
			for(int j = 2; i * j < n; j++) {
				notPrime[i * j] = true; // For a prime number, the multiple of it is not prime
				// For 2, we mark 4, 6, 8 as notPrime
				// For 3, we mark 6, 9 as notPrime
				// For 4, we mark 8 as notPrime
				// Iterate the array and count the times of true 
			}
			if(notPrime[i] == false)
				count++;
		}
		
		return count;
	}
}
