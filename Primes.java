public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n+1];
        int count = 0;
        for (int i = 0; i < (n + 1); i++) {
            if (i < 2) isPrime [i] = false;
            else isPrime[i] = true;
        }
        int p = 2;
        while (p < Math.sqrt(n)){
            if (isPrime[p]) {
            for (int i = p*p; i < (n + 1); i += p) {
                    isPrime[i] = false;
                }
            } 
            p++;
            
        }
        System.err.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < (n + 1); i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        int prec = (count*100)/n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + prec + "% are primes)");
        
    }
}