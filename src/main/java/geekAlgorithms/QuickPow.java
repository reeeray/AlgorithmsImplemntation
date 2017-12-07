package geekAlgorithms;

public class QuickPow {
    public static QuickPow myInstatnce = new QuickPow();

    public static QuickPow getInstance () {return myInstatnce;}

    private QuickPow () {}

    public long pow (int a, int b) {
        int res = 1;
        while(b>0) {
            if (b % 2 == 0) {
                a *= a;
                b /= 2;
            } else {
                res *= a;
                b--;
            }
        }
        return res;
    }
}
