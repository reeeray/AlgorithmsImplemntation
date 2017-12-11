package geekAlgorithms.theoryAndRealization;

/**
 * Created by Григорий on 11.12.2017.
 */
public class PopularSortedAlgorithms {

    public static PopularSortedAlgorithms myInstance = new PopularSortedAlgorithms();

    public static PopularSortedAlgorithms getInstance () {return myInstance;}

    private PopularSortedAlgorithms () {}

    public int [] bubbleSort (int [] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        return arr;
    }

}
