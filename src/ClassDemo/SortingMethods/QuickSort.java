package ClassDemo.SortingMethods;

/**
 * Created by Pan on 4/11/20.
 */
public class QuickSort {
    public static void sort(int a[], int low, int height){
        int i, j, index;

        if(low>height){
            return;
        }
        i = low;
        j =height;
        index = a[i];
        while(i<j){
            while(i<j && a[j] >= index)
                j--;
            if(i<j)
                a[i++] = a[j];
            while(i<j && a[i] <index)
                i++;
            if(i<j)
                a[j--] =a[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("test");
    }

}
