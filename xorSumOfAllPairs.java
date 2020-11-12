class xorSumOfAllPairs{

    public static void main(String[] args){
        int[] arr = {1,5,2,1,2};

        int ans = 0;

        for(int val: arr){
            ans = ans^val;
        }

        System.out.println(2*ans);
    }
}