package geekAlgorithms;

import sun.util.calendar.Era;

public class TestClass {

    public static void main (String ... args) {
        int a = 8;
        int b =3;
        a-=b;
        System.out.println(a);
        System.out.println(EuclidAlgorithm.getInstatnce().simpleEuclid(18, 12));
        System.out.println(EuclidAlgorithm.getInstatnce().fastEuclid(18, 12));
        System.out.println(ChangeSystemOfCalculation.getInstance().getNumberInAnotherSystem(2,16));
        System.out.println(QuickPow.rand.nextInt(6));
        System.out.println(QuickPow.secureRandom.nextInt(6));
        for(int i=1; i<10; i++) {
            System.out.println("---------"+i+"------------");
        }

        System.out.print("Eratosfen : ");
        EratosfenAlg.myInstance.eratosfenSieve(23);
        System.out.println("\n");
    }
}
