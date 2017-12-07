package geekAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Григорий on 07.12.2017.
 */
public class EratosfenAlg {

    public static EratosfenAlg myInstance = new EratosfenAlg();

    public static EratosfenAlg getInstance () {return myInstance;}

    private EratosfenAlg () {}

    public void eratosfenSieve (int limit) {
        boolean[] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
        toPrint(primes);
    }

    public void toPrint (boolean [] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i])
                System.out.print(i + " ");
        }
    }
}
