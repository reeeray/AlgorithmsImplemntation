package geekAlgorithms.homeTasks;

/**
 * Created by Григорий on 10.12.2017.
 */
public class MyRandom {

    private static int X_prev = 3366;
    private static final int A = 13;
    private static final  int B = 51;
    private static int M = 17;

    public static MyRandom myInstance = new MyRandom();

    public static MyRandom getInstance () {return myInstance;}

    private MyRandom () {}

    public int myRand () {
        int X_next = (A + B*X_prev)%M;
        X_prev = X_next;
        M = X_next*M;
        return X_next;
    }
}
