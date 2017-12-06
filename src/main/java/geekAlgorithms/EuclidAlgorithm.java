package geekAlgorithms;

/**
 * Created by Григорий on 05.12.2017.
 */

/**
 * <strong>Класс - синглтон, который содержит два метода определяющих наибольший общий делитель</strong>
 * <p><b>Алгоритм Евклида</b></p>
 *@author Grigory Shein
*/
public class EuclidAlgorithm {

    public static EuclidAlgorithm myInstatnce = new EuclidAlgorithm();

    public static EuclidAlgorithm getInstatnce () {return myInstatnce;}

    private EuclidAlgorithm () {}

    public int simpleEuclid (int a, int b) {
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }

    public int fastEuclid (int a, int b) {
        while(b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return a;
    }
}
