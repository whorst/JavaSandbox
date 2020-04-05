package ChallengeProblems.Prime;

public class Prime {
    //        ArrayList<Integer> prime = new ArrayList();
//        prime.add(2);
//        prime.add(3);
//        int focusNumer = prime.get(1);
//
//
//        while(prime.size()<100){
//            focusNumer = focusNumer+1;
//            boolean isPrime = checkIfPrime(focusNumer, prime);
//            if (isPrime){
//                    prime.add(focusNumer);
//            }
//        }
//        System.out.println(prime);
//    }
//
//    public static boolean checkIfPrime(int number, ArrayList<Integer> prime){
//        int primeLength = prime.size();
//        int x = primeLength-1;
//        while(x>=0) {
//            if (number % prime.get(x)==0) {
//                return false;
//            }
//            x--;
//        }
//        return true;
    // }

    private static void getNPrimes(int nPrimes) {
        int [] primeArray = {nPrimes};
        primeArray[0] = 2;
        primeArray[1] = 3;
        for( int primesFound = 2; primesFound <= nPrimes;){
            int focusNumber = primeArray[primesFound-1];
            int factors = 0;
            for(int i = primesFound-1; i>=1; i--){
                if(focusNumber % primeArray[i] == 0){
                    factors+=1;
                }
                if(factors ==0){
                    primesFound++;
                }
            }
        }
    }

}
