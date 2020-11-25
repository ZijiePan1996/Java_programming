package ClassDemo.Algorithms;

import java.util.HashMap;


/*
    数独库依然是按照寻找重复元素的思想，使用hashmap
    去存储元素，然后记录每行，每列，每个box里的元素数量
    然后超过一次就可以返回false
    也可以用更为轻便的结构，例如int[][]，甚至byte[][]
 */
public class Suduku {
    public boolean isValidSuduku(char[][] board){
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] columns = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        for(int i =0; i < 9; i++){
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }
        for(int i = 0; i<9;i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                if(num != '.'){
                    int n = (int) num;
                    // i是横坐标，j是纵坐标；
                    int boxindex = i/3 * 3 + j/3;

                    //将当前值存入hashmap中
                    rows[i].put(n, rows[i].getOrDefault(n, 0)+1);
                    columns[j].put(n, columns[j].getOrDefault(n, 0)+1);
                    boxes[boxindex].put(n, boxes[boxindex].getOrDefault(n, 0)+1);
                    if(rows[i].get(n)>1 || columns[j].get(n)>1 || boxes[boxindex].get(n)>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
