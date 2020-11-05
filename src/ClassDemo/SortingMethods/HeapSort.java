package ClassDemo.SortingMethods;
import java.util.ArrayList;
import java.util.Random;
//import ClassDemo.datastructure.list.Arraylist;

/**
 * Created by Pan on 5/11/20.
 */
public class HeapSort<E extends Comparable<E>> {

    private ArrayList<E> list = new ArrayList<E>();

    public HeapSort(){}

    public HeapSort(E[] objects){
        for(int i=0; i<objects.length; i++){
            add(objects[i]);
        }
    }

    public int getSize(){
        return list.size();
    }

    public E getObject(int n){
        return list.get(n);
    }

    public void add(E newObject){
        list.add(newObject);
        int currentIndex = list.size() -1; //index of the last node

        while(currentIndex >0){
            int parentIndex = (currentIndex - 1)/2;

            if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
                currentIndex = parentIndex;
            } else break;

        }
    }

    public E remove(){
        if(list.size()==0){
            return null;
        }

        E removedObject = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(list.size()-1);

        int curentIndex = 0;
        while(curentIndex < list.size()){
            int leftChildIndex = 2 * curentIndex +1;
            int rightChildIndex = 2 * curentIndex +2;

            if(leftChildIndex>=list.size()){
                break;
            }

            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()){
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex))<0){
                    maxIndex = rightChildIndex;
                }
            }

            if(list.get(curentIndex).compareTo(list.get(maxIndex))<0){
                E temp = list.get(curentIndex);
                list.set(curentIndex, list.get(maxIndex));
                list.set(maxIndex, temp);
                curentIndex = maxIndex;
            } else break;
        }
        return removedObject;
    }


    public static void main(String[] args) {
        HeapSort heap = new HeapSort();
        for(int i =0;i<10;i++){
            heap.add((int)(Math.random()*100));
        }
        int k = heap.getSize();
        for(int i =0; i<k;i++){
            System.out.println(heap.remove());
        }
    }
}
