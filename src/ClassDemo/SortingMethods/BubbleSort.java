package ClassDemo.SortingMethods;

/**
 * Created by Pan on 4/11/20.
 */
public class BubbleSort {

    public static void bubblesort(int[] newlist){

        boolean needPass = true;
        for(int k=1; k<newlist.length && needPass; k++){
            needPass =false;
            for (int i=0;i<newlist.length-k;i++){
                if(newlist[i]>newlist[i+1]){
                    int temp = newlist[i];
                    newlist[i] = newlist[i+1];
                    newlist[i+1] = temp;
                    needPass =true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2,1,7,5,6};
        bubblesort(list);
        for(int n=0; n<list.length;n++){
            System.out.println(list[n] + " ");
        }
    }
}
