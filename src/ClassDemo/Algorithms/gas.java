package ClassDemo.Algorithms;

public class gas {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;

        while(i < n){
            int sumOfGas = 0;
            int sumOfCost = 0;
            int count = 0;
            while(count < n){
                int j = (i+count)%n;
                sumOfCost += cost[j];
                sumOfGas += gas[i];
                if(sumOfCost > sumOfGas){
                    break;
                }
                count ++;
            }
            if (count == n){
                return i;
            } else{
                i = i +count  +1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit((new int[] {1,2,3,4,5}), (new int[] {3,4,5,1,2})));
    }
}
