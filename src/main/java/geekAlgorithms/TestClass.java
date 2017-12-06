package geekAlgorithms;

public class TestClass {

    public static void main (String ... args) {
        int a = 8;
        int b =3;
        a-=b;
        System.out.println(a);
        System.out.println(EuclidAlgorithm.getInstatnce().simpleEuclid(18, 12));
        System.out.println(EuclidAlgorithm.getInstatnce().fastEuclid(18, 12));
    }
}
