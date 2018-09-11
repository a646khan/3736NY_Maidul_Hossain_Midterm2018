package math.problems;

 class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int a = 1000000;
		System.out.println("List of Prime numbers from 2 to 1 million : ");
		PrimeNumber b = new PrimeNumber();
		b.primeNumbers(a);
	}

	public void primeNumbers(int a)
	{
		boolean prime[] = new boolean[a+1];
		for(int i = 0; i < a; i++)
			prime[i] = true;

		for(int c = 2; c*c <= a; c++)
		{
			if(prime[c] == true)
			{
				for(int i = c*2; i <= a; i += c)
					prime[i] = false;
			}
		}

		for(int i = 2; i <= a; i++)
		{
			if(prime[i] == true)
				System.out.println(i + " ");
		}
	}
}
