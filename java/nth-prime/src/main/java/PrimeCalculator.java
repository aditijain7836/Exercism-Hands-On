class PrimeCalculator {

    int nth(int nth) {
        int PrimeCount = 0, i, flag, prime = 1;
        if(nth == 0)
        {
            throw new IllegalArgumentException();
        }
        
         while (nth != PrimeCount)
         {
            flag = 0;
            prime++;
            for (i = 2; i <= (prime / 2); i++)
            {
                if (prime % i == 0)
                    flag = 1;
            }

            if (flag == 0) {
                PrimeCount++;
            }
        }
        return prime;
    }

}
