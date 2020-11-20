import java.util.ArrayList;
import java.util.Arrays;
class MinXORPairs{

    public static void main(String[] args){
        int[] arr= {2,0,5,7};
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++){
            int xor = arr[i]^arr[i+1];
            if(xor<min){
                min = xor;
                list = new ArrayList<>();
                list.add(arr[i]+ ", " + arr[i+1]);
            }else if(xor == min){
                list.add(arr[i]+ ", " + arr[i+1]);
            }
        }

        for(String x: list){
            System.out.println(x);
        }
    }
}