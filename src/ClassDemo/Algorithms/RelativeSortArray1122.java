package ClassDemo.Algorithms;


import java.util.Arrays;

public class RelativeSortArray1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] newarray = new int[arr1.length];
        int index = 0;
        for(int i =0; i<arr2.length;i++){
            for(int j =0; j<arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    newarray[index] = arr2[i];
                    index ++;
                }

            }
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[] {2,1,4,3,9,6};
        int[] newarray = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(newarray));
        String test = "test";
        System.out.println(test.substring(0,5));
    }
}
