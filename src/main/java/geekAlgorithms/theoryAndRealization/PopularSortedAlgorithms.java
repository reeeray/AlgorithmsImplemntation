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

    public int [] choosenSort (int [] arr) {
        int min =0;
        for(int i=0; i<arr.length-1; i++) {
            min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            if(i!=min) {
                arr[i] = arr[i] ^ arr[min];
                arr[min] = arr[i] ^ arr[min];
                arr[i] = arr[i] ^ arr[min];
            }
        }
        return arr;
    }

    public int [] shakeSort (int [] arr) {
        int left = 0;
        int right = arr.length-1;
        do {
            for (int i = left; i < right; i++) {
                 if(arr[i]>arr[i+1]){
                     arr[i]=arr[i]^arr[i+1];
                     arr[i+1]=arr[i]^arr[i+1];
                     arr[i]=arr[i]^arr[i+1];
                 }
            }
            right--;
            for (int j=right; j>left; j--){
                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
            left++;
        }while(left<right);
        return arr;
    }

}
