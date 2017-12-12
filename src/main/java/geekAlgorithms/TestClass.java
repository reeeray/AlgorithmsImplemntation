package geekAlgorithms;

import geekAlgorithms.theoryAndRealization.*;

import java.util.Arrays;

public class TestClass {

    public static int [] array1 = {4, 1, 6, 3,8,14,7,24};
    public static int [] array2 = {4, 5, 6, 3,8,1,7,13,24};
    public static int [] array3 = {13, 11, 1, 3,8,4,7,24, 14};

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
        System.out.println("Sorted by bubble is " + Arrays.toString(PopularSortedAlgorithms.getInstance().bubbleSort(array3)));
        System.out.println("Recursion pow : " + QuickPow.getInstance().recursionPow(2,5));
        System.out.println("Sorted by choosen is " + Arrays.toString(PopularSortedAlgorithms.getInstance().choosenSort(array2)));
        System.out.println("Sorted by shake is " + Arrays.toString(PopularSortedAlgorithms.getInstance().shakeSort(array1)));
    }
}
