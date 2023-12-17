class PrimeCalculator {

    int nth(int nth) {
        if(nth<=0){
            throw new IllegalArgumentException();
        }
       int count=0;
        int element=1;

        while(count!=nth){
            element++;
               if(isPrime(element)){
                   count++;
               }
        }
        return element;
    }

    private static boolean isPrime(int element) {

        if(element<=1){
            return false;
        }
        for(int i=2;i<=element/2;i++){
            if(element%i==0){
                return false;
            }
        }
        return true;
    }

}
