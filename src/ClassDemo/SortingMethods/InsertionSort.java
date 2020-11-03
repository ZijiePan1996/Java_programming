package ClassDemo.SortingMethods;

/**
 * Created by Pan on 3/11/20.
 */
public class InsertionSort {
    public static void InsertionSort(int[] arr){
        int j;   //已排序列表下标
        int t;   //待排序元素
        for(int i = 1; i < arr.length;i++){
            if(arr[i] < arr[i-1]){
                System.out.println(i);
                t = arr[i];
            for( j=i-1; j>=0 && arr[j]>t; j-- ){
                arr[j+1] = arr[j];
            }
            arr[j+1] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {6,2,4,5,3};
        System.out.println(String.valueOf(arr[1]));
        InsertionSort(arr);
    }
}
