package geekAlgorithms.theoryAndRealization;

/**
 * Created by Григорий on 06.12.2017.
 */
public class ChangeSystemOfCalculation {
    public static ChangeSystemOfCalculation myInstance = new ChangeSystemOfCalculation();

    public static ChangeSystemOfCalculation getInstance() {return myInstance;}

    private ChangeSystemOfCalculation() {}

    public int getNumberInAnotherSystem (int system, int number) {
        int lowRes = 0;
        int mid = number/system;
        if(mid > 0) {
            lowRes = ChangeSystemOfCalculation.myInstance.getNumberInAnotherSystem(system, mid);
        }
        int res = number%system;
        return lowRes*10 + res;
    }
}
